package typings.officeUiFabricReact

import typings.officeUiFabricReact.overlayTypesMod.IOverlayProps
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Overlay/Overlay.base", JSImport.Namespace)
@js.native
object overlayBaseMod extends js.Object {
  @js.native
  class OverlayBase protected ()
    extends Component[IOverlayProps, js.Object, js.Any] {
    def this(props: IOverlayProps) = this()
    var _allowTouchBodyScroll: js.Any = js.native
    @JSName("componentDidMount")
    def componentDidMount_MOverlayBase(): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MOverlayBase(): Unit = js.native
  }
  
}

