package typings.plottable

import typings.d3Shape.mod.Line_
import typings.plottable.canvasDrawerMod.CanvasDrawStep
import typings.plottable.svgDrawerMod.SVGDrawer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/drawers/lineDrawer", JSImport.Namespace)
@js.native
object lineDrawerMod extends js.Object {
  @js.native
  class LineSVGDrawer () extends SVGDrawer
  
  def makeLineCanvasDrawStep(d3LineFactory: js.Function0[Line_[_]]): CanvasDrawStep = js.native
}

