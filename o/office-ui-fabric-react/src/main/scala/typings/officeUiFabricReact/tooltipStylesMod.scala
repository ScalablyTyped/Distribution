package typings.officeUiFabricReact

import typings.officeUiFabricReact.tooltipTypesMod.ITooltipStyleProps
import typings.officeUiFabricReact.tooltipTypesMod.ITooltipStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Tooltip/Tooltip.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: ITooltipStyleProps): ITooltipStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ITooltipStyles]
}
