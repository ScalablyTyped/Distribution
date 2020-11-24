package typings.plottable

import typings.plottable.canvasDrawerMod.CanvasDrawStep
import typings.plottable.canvasDrawerMod.CanvasDrawer
import typings.plottable.svgDrawerMod.SVGDrawer
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/drawers/rectangleDrawer", JSImport.Namespace)
@js.native
object rectangleDrawerMod extends js.Object {
  
  val RectangleCanvasDrawStep: CanvasDrawStep = js.native
  
  @js.native
  class RectangleCanvasDrawer protected () extends CanvasDrawer {
    def this(ctx: CanvasRenderingContext2D) = this()
  }
  
  @js.native
  class RectangleSVGDrawer () extends SVGDrawer {
    def this(_rootClassName: String) = this()
    
    var _rootClassName: js.Any = js.native
  }
}
