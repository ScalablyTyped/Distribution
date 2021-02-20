package typings.plottable

import typings.d3Shape.mod.Area_
import typings.d3Shape.mod.Line_
import typings.plottable.canvasDrawerMod.CanvasDrawStep
import typings.plottable.svgDrawerMod.SVGDrawer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object areaDrawerMod {
  
  @JSImport("plottable/build/src/drawers/areaDrawer", "AreaSVGDrawer")
  @js.native
  class AreaSVGDrawer () extends SVGDrawer
  
  @JSImport("plottable/build/src/drawers/areaDrawer", "makeAreaCanvasDrawStep")
  @js.native
  def makeAreaCanvasDrawStep(d3AreaFactory: js.Function0[Area_[_]], d3LineFactory: js.Function0[Line_[_]]): CanvasDrawStep = js.native
}
