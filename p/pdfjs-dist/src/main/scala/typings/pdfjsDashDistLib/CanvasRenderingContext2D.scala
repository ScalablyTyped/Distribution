package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasRenderingContext2D
  extends CanvasState
     with CanvasTransform
     with CanvasCompositing
     with CanvasImageSmoothing
     with CanvasFillStrokeStyles
     with CanvasShadowStyles
     with CanvasFilters
     with CanvasRect
     with CanvasDrawPath
     with CanvasUserInterface
     with CanvasText
     with CanvasDrawImage
     with CanvasImageData
     with CanvasPathDrawingStyles
     with CanvasTextDrawingStyles
     with CanvasPath
     with _RenderingContext {
  val canvas: HTMLCanvasElement = js.native
}

@JSGlobal("CanvasRenderingContext2D")
@js.native
object CanvasRenderingContext2D
  extends org.scalablytyped.runtime.Instantiable0[CanvasRenderingContext2D]

