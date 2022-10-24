package typings.nivoLegends

import typings.nivoLegends.anon.anchorLegendAnchortransla
import typings.nivoLegends.distTypesTypesMod.LegendCanvasProps
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCanvasMod {
  
  @JSImport("@nivo/legends/dist/types/canvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderContinuousColorLegendToCanvas(ctx: CanvasRenderingContext2D, param1: anchorLegendAnchortransla): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderContinuousColorLegendToCanvas")(ctx.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renderLegendToCanvas(ctx: CanvasRenderingContext2D, param1: LegendCanvasProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderLegendToCanvas")(ctx.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
