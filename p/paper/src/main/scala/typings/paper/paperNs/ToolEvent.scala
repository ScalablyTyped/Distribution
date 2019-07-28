package typings.paper.paperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("paper.ToolEvent")
@js.native
class ToolEvent () extends Event {
  /**
    * The number of times the mouse event was fired.
    */
  var count: Double = js.native
  /**
    * The difference between the current position and the last position of the mouse when the event was fired. In case of the mouseup event, the difference to the mousedown position is returned.
    */
  var delta: Point = js.native
  /**
    * The position of the mouse in project coordinates when the mouse button was last clicked.
    */
  var downPoint: Point = js.native
  /**
    * The item at the position of the mouse (if any). If the item is contained within one or more Group or CompoundPath items, the most top level group or compound path that it is contained within is returned.
    */
  var item: Item = js.native
  /**
    * The position of the mouse in project coordinates when the previous event was fired.
    */
  var lastPoint: Point = js.native
  /**
    * The point in the middle between lastPoint and point. This is a useful position to use when creating artwork based on the moving direction of the mouse, as returned by delta.
    */
  var middlePoint: Point = js.native
  /**
    * The position of the mouse in project coordinates when the event was fired.
    */
  var point: Point = js.native
  /**
    * The type of tool event.
    * String('mousedown', 'mouseup', 'mousemove', 'mousedrag')
    */
  var `type`: String = js.native
}

