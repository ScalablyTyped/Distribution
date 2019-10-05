package typings.plottable

import typings.d3DashShape.d3DashShapeMod.Line
import typings.plottable.buildSrcDrawersCanvasDrawerMod.CanvasDrawStep
import typings.plottable.buildSrcDrawersSvgDrawerMod.SVGDrawer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/drawers/lineDrawer", JSImport.Namespace)
@js.native
object buildSrcDrawersLineDrawerMod extends js.Object {
  @js.native
  class LineSVGDrawer () extends SVGDrawer
  
  def makeLineCanvasDrawStep(d3LineFactory: js.Function0[Line[_]]): CanvasDrawStep = js.native
}

