package typings.plottable.buildSrcDrawersDrawerMod

import typings.plottable.buildSrcDrawersDrawStepMod.AppliedDrawStep
import typings.std.Element
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
  def draw(data: js.Array[_], drawSteps: js.Array[AppliedDrawStep]): Unit
  /**
    * Get the visual primitive for the given *data* index.
    */
  def getVisualPrimitiveAtIndex(index: Double): Element
  /**
    * Get the the last drawn visual primitives.
    */
  def getVisualPrimitives(): js.Array[Element]
  /**
    * Called when the Drawer is no longer needed - implementors may use this to cleanup
    * any resources they've created
    */
  def remove(): Unit
}

object IDrawer {
  @scala.inline
  def apply(
    draw: (js.Array[_], js.Array[AppliedDrawStep]) => Unit,
    getVisualPrimitiveAtIndex: Double => Element,
    getVisualPrimitives: () => js.Array[Element],
    remove: () => Unit
  ): IDrawer = {
    val __obj = js.Dynamic.literal(draw = js.Any.fromFunction2(draw), getVisualPrimitiveAtIndex = js.Any.fromFunction1(getVisualPrimitiveAtIndex), getVisualPrimitives = js.Any.fromFunction0(getVisualPrimitives), remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[IDrawer]
  }
}

