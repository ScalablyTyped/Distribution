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

object libUtilsMod {
  
  @JSImport("@pixi/text-bitmap/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def drawGlyph(
    canvas: ICanvas,
    context: ICanvasRenderingContext2D,
    metrics: TextMetrics,
    x: Double,
    y: Double,
    resolution: Double,
    style: TextStyle
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawGlyph")(canvas.asInstanceOf[js.Any], context.asInstanceOf[js.Any], metrics.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], resolution.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def extractCharCode(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("extractCharCode")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def generateFillStyle(
    canvas: ICanvas,
    context: ICanvasRenderingContext2D,
    style: TextStyle,
    resolution: Double,
    lines: js.Array[String],
    metrics: TextMetrics
  ): String | CanvasGradient | CanvasPattern = (^.asInstanceOf[js.Dynamic].applyDynamic("generateFillStyle")(canvas.asInstanceOf[js.Any], context.asInstanceOf[js.Any], style.asInstanceOf[js.Any], resolution.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], metrics.asInstanceOf[js.Any])).asInstanceOf[String | CanvasGradient | CanvasPattern]
  
  inline def resolveCharacters(chars: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveCharacters")(chars.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def resolveCharacters(chars: js.Array[String | js.Array[String]]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveCharacters")(chars.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def splitTextToCharacters(text: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitTextToCharacters")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
