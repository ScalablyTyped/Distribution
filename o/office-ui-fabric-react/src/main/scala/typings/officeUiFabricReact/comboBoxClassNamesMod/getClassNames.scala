package typings.officeUiFabricReact.comboBoxClassNamesMod

import typings.officeUiFabricReact.PartialIComboBoxStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ComboBox/ComboBox.classNames", "getClassNames")
@js.native
object getClassNames extends js.Object {
  def apply(
    styles: PartialIComboBoxStyles,
    className: String,
    isOpen: Boolean,
    disabled: Boolean,
    required: Boolean,
    focused: Boolean,
    allowFreeForm: Boolean,
    hasErrorMessage: Boolean
  ): IComboBoxClassNames = js.native
}

