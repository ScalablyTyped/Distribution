package typings.offscreencanvas

import org.scalablytyped.runtime.Instantiable0
import typings.std.CanvasCompositing
import typings.std.CanvasDrawPath
import typings.std.CanvasFillStrokeStyles
import typings.std.CanvasFilters
import typings.std.CanvasImageData
import typings.std.CanvasImageSmoothing
import typings.std.CanvasPath
import typings.std.CanvasPathDrawingStyles
import typings.std.CanvasRect
import typings.std.CanvasShadowStyles
import typings.std.CanvasState
import typings.std.CanvasText
import typings.std.CanvasTextDrawingStyles
import typings.std.CanvasTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://html.spec.whatwg.org/multipage/canvas.html#offscreencanvasrenderingcontext2d
@js.native
trait OffscreenCanvasRenderingContext2D
  extends CanvasState
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
  val canvas: OffscreenCanvas = js.native
}

@JSGlobal("OffscreenCanvasRenderingContext2D")
@js.native
object OffscreenCanvasRenderingContext2D extends Instantiable0[OffscreenCanvasRenderingContext2D]

