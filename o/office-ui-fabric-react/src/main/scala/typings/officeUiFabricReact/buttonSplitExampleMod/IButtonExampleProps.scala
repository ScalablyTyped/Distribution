package typings.officeUiFabricReact.buttonSplitExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IButtonExampleProps extends js.Object {
  var checked: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
}

object IButtonExampleProps {
  @scala.inline
  def apply(): IButtonExampleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IButtonExampleProps]
  }
  @scala.inline
  implicit class IButtonExamplePropsOps[Self <: IButtonExampleProps] (val x: Self) extends AnyVal {
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
  }
  
}

