package typings.openfin.mod.fin

import typings.openfin.openfinStrings.`bounds-changed`
import typings.openfin.openfinStrings.`bounds-changing`
import typings.openfin.openfinStrings.`disabled-frame-bounds-changed`
import typings.openfin.openfinStrings.`disabled-frame-bounds-changing`
import typings.openfin.openfinStrings.window
import org.scalablytyped.runtime.StObject
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
  implicit class WindowBoundsEventMutableBuilder[Self <: WindowBoundsEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeType(value: Double): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferred(value: Boolean): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: `bounds-changed` | `bounds-changing` | `disabled-frame-bounds-changed` | `disabled-frame-bounds-changing`
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
