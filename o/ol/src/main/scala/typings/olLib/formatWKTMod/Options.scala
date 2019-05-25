package typings
package olLib.formatWKTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var splitCollection: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(splitCollection: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(splitCollection)) __obj.updateDynamic("splitCollection")(splitCollection)
    __obj.asInstanceOf[Options]
  }
}

