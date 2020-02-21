package typings.officeUiFabricReact

import typings.officeUiFabricReact.overlayTypesMod.IOverlayProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Overlay", JSImport.Namespace)
@js.native
object libOverlayMod extends js.Object {
  @js.native
  class OverlayBase protected ()
    extends typings.officeUiFabricReact.overlayMod.OverlayBase {
    def this(props: IOverlayProps) = this()
  }
  
  val Overlay: FunctionComponent[IOverlayProps] = js.native
}

