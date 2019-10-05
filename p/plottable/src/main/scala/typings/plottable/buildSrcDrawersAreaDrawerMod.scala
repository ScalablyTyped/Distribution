package typings.plottable

import typings.d3DashShape.d3DashShapeMod.Area
import typings.d3DashShape.d3DashShapeMod.Line
import typings.plottable.buildSrcDrawersCanvasDrawerMod.CanvasDrawStep
import typings.plottable.buildSrcDrawersSvgDrawerMod.SVGDrawer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/drawers/areaDrawer", JSImport.Namespace)
@js.native
object buildSrcDrawersAreaDrawerMod extends js.Object {
  @js.native
  class AreaSVGDrawer () extends SVGDrawer
  
  def makeAreaCanvasDrawStep(d3AreaFactory: js.Function0[Area[_]], d3LineFactory: js.Function0[Line[_]]): CanvasDrawStep = js.native
}

