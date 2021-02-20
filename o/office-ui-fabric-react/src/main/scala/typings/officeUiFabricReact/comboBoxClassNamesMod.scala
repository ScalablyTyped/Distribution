package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialIComboBoxOptionSty
import typings.officeUiFabricReact.anon.PartialIComboBoxStyles
import typings.officeUiFabricReact.comboBoxTypesMod.IComboBoxClassNames
import typings.officeUiFabricReact.comboBoxTypesMod.IComboBoxOptionClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object comboBoxClassNamesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ComboBox/ComboBox.classNames", "getClassNames")
  @js.native
  def getClassNames(
    styles: PartialIComboBoxStyles,
    className: String,
    isOpen: Boolean,
    disabled: Boolean,
    required: Boolean,
    focused: Boolean,
    allowFreeForm: Boolean,
    hasErrorMessage: Boolean
  ): IComboBoxClassNames = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/ComboBox/ComboBox.classNames", "getComboBoxOptionClassNames")
  @js.native
  def getComboBoxOptionClassNames(styles: PartialIComboBoxOptionSty): IComboBoxOptionClassNames = js.native
}
