package typings.openfin.viewMod

import typings.openfin.eventsApplicationMod.CrashedEvent
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.openfinStrings.`view-blurred`
import typings.openfin.openfinStrings.`view-crashed`
import typings.openfin.openfinStrings.`view-created`
import typings.openfin.openfinStrings.`view-destroyed`
import typings.openfin.openfinStrings.`view-did-change-theme-color`
import typings.openfin.openfinStrings.`view-focused`
import typings.openfin.openfinStrings.`view-hidden`
import typings.openfin.openfinStrings.`view-hotkey`
import typings.openfin.openfinStrings.`view-navigation-rejected`
import typings.openfin.openfinStrings.`view-page-favicon-updated`
import typings.openfin.openfinStrings.`view-page-title-updated`
import typings.openfin.openfinStrings.`view-resource-load-failed`
import typings.openfin.openfinStrings.`view-resource-response-received`
import typings.openfin.openfinStrings.`view-shown`
import typings.openfin.openfinStrings.`view-target-changed`
import typings.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typings.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import typings.openfin.windowMod.WindowNavigationRejectedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ Type in keyof openfin.openfin/_v2/api/events/view.PropagatedViewEventMapping<string, string> ]: openfin.openfin/_v2/api/events/view.PropagatedViewEventMapping<Topic, Type>[Type]} */
@js.native
trait PropagatedViewEvents[Topic] extends js.Object {
  var listenerRemoved: String = js.native
  var newListener: String = js.native
  var `view-blurred`: (WindowEvent[Topic, typings.openfin.openfinStrings.`view-blurred`]) with PropagatedViewIdentity = js.native
  var `view-crashed`: CrashedEvent with (WindowEvent[Topic, typings.openfin.openfinStrings.`view-crashed`]) with PropagatedViewIdentity = js.native
  var `view-created`: CrashedEvent with (WindowEvent[Topic, typings.openfin.openfinStrings.`view-created`]) with PropagatedViewIdentity = js.native
  var `view-destroyed`: (WindowEvent[Topic, typings.openfin.openfinStrings.`view-destroyed`]) with PropagatedViewIdentity = js.native
  var `view-did-change-theme-color`: (WindowEvent[Topic, typings.openfin.openfinStrings.`view-did-change-theme-color`]) with PropagatedViewIdentity = js.native
  var `view-focused`: (WindowEvent[Topic, typings.openfin.openfinStrings.`view-focused`]) with PropagatedViewIdentity = js.native
  var `view-hidden`: (WindowEvent[Topic, typings.openfin.openfinStrings.`view-hidden`]) with PropagatedViewIdentity = js.native
  var `view-hotkey`: InputEvent with (WindowEvent[Topic, typings.openfin.openfinStrings.`view-hotkey`]) with PropagatedViewIdentity = js.native
  var `view-navigation-rejected`: (WindowNavigationRejectedEvent[Topic, typings.openfin.openfinStrings.`view-navigation-rejected`]) with PropagatedViewIdentity = js.native
  var `view-page-favicon-updated`: (WindowEvent[Topic, typings.openfin.openfinStrings.`view-page-favicon-updated`]) with PropagatedViewIdentity = js.native
  var `view-page-title-updated`: (WindowEvent[Topic, typings.openfin.openfinStrings.`view-page-title-updated`]) with PropagatedViewIdentity = js.native
  var `view-resource-load-failed`: (WindowResourceLoadFailedEvent[Topic, typings.openfin.openfinStrings.`view-resource-load-failed`]) with PropagatedViewIdentity = js.native
  var `view-resource-response-received`: (WindowResourceResponseReceivedEvent[Topic, typings.openfin.openfinStrings.`view-resource-response-received`]) with PropagatedViewIdentity = js.native
  var `view-shown`: (WindowEvent[Topic, typings.openfin.openfinStrings.`view-shown`]) with PropagatedViewIdentity = js.native
  var `view-target-changed`: (TargetChangedEvent[Topic, typings.openfin.openfinStrings.`view-target-changed`]) with PropagatedViewIdentity = js.native
}

