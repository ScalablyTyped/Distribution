package typings.officeUiFabricReact

import typings.officeUiFabricReact.modalTypesMod.IModalProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Modal", JSImport.Namespace)
@js.native
object modalMod extends js.Object {
  @js.native
  class ModalBase protected ()
    extends typings.officeUiFabricReact.modalBaseMod.ModalBase {
    def this(props: IModalProps) = this()
  }
  
  val Modal: FunctionComponent[IModalProps] = js.native
  /* static members */
  @js.native
  object ModalBase extends js.Object {
    var defaultProps: IModalProps = js.native
  }
  
}

