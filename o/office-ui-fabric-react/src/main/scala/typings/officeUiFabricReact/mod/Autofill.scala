package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.anon.EnableAutofillOnKeyPress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- scala.Any because Already inherited
- scala.AnyRef because Already inherited
- typings.react.mod.DeprecatedLifecycle because Already inherited
- typings.react.mod.NewLifecycle because Already inherited
- js.Any because Already inherited
- typings.react.mod.ComponentLifecycle because Already inherited
- js.Object because Already inherited
- typings.officeUiFabricReact.autofillTypesMod.IAutofill because Already inherited
- typings.react.mod.Component because Already inherited
- typings.officeUiFabricReact.autofillAutofillMod.Autofill because Already inherited
- typings.officeUiFabricReact.baseAutoFillMod.Autofill because Inheritance from two classes. Inlined 
- typings.officeUiFabricReact.pickersMod.Autofill because Inheritance from two classes. Inlined 
- typings.officeUiFabricReact.libPickersMod.Autofill because Inheritance from two classes. Inlined  */ @JSImport("office-ui-fabric-react", "Autofill")
@js.native
class Autofill protected ()
  extends typings.officeUiFabricReact.libAutofillMod.Autofill {
  def this(props: typings.officeUiFabricReact.autofillTypesMod.IAutofillProps) = this()
}
/* static members */
object Autofill {
  
  @JSImport("office-ui-fabric-react", "Autofill")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "Autofill.defaultProps")
  @js.native
  def defaultProps: EnableAutofillOnKeyPress = js.native
  inline def defaultProps_=(x: EnableAutofillOnKeyPress): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
