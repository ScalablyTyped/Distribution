package typings.openfin.systemMod

import typings.openfin.eventsBaseMod.ApplicationEvent
import typings.openfin.eventsBaseMod.BaseEvent
import typings.openfin.eventsBaseMod.BaseEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemEventMapping[Topic, Type] extends BaseEventMap {
  
  var `application-created`: ApplicationEvent[Topic, Type] = js.native
  
  var `desktop-icon-clicked`: ApplicationEvent[Topic, Type] = js.native
  
  var `external-window-closed`: BaseEvent[Topic, Type] = js.native
  
  var `external-window-created`: BaseEvent[Topic, Type] = js.native
  
  var `external-window-hidden`: BaseEvent[Topic, Type] = js.native
  
  var `external-window-shown`: BaseEvent[Topic, Type] = js.native
  
  var `idle-state-changed`: IdleEvent[Topic, Type] = js.native
  
  var `monitor-info-changed`: MonitorEvent[Topic, Type] = js.native
  
  var `session-changed`: SessionChangedEvent[Topic, Type] = js.native
}
object SystemEventMapping {
  
  @scala.inline
  def apply[Topic, Type](
    `application-created`: ApplicationEvent[Topic, Type],
    `desktop-icon-clicked`: ApplicationEvent[Topic, Type],
    `external-window-closed`: BaseEvent[Topic, Type],
    `external-window-created`: BaseEvent[Topic, Type],
    `external-window-hidden`: BaseEvent[Topic, Type],
    `external-window-shown`: BaseEvent[Topic, Type],
    `idle-state-changed`: IdleEvent[Topic, Type],
    listenerRemoved: String,
    `monitor-info-changed`: MonitorEvent[Topic, Type],
    newListener: String,
    `session-changed`: SessionChangedEvent[Topic, Type]
  ): SystemEventMapping[Topic, Type] = {
    val __obj = js.Dynamic.literal(listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any])
    __obj.updateDynamic("application-created")(`application-created`.asInstanceOf[js.Any])
    __obj.updateDynamic("desktop-icon-clicked")(`desktop-icon-clicked`.asInstanceOf[js.Any])
    __obj.updateDynamic("external-window-closed")(`external-window-closed`.asInstanceOf[js.Any])
    __obj.updateDynamic("external-window-created")(`external-window-created`.asInstanceOf[js.Any])
    __obj.updateDynamic("external-window-hidden")(`external-window-hidden`.asInstanceOf[js.Any])
    __obj.updateDynamic("external-window-shown")(`external-window-shown`.asInstanceOf[js.Any])
    __obj.updateDynamic("idle-state-changed")(`idle-state-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("monitor-info-changed")(`monitor-info-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("session-changed")(`session-changed`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemEventMapping[Topic, Type]]
  }
  
  @scala.inline
  implicit class SystemEventMappingOps[Self <: SystemEventMapping[_, _], Topic, Type] (val x: Self with (SystemEventMapping[Topic, Type])) extends AnyVal {
    
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
    def `setApplication-created`(value: ApplicationEvent[Topic, Type]): Self = this.set("application-created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDesktop-icon-clicked`(value: ApplicationEvent[Topic, Type]): Self = this.set("desktop-icon-clicked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setExternal-window-closed`(value: BaseEvent[Topic, Type]): Self = this.set("external-window-closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setExternal-window-created`(value: BaseEvent[Topic, Type]): Self = this.set("external-window-created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setExternal-window-hidden`(value: BaseEvent[Topic, Type]): Self = this.set("external-window-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setExternal-window-shown`(value: BaseEvent[Topic, Type]): Self = this.set("external-window-shown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setIdle-state-changed`(value: IdleEvent[Topic, Type]): Self = this.set("idle-state-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMonitor-info-changed`(value: MonitorEvent[Topic, Type]): Self = this.set("monitor-info-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSession-changed`(value: SessionChangedEvent[Topic, Type]): Self = this.set("session-changed", value.asInstanceOf[js.Any])
  }
}
