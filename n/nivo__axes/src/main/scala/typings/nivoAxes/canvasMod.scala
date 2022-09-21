package typings.nivoAxes

import typings.nivoAxes.anon.Axis
import typings.nivoAxes.anon.Bottom
import typings.nivoAxes.anon.Height
import typings.nivoScales.typesMod.ScaleValue
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canvasMod {
  
  @JSImport("@nivo/axes/dist/types/canvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderAxesToCanvas[X /* <: ScaleValue */, Y /* <: ScaleValue */](ctx: CanvasRenderingContext2D, hasXScaleYScaleWidthHeightTopRightBottomLeftTheme: Bottom[X, Y]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderAxesToCanvas")(ctx.asInstanceOf[js.Any], hasXScaleYScaleWidthHeightTopRightBottomLeftTheme.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renderAxisToCanvas[Value /* <: ScaleValue */](
    ctx: CanvasRenderingContext2D,
    hasAxisScaleXYLengthTicksPositionTickValuesTickSizeTickPaddingTickRotation_formatLegendLegendPositionLegendOffsetTheme: Axis[Value]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderAxisToCanvas")(ctx.asInstanceOf[js.Any], hasAxisScaleXYLengthTicksPositionTickValuesTickSizeTickPaddingTickRotation_formatLegendLegendPositionLegendOffsetTheme.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renderGridLinesToCanvas[Value /* <: ScaleValue */](ctx: CanvasRenderingContext2D, hasWidthHeightScaleAxisValues: Height[Value]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderGridLinesToCanvas")(ctx.asInstanceOf[js.Any], hasWidthHeightScaleAxisValues.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
