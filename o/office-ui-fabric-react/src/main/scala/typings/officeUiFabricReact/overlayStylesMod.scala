package typings.officeUiFabricReact

import typings.officeUiFabricReact.overlayTypesMod.IOverlayStyleProps
import typings.officeUiFabricReact.overlayTypesMod.IOverlayStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Overlay/Overlay.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: IOverlayStyleProps): IOverlayStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IOverlayStyles]
}
