package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialIComboBoxOptionSty
import typings.officeUiFabricReact.anon.PartialIComboBoxStyles
import typings.officeUiFabricReact.comboBoxTypesMod.IComboBoxClassNames
import typings.officeUiFabricReact.comboBoxTypesMod.IComboBoxOptionClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object comboBoxClassNamesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ComboBox/ComboBox.classNames", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getClassNames(
    styles: PartialIComboBoxStyles,
    className: String,
    isOpen: Boolean,
    disabled: Boolean,
    required: Boolean,
    focused: Boolean,
    allowFreeForm: Boolean,
    hasErrorMessage: Boolean
  ): IComboBoxClassNames = (^.asInstanceOf[js.Dynamic].applyDynamic("getClassNames")(styles.asInstanceOf[js.Any], className.asInstanceOf[js.Any], isOpen.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], required.asInstanceOf[js.Any], focused.asInstanceOf[js.Any], allowFreeForm.asInstanceOf[js.Any], hasErrorMessage.asInstanceOf[js.Any])).asInstanceOf[IComboBoxClassNames]
  
  inline def getComboBoxOptionClassNames(styles: PartialIComboBoxOptionSty): IComboBoxOptionClassNames = ^.asInstanceOf[js.Dynamic].applyDynamic("getComboBoxOptionClassNames")(styles.asInstanceOf[js.Any]).asInstanceOf[IComboBoxOptionClassNames]
}
