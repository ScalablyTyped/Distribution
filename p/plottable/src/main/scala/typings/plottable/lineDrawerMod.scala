package typings.plottable

import typings.d3Shape.mod.Line_
import typings.plottable.canvasDrawerMod.CanvasDrawStep
import typings.plottable.svgDrawerMod.SVGDrawer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineDrawerMod {
  
  @JSImport("plottable/build/src/drawers/lineDrawer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plottable/build/src/drawers/lineDrawer", "LineSVGDrawer")
  @js.native
  open class LineSVGDrawer () extends SVGDrawer
  
  inline def makeLineCanvasDrawStep(d3LineFactory: js.Function0[Line_[Any]]): CanvasDrawStep = ^.asInstanceOf[js.Dynamic].applyDynamic("makeLineCanvasDrawStep")(d3LineFactory.asInstanceOf[js.Any]).asInstanceOf[CanvasDrawStep]
}
