package typings.openfin.systemMod

import typings.openfin.eventsBaseMod.ApplicationEvent
import typings.openfin.eventsBaseMod.BaseEvent
import typings.openfin.eventsBaseMod.BaseEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemEventMapping[Topic, Type] extends BaseEventMap {
  var `application-created`: ApplicationEvent[Topic, Type]
  var `desktop-icon-clicked`: ApplicationEvent[Topic, Type]
  var `external-window-closed`: BaseEvent[Topic, Type]
  var `external-window-created`: BaseEvent[Topic, Type]
  var `external-window-hidden`: BaseEvent[Topic, Type]
  var `external-window-shown`: BaseEvent[Topic, Type]
  var `idle-state-changed`: IdleEvent[Topic, Type]
  var `monitor-info-changed`: MonitorEvent[Topic, Type]
  var `session-changed`: SessionChangedEvent[Topic, Type]
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
}

