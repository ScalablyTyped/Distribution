package typings.openfin.viewMod

import typings.openfin.eventsApplicationMod.CrashedEvent
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.webcontentsMod.CertificateErrorEvent
import typings.openfin.webcontentsMod.PageTitleUpdatedEvent
import typings.openfin.webcontentsMod.WebContentsEventMapping
import typings.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typings.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import typings.openfin.windowMod.WindowNavigationRejectedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewEventMapping[Topic, Type] extends WebContentsEventMapping[String, String] {
  
  var attached: WindowEvent[Topic, Type] = js.native
  
  var created: WindowEvent[Topic, Type] = js.native
  
  var destroyed: WindowEvent[Topic, Type] = js.native
  
  var hidden: WindowEvent[Topic, Type] = js.native
  
  var hotkey: InputEvent with (WindowEvent[Topic, Type]) = js.native
  
  var shown: WindowEvent[Topic, Type] = js.native
  
  var `target-changed`: TargetChangedEvent[Topic, Type] = js.native
}
object ViewEventMapping {
  
  @scala.inline
  def apply[Topic, Type](
    attached: WindowEvent[Topic, Type],
    blurred: WindowEvent[String, String],
    `certificate-error`: CertificateErrorEvent[String, String],
    crashed: CrashedEvent with (WindowEvent[String, String]),
    created: WindowEvent[Topic, Type],
    destroyed: WindowEvent[Topic, Type],
    `did-change-theme-color`: WindowEvent[String, String],
    focused: WindowEvent[String, String],
    `found-in-page`: WindowEvent[String, String],
    hidden: WindowEvent[Topic, Type],
    hotkey: InputEvent with (WindowEvent[Topic, Type]),
    listenerRemoved: String,
    `navigation-rejected`: WindowNavigationRejectedEvent[String, String],
    newListener: String,
    `page-favicon-updated`: WindowEvent[String, String],
    `page-title-updated`: PageTitleUpdatedEvent[String, String],
    `resource-load-failed`: WindowResourceLoadFailedEvent[String, String],
    `resource-response-received`: WindowResourceResponseReceivedEvent[String, String],
    shown: WindowEvent[Topic, Type],
    `target-changed`: TargetChangedEvent[Topic, Type]
  ): ViewEventMapping[Topic, Type] = {
    val __obj = js.Dynamic.literal(attached = attached.asInstanceOf[js.Any], blurred = blurred.asInstanceOf[js.Any], crashed = crashed.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], destroyed = destroyed.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hotkey = hotkey.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any])
    __obj.updateDynamic("certificate-error")(`certificate-error`.asInstanceOf[js.Any])
    __obj.updateDynamic("did-change-theme-color")(`did-change-theme-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("found-in-page")(`found-in-page`.asInstanceOf[js.Any])
    __obj.updateDynamic("navigation-rejected")(`navigation-rejected`.asInstanceOf[js.Any])
    __obj.updateDynamic("page-favicon-updated")(`page-favicon-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("page-title-updated")(`page-title-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("resource-load-failed")(`resource-load-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("resource-response-received")(`resource-response-received`.asInstanceOf[js.Any])
    __obj.updateDynamic("target-changed")(`target-changed`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewEventMapping[Topic, Type]]
  }
  
  @scala.inline
  implicit class ViewEventMappingOps[Self <: ViewEventMapping[_, _], Topic, Type] (val x: Self with (ViewEventMapping[Topic, Type])) extends AnyVal {
    
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
    def setAttached(value: WindowEvent[Topic, Type]): Self = this.set("attached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: WindowEvent[Topic, Type]): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyed(value: WindowEvent[Topic, Type]): Self = this.set("destroyed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: WindowEvent[Topic, Type]): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHotkey(value: InputEvent with (WindowEvent[Topic, Type])): Self = this.set("hotkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShown(value: WindowEvent[Topic, Type]): Self = this.set("shown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTarget-changed`(value: TargetChangedEvent[Topic, Type]): Self = this.set("target-changed", value.asInstanceOf[js.Any])
  }
}
