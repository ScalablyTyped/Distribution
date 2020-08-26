package typings.officeUiFabricReact.comboBoxTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOnRenderComboBoxLabelProps extends js.Object {
  /**
    * Accessible text for label when combobox is multiselected.
    */
  var multiselectAccessibleText: js.UndefOr[String] = js.native
  /**
    * Props to render the combobox.
    */
  var props: IComboBoxProps = js.native
}

object IOnRenderComboBoxLabelProps {
  @scala.inline
  def apply(props: IComboBoxProps): IOnRenderComboBoxLabelProps = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOnRenderComboBoxLabelProps]
  }
  @scala.inline
  implicit class IOnRenderComboBoxLabelPropsOps[Self <: IOnRenderComboBoxLabelProps] (val x: Self) extends AnyVal {
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
    def setProps(value: IComboBoxProps): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiselectAccessibleText(value: String): Self = this.set("multiselectAccessibleText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiselectAccessibleText: Self = this.set("multiselectAccessibleText", js.undefined)
  }
  
}

