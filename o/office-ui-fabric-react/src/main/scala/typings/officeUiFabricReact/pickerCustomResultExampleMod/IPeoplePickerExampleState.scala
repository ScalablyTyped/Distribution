package typings.officeUiFabricReact.pickerCustomResultExampleMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPeoplePickerExampleState extends js.Object {
  var contextualMenuTarget: js.UndefOr[HTMLElement] = js.native
  var contextualMenuVisible: js.UndefOr[Boolean] = js.native
  var isPickerDisabled: js.UndefOr[Boolean] = js.native
}

object IPeoplePickerExampleState {
  @scala.inline
  def apply(): IPeoplePickerExampleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPeoplePickerExampleState]
  }
  @scala.inline
  implicit class IPeoplePickerExampleStateOps[Self <: IPeoplePickerExampleState] (val x: Self) extends AnyVal {
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
    def setContextualMenuTarget(value: HTMLElement): Self = this.set("contextualMenuTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextualMenuTarget: Self = this.set("contextualMenuTarget", js.undefined)
    @scala.inline
    def setContextualMenuVisible(value: Boolean): Self = this.set("contextualMenuVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextualMenuVisible: Self = this.set("contextualMenuVisible", js.undefined)
    @scala.inline
    def setIsPickerDisabled(value: Boolean): Self = this.set("isPickerDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPickerDisabled: Self = this.set("isPickerDisabled", js.undefined)
  }
  
}

