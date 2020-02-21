package typings.officeUiFabricReact.comboBoxTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOnRenderComboBoxLabelProps extends js.Object {
  /**
    * Accessible text for label when combobox is multiselected.
    */
  var multiselectAccessibleText: js.UndefOr[String] = js.undefined
  /**
    * Props to render the combobox.
    */
  var props: IComboBoxProps
}

object IOnRenderComboBoxLabelProps {
  @scala.inline
  def apply(props: IComboBoxProps, multiselectAccessibleText: String = null): IOnRenderComboBoxLabelProps = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    if (multiselectAccessibleText != null) __obj.updateDynamic("multiselectAccessibleText")(multiselectAccessibleText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOnRenderComboBoxLabelProps]
  }
}

