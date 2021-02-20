package typings.plottable

import typings.d3Shape.mod.Line_
import typings.plottable.canvasDrawerMod.CanvasDrawStep
import typings.plottable.svgDrawerMod.SVGDrawer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineDrawerMod {
  
  @JSImport("plottable/build/src/drawers/lineDrawer", "LineSVGDrawer")
  @js.native
  class LineSVGDrawer () extends SVGDrawer
  
  @JSImport("plottable/build/src/drawers/lineDrawer", "makeLineCanvasDrawStep")
  @js.native
  def makeLineCanvasDrawStep(d3LineFactory: js.Function0[Line_[_]]): CanvasDrawStep = js.native
}
