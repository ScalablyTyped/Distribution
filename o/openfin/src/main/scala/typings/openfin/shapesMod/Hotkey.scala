package typings.openfin.shapesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hotkey extends js.Object {
  var keys: String
  var preventDefault: js.UndefOr[Boolean] = js.undefined
}

object Hotkey {
  @scala.inline
  def apply(keys: String, preventDefault: js.UndefOr[Boolean] = js.undefined): Hotkey = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDefault)) __obj.updateDynamic("preventDefault")(preventDefault.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hotkey]
  }
}

