package typings.openfin.mod.fin

import typings.openfin.openfinStrings.`bounds-changed`
import typings.openfin.openfinStrings.`bounds-changing`
import typings.openfin.openfinStrings.`disabled-frame-bounds-changed`
import typings.openfin.openfinStrings.`disabled-frame-bounds-changing`
import typings.openfin.openfinStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowBoundsEvent extends WindowBaseEvent {
  
  /**
    * describes what kind of change occurred.
    * 0 means a change in position.
    * 1 means a change in size.
    * 2 means a change in position and size.
    */
  var changeType: Double = js.native
  
  /**
    * true when pending changes have been applied to the window.
    */
  var deferred: Boolean = js.native
  
  /**
    * the new height of the window.
    */
  var height: Double = js.native
  
  /**
    * the left-most coordinate of the window.
    */
  var left: Double = js.native
  
  /**
    * the top-most coordinate of the window.
    */
  var top: Double = js.native
  
  @JSName("type")
  var type_WindowBoundsEvent: `bounds-changed` | `bounds-changing` | `disabled-frame-bounds-changed` | `disabled-frame-bounds-changing` = js.native
  
  /**
    * the new width of the window.
    */
  var width: Double = js.native
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
  
  @scala.inline
  implicit class WindowBoundsEventOps[Self <: WindowBoundsEvent] (val x: Self) extends AnyVal {
    
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
    def setChangeType(value: Double): Self = this.set("changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferred(value: Boolean): Self = this.set("deferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: `bounds-changed` | `bounds-changing` | `disabled-frame-bounds-changed` | `disabled-frame-bounds-changing`
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