object PropagatedViewEvents {
  @scala.inline
  def apply[Topic](
    listenerRemoved: String,
    newListener: String,
    `view-blurred`: (WindowEvent[Topic, `view-blurred`]) with PropagatedViewIdentity,
    `view-crashed`: CrashedEvent with (WindowEvent[Topic, `view-crashed`]) with PropagatedViewIdentity,
    `view-created`: CrashedEvent with (WindowEvent[Topic, `view-created`]) with PropagatedViewIdentity,
    `view-destroyed`: (WindowEvent[Topic, `view-destroyed`]) with PropagatedViewIdentity,
    `view-did-change-theme-color`: (WindowEvent[Topic, `view-did-change-theme-color`]) with PropagatedViewIdentity,
    `view-focused`: (WindowEvent[Topic, `view-focused`]) with PropagatedViewIdentity,
    `view-hidden`: (WindowEvent[Topic, `view-hidden`]) with PropagatedViewIdentity,
    `view-hotkey`: InputEvent with (WindowEvent[Topic, `view-hotkey`]) with PropagatedViewIdentity,
    `view-navigation-rejected`: (WindowNavigationRejectedEvent[Topic, `view-navigation-rejected`]) with PropagatedViewIdentity,
    `view-page-favicon-updated`: (WindowEvent[Topic, `view-page-favicon-updated`]) with PropagatedViewIdentity,
    `view-page-title-updated`: (WindowEvent[Topic, `view-page-title-updated`]) with PropagatedViewIdentity,
    `view-resource-load-failed`: (WindowResourceLoadFailedEvent[Topic, `view-resource-load-failed`]) with PropagatedViewIdentity,
    `view-resource-response-received`: (WindowResourceResponseReceivedEvent[Topic, `view-resource-response-received`]) with PropagatedViewIdentity,
    `view-shown`: (WindowEvent[Topic, `view-shown`]) with PropagatedViewIdentity,
    `view-target-changed`: (TargetChangedEvent[Topic, `view-target-changed`]) with PropagatedViewIdentity
  ): PropagatedViewEvents[Topic] = {
    val __obj = js.Dynamic.literal(listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any])
    __obj.updateDynamic("view-blurred")(`view-blurred`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-crashed")(`view-crashed`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-created")(`view-created`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-destroyed")(`view-destroyed`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-did-change-theme-color")(`view-did-change-theme-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-focused")(`view-focused`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-hidden")(`view-hidden`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-hotkey")(`view-hotkey`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-navigation-rejected")(`view-navigation-rejected`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-page-favicon-updated")(`view-page-favicon-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-page-title-updated")(`view-page-title-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-resource-load-failed")(`view-resource-load-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-resource-response-received")(`view-resource-response-received`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-shown")(`view-shown`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-target-changed")(`view-target-changed`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropagatedViewEvents[Topic]]
  }
  @scala.inline
  implicit class PropagatedViewEventsOps[Self <: PropagatedViewEvents[_], Topic] (val x: Self with PropagatedViewEvents[Topic]) extends AnyVal {
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
    def setListenerRemoved(value: String): Self = this.set("listenerRemoved", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewListener(value: String): Self = this.set("newListener", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-blurred`(value: (WindowEvent[Topic, `view-blurred`]) with PropagatedViewIdentity): Self = this.set("view-blurred", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-crashed`(value: CrashedEvent with (WindowEvent[Topic, `view-crashed`]) with PropagatedViewIdentity): Self = this.set("view-crashed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-created`(value: CrashedEvent with (WindowEvent[Topic, `view-created`]) with PropagatedViewIdentity): Self = this.set("view-created", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-destroyed`(value: (WindowEvent[Topic, `view-destroyed`]) with PropagatedViewIdentity): Self = this.set("view-destroyed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-did-change-theme-color`(value: (WindowEvent[Topic, `view-did-change-theme-color`]) with PropagatedViewIdentity): Self = this.set("view-did-change-theme-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-focused`(value: (WindowEvent[Topic, `view-focused`]) with PropagatedViewIdentity): Self = this.set("view-focused", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-hidden`(value: (WindowEvent[Topic, `view-hidden`]) with PropagatedViewIdentity): Self = this.set("view-hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-hotkey`(value: InputEvent with (WindowEvent[Topic, `view-hotkey`]) with PropagatedViewIdentity): Self = this.set("view-hotkey", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-navigation-rejected`(
      value: (WindowNavigationRejectedEvent[Topic, `view-navigation-rejected`]) with PropagatedViewIdentity
    ): Self = this.set("view-navigation-rejected", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-page-favicon-updated`(value: (WindowEvent[Topic, `view-page-favicon-updated`]) with PropagatedViewIdentity): Self = this.set("view-page-favicon-updated", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-page-title-updated`(value: (WindowEvent[Topic, `view-page-title-updated`]) with PropagatedViewIdentity): Self = this.set("view-page-title-updated", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-resource-load-failed`(
      value: (WindowResourceLoadFailedEvent[Topic, `view-resource-load-failed`]) with PropagatedViewIdentity
    ): Self = this.set("view-resource-load-failed", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-resource-response-received`(
      value: (WindowResourceResponseReceivedEvent[Topic, `view-resource-response-received`]) with PropagatedViewIdentity
    ): Self = this.set("view-resource-response-received", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-shown`(value: (WindowEvent[Topic, `view-shown`]) with PropagatedViewIdentity): Self = this.set("view-shown", value.asInstanceOf[js.Any])
    @scala.inline
    def `setView-target-changed`(value: (TargetChangedEvent[Topic, `view-target-changed`]) with PropagatedViewIdentity): Self = this.set("view-target-changed", value.asInstanceOf[js.Any])
  }
  
}

