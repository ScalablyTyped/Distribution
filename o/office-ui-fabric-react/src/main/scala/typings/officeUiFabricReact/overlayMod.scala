package typings.officeUiFabricReact

import typings.officeUiFabricReact.overlayTypesMod.IOverlayProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Overlay", "Overlay")
  @js.native
  val Overlay: FunctionComponent[IOverlayProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Overlay", "OverlayBase")
  @js.native
  class OverlayBase protected ()
    extends typings.officeUiFabricReact.overlayBaseMod.OverlayBase {
    def this(props: IOverlayProps) = this()
  }
}
