package typings.officeUiFabricReact

import typings.officeUiFabricReact.overlayTypesMod.IOverlayProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/Overlay", JSImport.Namespace)
@js.native
object libOverlayMod extends js.Object {
  
  val Overlay: FunctionComponent[IOverlayProps] = js.native
  
  @js.native
  class OverlayBase protected ()
    extends typings.officeUiFabricReact.overlayMod.OverlayBase {
    def this(props: IOverlayProps) = this()
  }
}
