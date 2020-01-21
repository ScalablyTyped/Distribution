package typings.officeUiFabricReact

import typings.officeUiFabricReact.overlayTypesMod.IOverlayProps
import typings.officeUiFabricReact.utilitiesMod.BaseComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Overlay/Overlay.base", JSImport.Namespace)
@js.native
object overlayBaseMod extends js.Object {
  @js.native
  class OverlayBase protected ()
    extends BaseComponent[IOverlayProps, js.Object] {
    def this(props: IOverlayProps) = this()
    var _allowTouchBodyScroll: js.Any = js.native
    @JSName("componentDidMount")
    def componentDidMount_MOverlayBase(): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MOverlayBase(): Unit = js.native
  }
  
}

