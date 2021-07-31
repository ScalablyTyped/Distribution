package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.EnableAutofillOnKeyPress
import typings.officeUiFabricReact.autofillTypesMod.IAutofillProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAutofillMod {
  
  @JSImport("office-ui-fabric-react/lib/Autofill", "Autofill")
  @js.native
  class Autofill protected ()
    extends typings.officeUiFabricReact.autofillMod.Autofill {
    def this(props: IAutofillProps) = this()
  }
  /* static members */
  object Autofill {
    
    @JSImport("office-ui-fabric-react/lib/Autofill", "Autofill")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Autofill", "Autofill.defaultProps")
    @js.native
    def defaultProps: EnableAutofillOnKeyPress = js.native
    @scala.inline
    def defaultProps_=(x: EnableAutofillOnKeyPress): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Autofill", "BaseAutoFill")
  @js.native
  class BaseAutoFill protected ()
    extends typings.officeUiFabricReact.autofillMod.BaseAutoFill {
    def this(props: IAutofillProps) = this()
  }
}
