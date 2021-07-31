package typings.officeUiFabricReact

import typings.officeUiFabricReact.overlayTypesMod.IOverlayProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOverlayMod {
  
  @JSImport("office-ui-fabric-react/lib/Overlay", "Overlay")
  @js.native
  val Overlay: FunctionComponent[IOverlayProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Overlay", "OverlayBase")
  @js.native
  class OverlayBase protected ()
    extends typings.officeUiFabricReact.overlayMod.OverlayBase {
    def this(props: IOverlayProps) = this()
  }
}
