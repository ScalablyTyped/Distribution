package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloneOptions extends js.Object {
  var shallow: js.UndefOr[scala.Boolean] = js.undefined
}

object CloneOptions {
  @scala.inline
  def apply(shallow: js.UndefOr[scala.Boolean] = js.undefined): CloneOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(shallow)) __obj.updateDynamic("shallow")(shallow)
    __obj.asInstanceOf[CloneOptions]
  }
}

