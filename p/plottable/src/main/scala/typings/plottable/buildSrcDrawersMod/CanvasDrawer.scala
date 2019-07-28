package typings.plottable.buildSrcDrawersMod

import typings.plottable.buildSrcDrawersCanvasDrawerMod.CanvasDrawStep
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/drawers", "CanvasDrawer")
@js.native
class CanvasDrawer protected ()
  extends typings.plottable.buildSrcDrawersCanvasDrawerMod.CanvasDrawer {
  /**
    * @param _context The context for a canvas that this drawer will draw to.
    * @param _drawStep The draw step logic that actually draws.
    */
  def this(_context: CanvasRenderingContext2D, _drawStep: CanvasDrawStep) = this()
}

