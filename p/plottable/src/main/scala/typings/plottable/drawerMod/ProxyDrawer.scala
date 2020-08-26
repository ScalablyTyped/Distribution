package typings.plottable.drawerMod

import typings.d3Selection.mod.Selection_
import typings.plottable.canvasDrawerMod.CanvasDrawer
import typings.plottable.svgDrawerMod.SVGDrawer
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/drawers/drawer", "ProxyDrawer")
@js.native
class ProxyDrawer protected () extends IDrawer {
  /**
    * A Drawer draws svg elements based on the input Dataset.
    *
    * @constructor
    * @param _svgDrawerFactory A factory that will be invoked to create an SVGDrawer whenever useSVG is called
    * @param _canvasDrawStep The DrawStep to be fed into a new CanvasDrawer whenever useCanvas is called
    */
  def this(
    _svgDrawerFactory: js.Function0[SVGDrawer],
    _canvasDrawerFactory: js.Function1[/* ctx */ CanvasRenderingContext2D, CanvasDrawer]
  ) = this()
  var _canvasDrawerFactory: js.Any = js.native
  var _currentDrawer: js.Any = js.native
  var _svgDrawerFactory: js.Any = js.native
  def getDrawer(): IDrawer = js.native
  /**
    * Remove the old drawer and use Canvas rendering from now on.
    */
  def useCanvas(canvas: Selection_[HTMLCanvasElement, _, _, _]): Unit = js.native
  /**
    * Remove the old drawer and use SVG rendering from now on.
    */
  def useSVG(parent: Selection_[SVGElement, _, _, _]): Unit = js.native
}

