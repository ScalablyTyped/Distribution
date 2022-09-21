package typings.nivoHeatmap

import typings.nivoHeatmap.typesMod.CellCanvasRendererProps
import typings.nivoHeatmap.typesMod.HeatMapDatum
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canvasMod {
  
  @JSImport("@nivo/heatmap/dist/types/canvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderCircle[Datum /* <: HeatMapDatum */](
    ctx: CanvasRenderingContext2D,
    hasHasXYWidthHeightColorBorderColorOpacityLabelTextColorLabelBorderWidthEnableLabelsTheme: CellCanvasRendererProps[Datum]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderCircle")(ctx.asInstanceOf[js.Any], hasHasXYWidthHeightColorBorderColorOpacityLabelTextColorLabelBorderWidthEnableLabelsTheme.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renderRect[Datum /* <: HeatMapDatum */](
    ctx: CanvasRenderingContext2D,
    hasHasXYWidthHeightColorBorderColorOpacityLabelTextColorLabelBorderWidthEnableLabelsTheme: CellCanvasRendererProps[Datum]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderRect")(ctx.asInstanceOf[js.Any], hasHasXYWidthHeightColorBorderColorOpacityLabelTextColorLabelBorderWidthEnableLabelsTheme.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
