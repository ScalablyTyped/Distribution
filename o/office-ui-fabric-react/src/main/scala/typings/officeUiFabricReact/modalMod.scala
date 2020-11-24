package typings.officeUiFabricReact

import typings.officeUiFabricReact.modalTypesMod.IModalProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Modal", JSImport.Namespace)
@js.native
object modalMod extends js.Object {
  
  val Modal: FunctionComponent[IModalProps] = js.native
  
  @js.native
  class ModalBase protected ()
    extends typings.officeUiFabricReact.modalBaseMod.ModalBase {
    def this(props: IModalProps) = this()
  }
  /* static members */
  @js.native
  object ModalBase extends js.Object {
    
    var defaultProps: IModalProps = js.native
  }
}
