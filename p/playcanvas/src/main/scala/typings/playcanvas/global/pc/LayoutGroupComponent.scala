package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new LayoutGroupComponent.
  * @property orientation - Whether the layout should run horizontally or
  * vertically. Can be:
  *
  * * {@link pc.ORIENTATION_HORIZONTAL}
  * * {@link pc.ORIENTATION_VERTICAL}
  *
  * Defaults to pc.ORIENTATION_HORIZONTAL.
  * @property reverseX - Reverses the order of children along the x axis.
  * Defaults to false.
  * @property reverseY - Reverses the order of children along the y axis.
  * Defaults to true.
  * @property alignment - Specifies the horizontal and vertical alignment of
  * child elements. Values range from 0 to 1 where [0, 0] is the bottom left and
  * [1, 1] is the top right. Defaults to [0, 1].
  * @property padding - Padding to be applied inside the container before
  * positioning any children. Specified as left, bottom, right and top values.
  * Defaults to [0, 0, 0, 0] (no padding).
  * @property spacing - Spacing to be applied between each child element.
  * Defaults to [0, 0] (no spacing).
  * @property widthFitting - Fitting logic to be applied when positioning and
  * scaling child elements. Can be:
  *
  * * {@link pc.FITTING_NONE}: Child elements will be rendered at their natural size.
  * * {@link pc.FITTING_STRETCH}: When the natural size of all child elements does not
  * fill the width of the container, children will be stretched to fit. The rules for how
  * each child will be stretched are outlined below:
  *   1. Sum the {@link pc.LayoutChildComponent#fitWidthProportion} values of each child
  * and normalize so that all values sum to 1.
  *   2. Apply the natural width of each child.
  *   3. If there is space remaining in the container, distribute it to each child based
  * on the normalized {@link pc.LayoutChildComponent#fitWidthProportion} values, but do
  * not exceed the {@link pc.LayoutChildComponent#maxWidth} of each child.
  * * {@link pc.FITTING_SHRINK}: When the natural size of all child elements overflows the
  * width of the container, children will be shrunk to fit. The rules for how each child
  * will be stretched are outlined below:
  *   1. Sum the {@link pc.LayoutChildComponent#fitWidthProportion} values of each child
  * and normalize so that all values sum to 1.
  *   2. Apply the natural width of each child.
  *   3. If the new total width of all children exceeds the available space of the
  * container, reduce each child's width proportionally based on the normalized {@link
  * pc.LayoutChildComponent#fitWidthProportion} values, but do not exceed the {@link
  * pc.LayoutChildComponent#minWidth} of each child.
  * * {@link pc.FITTING_BOTH}: Applies both STRETCH and SHRINK logic as necessary.
  *
  * Defaults to pc.FITTING_NONE.
  * @property heightFitting - Identical to {@link pc.LayoutGroupComponent#widthFitting}
  * but for the Y axis. Defaults to pc.FITTING_NONE.
  * @property wrap - Whether or not to wrap children onto a new row/column when the
  * size of the container is exceeded. Defaults to false, which means that children will be
  * be rendered in a single row (horizontal orientation) or column (vertical orientation).
  * Note that setting wrap to true makes it impossible for the {@link pc.FITTING_BOTH}
  * fitting mode to operate in any logical manner. For this reason, when wrap is true, a
  * {@link pc.LayoutGroupComponent#widthFitting} or {@link pc.LayoutGroupComponent#heightFitting}
  * mode of {@link pc.FITTING_BOTH} will be coerced to {@link pc.FITTING_STRETCH}.
  * @param system - The ComponentSystem that created
  * this Component.
  * @param entity - The Entity that this Component is attached to.
  */
@JSGlobal("pc.LayoutGroupComponent")
@js.native
class LayoutGroupComponent protected ()
  extends StObject
     with typings.playcanvas.pc.LayoutGroupComponent {
  def this(system: typings.playcanvas.pc.LayoutGroupComponentSystem, entity: typings.playcanvas.pc.Entity) = this()
}
