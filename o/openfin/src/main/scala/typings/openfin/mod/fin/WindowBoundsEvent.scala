package typings.openfin.mod.fin

import typings.openfin.openfinStrings.`bounds-changed`
import typings.openfin.openfinStrings.`bounds-changing`
import typings.openfin.openfinStrings.`disabled-frame-bounds-changed`
import typings.openfin.openfinStrings.`disabled-frame-bounds-changing`
import typings.openfin.openfinStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowBoundsEvent extends WindowBaseEvent {
  /**
    * describes what kind of change occurred.
    * 0 means a change in position.
    * 1 means a change in size.
    * 2 means a change in position and size.
    */
  var changeType: Double
  /**
    * true when pending changes have been applied to the window.
    */
  var deferred: Boolean
  /**
    * the new height of the window.
    */
  var height: Double
  /**
    * the left-most coordinate of the window.
    */
  var left: Double
  /**
    * the top-most coordinate of the window.
    */
  var top: Double
  @JSName("type")
  var type_WindowBoundsEvent: `bounds-changed` | `bounds-changing` | `disabled-frame-bounds-changed` | `disabled-frame-bounds-changing`
  /**
    * the new width of the window.
    */
  var width: Double
}

object WindowBoundsEvent {
  @scala.inline
  def apply(
    changeType: Double,
    deferred: Boolean,
    height: Double,
    left: Double,
    name: String,
    top: Double,
    topic: window,
    `type`: `bounds-changed` | `bounds-changing` | `disabled-frame-bounds-changed` | `disabled-frame-bounds-changing`,
    uuid: String,
    width: Double
  ): WindowBoundsEvent = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], deferred = deferred.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowBoundsEvent]
  }
}

