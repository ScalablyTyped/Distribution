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
  
  inline def renderContinuousColorLegendToCanvas(
    ctx: CanvasRenderingContext2D,
    hasContainerWidthContainerHeightAnchorTranslateXTranslateYScaleLengthThicknessDirection_ticksTickPositionTickSizeTickSpacingTickOverlapTickFormatTitleTitleAlignTitleOffsetTheme: anchorLegendAnchortransla
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderContinuousColorLegendToCanvas")(ctx.asInstanceOf[js.Any], hasContainerWidthContainerHeightAnchorTranslateXTranslateYScaleLengthThicknessDirection_ticksTickPositionTickSizeTickSpacingTickOverlapTickFormatTitleTitleAlignTitleOffsetTheme.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renderLegendToCanvas(
    ctx: CanvasRenderingContext2D,
    hasDataContainerWidthContainerHeightTranslateXTranslateYAnchorDirection_paddingJustifyItemsSpacingItemWidthItemHeightItemDirectionItemTextColorSymbolSizeSymbolSpacingTheme: LegendCanvasProps
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderLegendToCanvas")(ctx.asInstanceOf[js.Any], hasDataContainerWidthContainerHeightTranslateXTranslateYAnchorDirection_paddingJustifyItemsSpacingItemWidthItemHeightItemDirectionItemTextColorSymbolSizeSymbolSpacingTheme.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
