package typings.openfin.mod.fin

import typings.openfin.openfinStrings.`group-changed`
import typings.openfin.openfinStrings.disband
import typings.openfin.openfinStrings.join
import typings.openfin.openfinStrings.leave
import typings.openfin.openfinStrings.merge
import typings.openfin.openfinStrings.nothing
import typings.openfin.openfinStrings.source
import typings.openfin.openfinStrings.target
import typings.openfin.openfinStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowGroupChangedEvent extends WindowBaseEvent {
  
  /**
    * Which group array the window that the event listener was registered on is included in:
    * 'source' The window is included in sourceGroup.
    * 'target' The window is included in targetGroup.
    * 'nothing' The window is not included in sourceGroup nor targetGroup.
    */
  var memberOf: source | target | nothing = js.native
  
  /**
    * The reason this event was triggered.
    * 'leave' A window has left the group due to a leave or merge with group.
    * 'join' A window has joined the group.
    * 'merge' Two groups have been merged together.
    * 'disband' There are no other windows in the group.
    */
  var reason: leave | join | merge | disband = js.native
  
  /**
    * All the windows in the group the sourceWindow originated from.
    */
  var sourceGroup: js.Array[WindowOfGroupInfo] = js.native
  
  /**
    * The UUID of the application the sourceWindow belongs to The source window is the window in which (merge/join/leave)group(s) was called.
    */
  var sourceWindowAppUuid: String = js.native
  
  /**
    * the name of the sourcewindow.The source window is the window in which(merge / join / leave) group(s) was called.
    */
  var sourceWindowName: String = js.native
  
  /**
    * All the windows in the group the targetWindow orginated from
    */
  var targetGroup: js.Array[WindowOfGroupInfo] = js.native
  
  /**
    * The UUID of the application the targetWindow belongs to. The target window is the window that was passed into (merge/join) group(s).
    */
  var targetWindowAppUuid: String = js.native
  
  /**
    * The name of the targetWindow. The target window is the window that was passed into (merge/join) group(s).
    */
  var targetWindowName: String = js.native
  
  @JSName("type")
  var type_WindowGroupChangedEvent: `group-changed` = js.native
}
object WindowGroupChangedEvent {
  
  @scala.inline
  def apply(
    memberOf: source | target | nothing,
    name: String,
    reason: leave | join | merge | disband,
    sourceGroup: js.Array[WindowOfGroupInfo],
    sourceWindowAppUuid: String,
    sourceWindowName: String,
    targetGroup: js.Array[WindowOfGroupInfo],
    targetWindowAppUuid: String,
    targetWindowName: String,
    topic: window,
    `type`: `group-changed`,
    uuid: String
  ): WindowGroupChangedEvent = {
    val __obj = js.Dynamic.literal(memberOf = memberOf.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], sourceGroup = sourceGroup.asInstanceOf[js.Any], sourceWindowAppUuid = sourceWindowAppUuid.asInstanceOf[js.Any], sourceWindowName = sourceWindowName.asInstanceOf[js.Any], targetGroup = targetGroup.asInstanceOf[js.Any], targetWindowAppUuid = targetWindowAppUuid.asInstanceOf[js.Any], targetWindowName = targetWindowName.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowGroupChangedEvent]
  }
  
  @scala.inline
  implicit class WindowGroupChangedEventMutableBuilder[Self <: WindowGroupChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMemberOf(value: source | target | nothing): Self = StObject.set(x, "memberOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: leave | join | merge | disband): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceGroup(value: js.Array[WindowOfGroupInfo]): Self = StObject.set(x, "sourceGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceGroupVarargs(value: WindowOfGroupInfo*): Self = StObject.set(x, "sourceGroup", js.Array(value :_*))
    
    @scala.inline
    def setSourceWindowAppUuid(value: String): Self = StObject.set(x, "sourceWindowAppUuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceWindowName(value: String): Self = StObject.set(x, "sourceWindowName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroup(value: js.Array[WindowOfGroupInfo]): Self = StObject.set(x, "targetGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupVarargs(value: WindowOfGroupInfo*): Self = StObject.set(x, "targetGroup", js.Array(value :_*))
    
    @scala.inline
    def setTargetWindowAppUuid(value: String): Self = StObject.set(x, "targetWindowAppUuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetWindowName(value: String): Self = StObject.set(x, "targetWindowName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `group-changed`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
