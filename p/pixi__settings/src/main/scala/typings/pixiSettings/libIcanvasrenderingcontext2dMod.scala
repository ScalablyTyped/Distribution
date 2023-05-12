package typings.pixiSettings

import typings.pixiSettings.libIcanvasMod.ICanvas
import typings.std.CanvasCompositing
import typings.std.CanvasDrawImage
import typings.std.CanvasDrawPath
import typings.std.CanvasFillStrokeStyles
import typings.std.CanvasFilters
import typings.std.CanvasImageData
import typings.std.CanvasImageSmoothing
import typings.std.CanvasPath
import typings.std.CanvasPathDrawingStyles
import typings.std.CanvasPattern
import typings.std.CanvasRect
import typings.std.CanvasShadowStyles
import typings.std.CanvasState
import typings.std.CanvasText
import typings.std.CanvasTextDrawingStyles
import typings.std.CanvasTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIcanvasrenderingcontext2dMod {
  
  @js.native
  trait ICanvasRenderingContext2D
    extends StObject
       with CanvasState
       with CanvasTransform
       with CanvasCompositing
       with CanvasImageSmoothing
       with CanvasFillStrokeStyles
       with CanvasShadowStyles
       with CanvasFilters
       with CanvasRect
       with CanvasDrawPath
       with CanvasText
       with CanvasDrawImage
       with CanvasImageData
       with CanvasPathDrawingStyles
       with CanvasTextDrawingStyles
       with CanvasPath {
    
    def createPattern(image: ICanvas): CanvasPattern | Null = js.native
    def createPattern(image: ICanvas, repetition: String): CanvasPattern | Null = js.native
    
    def drawImage(image: ICanvas, dx: Double, dy: Double): Unit = js.native
    def drawImage(image: ICanvas, dx: Double, dy: Double, dw: Double, dh: Double): Unit = js.native
    def drawImage(
      image: ICanvas,
      sx: Double,
      sy: Double,
      sw: Double,
      sh: Double,
      dx: Double,
      dy: Double,
      dw: Double,
      dh: Double
    ): Unit = js.native
    
    var letterSpacing: js.UndefOr[String] = js.native
    
    var textLetterSpacing: js.UndefOr[String] = js.native
  }
}
