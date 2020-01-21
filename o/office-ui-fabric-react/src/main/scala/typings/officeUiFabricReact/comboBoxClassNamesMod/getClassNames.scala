package typings.officeUiFabricReact.comboBoxClassNamesMod

import typings.officeUiFabricReact.comboBoxTypesMod.IComboBoxStyles
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ComboBox/ComboBox.classNames", "getClassNames")
@js.native
object getClassNames extends js.Object {
  def apply(
    styles: Partial[IComboBoxStyles],
    className: String,
    isOpen: Boolean,
    disabled: Boolean,
    required: Boolean,
    focused: Boolean,
    allowFreeForm: Boolean,
    hasErrorMessage: Boolean
  ): IComboBoxClassNames = js.native
}

