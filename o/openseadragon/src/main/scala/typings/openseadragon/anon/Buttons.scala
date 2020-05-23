package typings.openseadragon.anon

import typings.openseadragon.mod.Button
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buttons extends js.Object {
  var buttons: js.Array[Button]
  var element: js.UndefOr[typings.std.Element] = js.undefined
}

object Buttons {
  @scala.inline
  def apply(buttons: js.Array[Button], element: typings.std.Element = null): Buttons = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buttons]
  }
}

