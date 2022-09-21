package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.EnableAutofillOnKeyPress
import typings.officeUiFabricReact.autofillTypesMod.IAutofillProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseAutoFillMod {
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/AutoFill/BaseAutoFill", "Autofill")
  @js.native
  open class Autofill protected ()
    extends typings.officeUiFabricReact.autofillAutofillMod.Autofill {
    def this(props: IAutofillProps) = this()
  }
  /* static members */
  object Autofill {
    
    @JSImport("office-ui-fabric-react/lib/components/pickers/AutoFill/BaseAutoFill", "Autofill")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/pickers/AutoFill/BaseAutoFill", "Autofill.defaultProps")
    @js.native
    def defaultProps: EnableAutofillOnKeyPress = js.native
    inline def defaultProps_=(x: EnableAutofillOnKeyPress): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/AutoFill/BaseAutoFill", "BaseAutoFill")
  @js.native
  open class BaseAutoFill protected ()
    extends typings.officeUiFabricReact.autofillAutofillMod.BaseAutoFill {
    def this(props: IAutofillProps) = this()
  }
}
