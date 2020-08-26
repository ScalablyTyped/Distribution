package typings.openseadragon.anon

import typings.openseadragon.mod.Button
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Buttons extends js.Object {
  var buttons: js.Array[Button] = js.native
  var element: js.UndefOr[typings.std.Element] = js.native
}

object Buttons {
  @scala.inline
  def apply(buttons: js.Array[Button]): Buttons = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buttons]
  }
  @scala.inline
  implicit class ButtonsOps[Self <: Buttons] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setButtonsVarargs(value: Button*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[Button]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def setElement(value: typings.std.Element): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
  }
  
}

