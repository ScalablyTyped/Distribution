package typings.openfin.viewMod

import typings.openfin.eventsApplicationMod.CrashedEvent
import typings.openfin.eventsBaseMod.BaseEventMap
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typings.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import typings.openfin.windowMod.WindowNavigationRejectedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropagatedViewEventMapping[Topic, Type] extends BaseEventMap {
  
  var `view-blurred`: (WindowEvent[Topic, Type]) with PropagatedViewIdentity = js.native
  
  var `view-crashed`: CrashedEvent with (WindowEvent[Topic, Type]) with PropagatedViewIdentity = js.native
  
  var `view-created`: CrashedEvent with (WindowEvent[Topic, Type]) with PropagatedViewIdentity = js.native
  
  var `view-destroyed`: (WindowEvent[Topic, Type]) with PropagatedViewIdentity = js.native
  
  var `view-did-change-theme-color`: (WindowEvent[Topic, Type]) with PropagatedViewIdentity = js.native
  
  var `view-focused`: (WindowEvent[Topic, Type]) with PropagatedViewIdentity = js.native
  
  var `view-hidden`: (WindowEvent[Topic, Type]) with PropagatedViewIdentity = js.native
  
  var `view-hotkey`: InputEvent with (WindowEvent[Topic, Type]) with PropagatedViewIdentity = js.native
  
  var `view-navigation-rejected`: (WindowNavigationRejectedEvent[Topic, Type]) with PropagatedViewIdentity = js.native
  
  var `view-page-favicon-updated`: (WindowEvent[Topic, Type]) with PropagatedViewIdentity = js.native
  
  var `view-page-title-updated`: (WindowEvent[Topic, Type]) with PropagatedViewIdentity = js.native
  
  var `view-resource-load-failed`: (WindowResourceLoadFailedEvent[Topic, Type]) with PropagatedViewIdentity = js.native
  
  var `view-resource-response-received`: (WindowResourceResponseReceivedEvent[Topic, Type]) with PropagatedViewIdentity = js.native
  
  var `view-shown`: (WindowEvent[Topic, Type]) with PropagatedViewIdentity = js.native
  
  var `view-target-changed`: (TargetChangedEvent[Topic, Type]) with PropagatedViewIdentity = js.native
}
object PropagatedViewEventMapping {
  
  @scala.inline
  def apply[Topic, Type](
    listenerRemoved: String,
    newListener: String,
    `view-blurred`: (WindowEvent[Topic, Type]) with PropagatedViewIdentity,
    `view-crashed`: CrashedEvent with (WindowEvent[Topic, Type]) with PropagatedViewIdentity,
    `view-created`: CrashedEvent with (WindowEvent[Topic, Type]) with PropagatedViewIdentity,
    `view-destroyed`: (WindowEvent[Topic, Type]) with PropagatedViewIdentity,
    `view-did-change-theme-color`: (WindowEvent[Topic, Type]) with PropagatedViewIdentity,
    `view-focused`: (WindowEvent[Topic, Type]) with PropagatedViewIdentity,
    `view-hidden`: (WindowEvent[Topic, Type]) with PropagatedViewIdentity,
    `view-hotkey`: InputEvent with (WindowEvent[Topic, Type]) with PropagatedViewIdentity,
    `view-navigation-rejected`: (WindowNavigationRejectedEvent[Topic, Type]) with PropagatedViewIdentity,
    `view-page-favicon-updated`: (WindowEvent[Topic, Type]) with PropagatedViewIdentity,
    `view-page-title-updated`: (WindowEvent[Topic, Type]) with PropagatedViewIdentity,
    `view-resource-load-failed`: (WindowResourceLoadFailedEvent[Topic, Type]) with PropagatedViewIdentity,
    `view-resource-response-received`: (WindowResourceResponseReceivedEvent[Topic, Type]) with PropagatedViewIdentity,
    `view-shown`: (WindowEvent[Topic, Type]) with PropagatedViewIdentity,
    `view-target-changed`: (TargetChangedEvent[Topic, Type]) with PropagatedViewIdentity
  ): PropagatedViewEventMapping[Topic, Type] = {
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
    __obj.asInstanceOf[PropagatedViewEventMapping[Topic, Type]]
  }
  
  @scala.inline
  implicit class PropagatedViewEventMappingOps[Self <: PropagatedViewEventMapping[_, _], Topic, Type] (val x: Self with (PropagatedViewEventMapping[Topic, Type])) extends AnyVal {
    
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
    def `setView-blurred`(value: (WindowEvent[Topic, Type]) with PropagatedViewIdentity): Self = this.set("view-blurred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-crashed`(value: CrashedEvent with (WindowEvent[Topic, Type]) with PropagatedViewIdentity): Self = this.set("view-crashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-created`(value: CrashedEvent with (WindowEvent[Topic, Type]) with PropagatedViewIdentity): Self = this.set("view-created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-destroyed`(value: (WindowEvent[Topic, Type]) with PropagatedViewIdentity): Self = this.set("view-destroyed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-did-change-theme-color`(value: (WindowEvent[Topic, Type]) with PropagatedViewIdentity): Self = this.set("view-did-change-theme-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-focused`(value: (WindowEvent[Topic, Type]) with PropagatedViewIdentity): Self = this.set("view-focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-hidden`(value: (WindowEvent[Topic, Type]) with PropagatedViewIdentity): Self = this.set("view-hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-hotkey`(value: InputEvent with (WindowEvent[Topic, Type]) with PropagatedViewIdentity): Self = this.set("view-hotkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-navigation-rejected`(value: (WindowNavigationRejectedEvent[Topic, Type]) with PropagatedViewIdentity): Self = this.set("view-navigation-rejected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-page-favicon-updated`(value: (WindowEvent[Topic, Type]) with PropagatedViewIdentity): Self = this.set("view-page-favicon-updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-page-title-updated`(value: (WindowEvent[Topic, Type]) with PropagatedViewIdentity): Self = this.set("view-page-title-updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-resource-load-failed`(value: (WindowResourceLoadFailedEvent[Topic, Type]) with PropagatedViewIdentity): Self = this.set("view-resource-load-failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-resource-response-received`(value: (WindowResourceResponseReceivedEvent[Topic, Type]) with PropagatedViewIdentity): Self = this.set("view-resource-response-received", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-shown`(value: (WindowEvent[Topic, Type]) with PropagatedViewIdentity): Self = this.set("view-shown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-target-changed`(value: (TargetChangedEvent[Topic, Type]) with PropagatedViewIdentity): Self = this.set("view-target-changed", value.asInstanceOf[js.Any])
  }
}
