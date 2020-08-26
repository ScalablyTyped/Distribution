package typings.officeUiFabricReact.tagPickerBasicExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITagPickerDemoPageState extends js.Object {
  var isPickerDisabled: js.UndefOr[Boolean] = js.native
}

object ITagPickerDemoPageState {
  @scala.inline
  def apply(): ITagPickerDemoPageState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITagPickerDemoPageState]
  }
  @scala.inline
  implicit class ITagPickerDemoPageStateOps[Self <: ITagPickerDemoPageState] (val x: Self) extends AnyVal {
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
    def setIsPickerDisabled(value: Boolean): Self = this.set("isPickerDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPickerDisabled: Self = this.set("isPickerDisabled", js.undefined)
  }
  
}

