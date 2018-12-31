package typings
package plottableLib.buildSrcDrawersDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDrawer extends js.Object {
  /**
    * Mutate the surface to reflect the data being passed in. This method is responsible
    * for calling the animators at the right time and order.
    * @param data The data to be drawn.
    * @param drawSteps The draw steps that the data go through.
    */
  def draw(data: js.Array[_], drawSteps: js.Array[plottableLib.buildSrcDrawersDrawStepMod.AppliedDrawStep]): scala.Unit
  /**
    * Get the visual primitive for the given *data* index.
    */
  def getVisualPrimitiveAtIndex(index: scala.Double): stdLib.Element
  /**
    * Get the the last drawn visual primitives.
    */
  def getVisualPrimitives(): js.Array[stdLib.Element]
  /**
    * Called when the Drawer is no longer needed - implementors may use this to cleanup
    * any resources they've created
    */
  def remove(): scala.Unit
}

