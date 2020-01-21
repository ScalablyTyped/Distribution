package typings.officeUiFabricReact

import typings.officeUiFabricReact.autofillTypesMod.IAutofillProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/pickers/AutoFill/BaseAutoFill", JSImport.Namespace)
@js.native
object baseAutoFillMod extends js.Object {
  @js.native
  class Autofill protected ()
    extends typings.officeUiFabricReact.autofillAutofillMod.Autofill {
    def this(props: IAutofillProps) = this()
  }
  
  @js.native
  class BaseAutoFill ()
    extends typings.officeUiFabricReact.autofillAutofillMod.Autofill
  
  /* static members */
  @js.native
  object Autofill extends js.Object {
    var defaultProps: AnonEnableAutofillOnKeyPress = js.native
  }
  
}

