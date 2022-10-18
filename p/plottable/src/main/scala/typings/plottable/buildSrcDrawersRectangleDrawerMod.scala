package typings.plottable

import typings.plottable.buildSrcDrawersCanvasDrawerMod.CanvasDrawStep
import typings.plottable.buildSrcDrawersCanvasDrawerMod.CanvasDrawer
import typings.plottable.buildSrcDrawersSvgDrawerMod.SVGDrawer
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcDrawersRectangleDrawerMod {
  
  @JSImport("plottable/build/src/drawers/rectangleDrawer", "RectangleCanvasDrawStep")
  @js.native
  val RectangleCanvasDrawStep: CanvasDrawStep = js.native
  
  @JSImport("plottable/build/src/drawers/rectangleDrawer", "RectangleCanvasDrawer")
  @js.native
  open class RectangleCanvasDrawer protected () extends CanvasDrawer {
    def this(ctx: CanvasRenderingContext2D) = this()
  }
  
  @JSImport("plottable/build/src/drawers/rectangleDrawer", "RectangleSVGDrawer")
  @js.native
  open class RectangleSVGDrawer () extends SVGDrawer {
    def this(_rootClassName: String) = this()
    
    /* private */ var _rootClassName: Any = js.native
  }
}
