package typings.plottable.drawerMod

import typings.plottable.drawStepMod.AppliedDrawStep
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDrawer extends js.Object {
  /**
    * Mutate the surface to reflect the data being passed in. This method is responsible
    * for calling the animators at the right time and order.
    * @param data The data to be drawn.
    * @param drawSteps The draw steps that the data go through.
    */
  def draw(data: js.Array[_], drawSteps: js.Array[AppliedDrawStep]): Unit = js.native
  /**
    * Get the visual primitive for the given *data* index.
    */
  def getVisualPrimitiveAtIndex(index: Double): Element = js.native
  /**
    * Get the the last drawn visual primitives.
    */
  def getVisualPrimitives(): js.Array[Element] = js.native
  /**
    * Called when the Drawer is no longer needed - implementors may use this to cleanup
    * any resources they've created
    */
  def remove(): Unit = js.native
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
  @scala.inline
  implicit class IDrawerOps[Self <: IDrawer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDraw(value: (js.Array[_], js.Array[AppliedDrawStep]) => Unit): Self = this.set("draw", js.Any.fromFunction2(value))
    @scala.inline
    def setGetVisualPrimitiveAtIndex(value: Double => Element): Self = this.set("getVisualPrimitiveAtIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setGetVisualPrimitives(value: () => js.Array[Element]): Self = this.set("getVisualPrimitives", js.Any.fromFunction0(value))
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
  }
  
}

