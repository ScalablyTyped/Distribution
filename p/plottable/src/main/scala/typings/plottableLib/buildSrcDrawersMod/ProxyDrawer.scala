package typings
package plottableLib.buildSrcDrawersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/drawers", "ProxyDrawer")
@js.native
class ProxyDrawer protected ()
  extends plottableLib.buildSrcDrawersDrawerMod.ProxyDrawer {
  /**
    * A Drawer draws svg elements based on the input Dataset.
    *
    * @constructor
    * @param _svgDrawerFactory A factory that will be invoked to create an SVGDrawer whenever useSVG is called
    * @param _canvasDrawStep The DrawStep to be fed into a new CanvasDrawer whenever useCanvas is called
    */
  def this(_svgDrawerFactory: js.Function0[plottableLib.buildSrcDrawersSvgDrawerMod.SVGDrawer], _canvasDrawerFactory: js.Function1[
      /* ctx */ stdLib.CanvasRenderingContext2D, 
      plottableLib.buildSrcDrawersCanvasDrawerMod.CanvasDrawer
    ]) = this()
}

