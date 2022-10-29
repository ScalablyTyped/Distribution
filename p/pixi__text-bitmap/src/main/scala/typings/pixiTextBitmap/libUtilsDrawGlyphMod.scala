package typings.pixiTextBitmap

import typings.pixiSettings.libIcanvasMod.ICanvas
import typings.pixiSettings.libIcanvasrenderingcontext2dMod.ICanvasRenderingContext2D
import typings.pixiText.mod.TextMetrics
import typings.pixiText.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsDrawGlyphMod {
  
  @JSImport("@pixi/text-bitmap/lib/utils/drawGlyph", JSImport.Namespace)
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
}
