package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.EnableAutofillOnKeyPress
import typings.officeUiFabricReact.autofillTypesMod.IAutofillProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Autofill", JSImport.Namespace)
@js.native
object autofillMod extends js.Object {
  
  @js.native
  class Autofill protected ()
    extends typings.officeUiFabricReact.autofillAutofillMod.Autofill {
    def this(props: IAutofillProps) = this()
  }
  /* static members */
  @js.native
  object Autofill extends js.Object {
    
    var defaultProps: EnableAutofillOnKeyPress = js.native
  }
  
  @js.native
  class BaseAutoFill ()
    extends typings.officeUiFabricReact.autofillAutofillMod.Autofill
}
