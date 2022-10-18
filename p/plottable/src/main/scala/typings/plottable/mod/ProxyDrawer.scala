package typings.plottable.mod

import typings.plottable.buildSrcDrawersCanvasDrawerMod.CanvasDrawer
import typings.plottable.buildSrcDrawersSvgDrawerMod.SVGDrawer
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable", "ProxyDrawer")
@js.native
open class ProxyDrawer protected ()
  extends typings.plottable.buildSrcDrawersDrawerMod.ProxyDrawer {
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
}
