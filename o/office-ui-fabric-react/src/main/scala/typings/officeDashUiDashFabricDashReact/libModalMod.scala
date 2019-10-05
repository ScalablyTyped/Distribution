package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libComponentsModalModalDotTypesMod.IModalProps
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Modal", JSImport.Namespace)
@js.native
object libModalMod extends js.Object {
  @js.native
  class ModalBase protected ()
    extends typings.officeDashUiDashFabricDashReact.libComponentsModalMod.ModalBase {
    def this(props: IModalProps) = this()
  }
  
  val Modal: StatelessComponent[IModalProps] = js.native
  val default: StatelessComponent[IModalProps] = js.native
  /* static members */
  @js.native
  object ModalBase extends js.Object {
    var defaultProps: IModalProps = js.native
  }
  
}

