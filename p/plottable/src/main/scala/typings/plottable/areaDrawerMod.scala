package typings.plottable

import typings.d3Shape.mod.Area_
import typings.d3Shape.mod.Line_
import typings.plottable.canvasDrawerMod.CanvasDrawStep
import typings.plottable.svgDrawerMod.SVGDrawer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object areaDrawerMod {
  
  @JSImport("plottable/build/src/drawers/areaDrawer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("plottable/build/src/drawers/areaDrawer", "AreaSVGDrawer")
  @js.native
  class AreaSVGDrawer () extends SVGDrawer
  
  inline def makeAreaCanvasDrawStep(d3AreaFactory: js.Function0[Area_[js.Any]], d3LineFactory: js.Function0[Line_[js.Any]]): CanvasDrawStep = (^.asInstanceOf[js.Dynamic].applyDynamic("makeAreaCanvasDrawStep")(d3AreaFactory.asInstanceOf[js.Any], d3LineFactory.asInstanceOf[js.Any])).asInstanceOf[CanvasDrawStep]
}
