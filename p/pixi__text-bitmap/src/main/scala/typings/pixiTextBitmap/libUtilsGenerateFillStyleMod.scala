package typings.pixiTextBitmap

import typings.pixiSettings.libIcanvasMod.ICanvas
import typings.pixiSettings.libIcanvasrenderingcontext2dMod.ICanvasRenderingContext2D
import typings.pixiText.mod.TextMetrics
import typings.pixiText.mod.TextStyle
import typings.std.CanvasGradient
import typings.std.CanvasPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsGenerateFillStyleMod {
  
  @JSImport("@pixi/text-bitmap/lib/utils/generateFillStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateFillStyle(
    canvas: ICanvas,
    context: ICanvasRenderingContext2D,
    style: TextStyle,
    resolution: Double,
    lines: js.Array[String],
    metrics: TextMetrics
  ): String | CanvasGradient | CanvasPattern = (^.asInstanceOf[js.Dynamic].applyDynamic("generateFillStyle")(canvas.asInstanceOf[js.Any], context.asInstanceOf[js.Any], style.asInstanceOf[js.Any], resolution.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], metrics.asInstanceOf[js.Any])).asInstanceOf[String | CanvasGradient | CanvasPattern]
}
