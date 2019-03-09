package typings
package offscreencanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://html.spec.whatwg.org/multipage/canvas.html#offscreencanvasrenderingcontext2d
@js.native
trait OffscreenCanvasRenderingContext2D
  extends stdLib.CanvasState
     with stdLib.CanvasTransform
     with stdLib.CanvasCompositing
     with stdLib.CanvasImageSmoothing
     with stdLib.CanvasFillStrokeStyles
     with stdLib.CanvasShadowStyles
     with stdLib.CanvasFilters
     with stdLib.CanvasRect
     with stdLib.CanvasDrawPath
     with stdLib.CanvasText
     with CanvasDrawImage
     with stdLib.CanvasImageData
     with stdLib.CanvasPathDrawingStyles
     with stdLib.CanvasTextDrawingStyles
     with stdLib.CanvasPath {
  val canvas: OffscreenCanvas = js.native
}

@JSGlobal("OffscreenCanvasRenderingContext2D")
@js.native
object OffscreenCanvasRenderingContext2D
  extends org.scalablytyped.runtime.Instantiable0[OffscreenCanvasRenderingContext2D]

