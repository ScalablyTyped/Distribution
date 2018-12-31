package typings
package plottableLib.buildSrcDrawersCanvasDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/drawers/canvasDrawer", "CanvasDrawer")
@js.native
class CanvasDrawer protected ()
  extends plottableLib.buildSrcDrawersDrawerMod.IDrawer {
  /**
    * @param _context The context for a canvas that this drawer will draw to.
    * @param _drawStep The draw step logic that actually draws.
    */
  def this(_context: d3DashShapeLib.d3DashShapeMod.Global.CanvasRenderingContext2D, _drawStep: CanvasDrawStep) = this()
  var _context: js.Any = js.native
  var _drawStep: js.Any = js.native
  /**
    * Mutate the surface to reflect the data being passed in. This method is responsible
    * for calling the animators at the right time and order.
    * @param data The data to be drawn.
    * @param drawSteps The draw steps that the data go through.
    */
  /* CompleteClass */
  override def draw(data: js.Array[_], drawSteps: js.Array[plottableLib.buildSrcDrawersDrawStepMod.AppliedDrawStep]): scala.Unit = js.native
  def getDrawStep(): CanvasDrawStep = js.native
  /**
    * Get the visual primitive for the given *data* index.
    */
  /* CompleteClass */
  override def getVisualPrimitiveAtIndex(index: scala.Double): stdLib.Element = js.native
  /**
    * Get the the last drawn visual primitives.
    */
  /* CompleteClass */
  override def getVisualPrimitives(): js.Array[stdLib.Element] = js.native
  /**
    * Called when the Drawer is no longer needed - implementors may use this to cleanup
    * any resources they've created
    */
  /* CompleteClass */
  override def remove(): scala.Unit = js.native
}

