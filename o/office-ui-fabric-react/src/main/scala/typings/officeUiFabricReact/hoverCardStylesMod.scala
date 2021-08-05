package typings.officeUiFabricReact

import typings.officeUiFabricReact.hoverCardTypesMod.IHoverCardStyleProps
import typings.officeUiFabricReact.hoverCardTypesMod.IHoverCardStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hoverCardStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/HoverCard/HoverCard.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: IHoverCardStyleProps): IHoverCardStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IHoverCardStyles]
}
