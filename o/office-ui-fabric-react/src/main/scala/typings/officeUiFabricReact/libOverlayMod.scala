package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsOverlayOverlayDottypesMod.IOverlayProps
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
  open class OverlayBase protected ()
    extends typings.officeUiFabricReact.libComponentsOverlayMod.OverlayBase {
    def this(props: IOverlayProps) = this()
  }
}
