package typings.officeDashUiDashFabricDashReact.libComponentsComboBoxComboBoxDotClassNamesMod

import typings.officeDashUiDashFabricDashReact.libComponentsComboBoxComboBoxDotTypesMod.IComboBoxOptionStyles
import typings.officeDashUiDashFabricDashReact.libComponentsComboBoxComboBoxDotTypesMod.IComboBoxStyles
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ComboBox/ComboBox.classNames", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getClassNames(
    styles: Partial[IComboBoxStyles],
    className: String,
    isOpen: Boolean,
    disabled: Boolean,
    required: Boolean,
    focused: Boolean,
    allowFreeForm: Boolean,
    hasErrorMessage: Boolean
  ): IComboBoxClassNames = js.native
  def getComboBoxOptionClassNames(styles: Partial[IComboBoxOptionStyles]): IComboBoxOptionClassNames = js.native
}

