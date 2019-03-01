package typings
package osDashLocaleLib.osDashLocaleMod.osLocaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var spawn: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(spawn: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(spawn)) __obj.updateDynamic("spawn")(spawn)
    __obj.asInstanceOf[Options]
  }
}

