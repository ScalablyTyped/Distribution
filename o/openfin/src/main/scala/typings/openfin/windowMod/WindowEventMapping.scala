package typings.openfin.windowMod

import typings.openfin.eventsApplicationMod.CrashedEvent
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.viewMod.InputEvent
import typings.openfin.webcontentsMod.CertificateErrorEvent
import typings.openfin.webcontentsMod.PageTitleUpdatedEvent
import typings.openfin.webcontentsMod.WebContentsEventMapping
import typings.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typings.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowEventMapping[Topic, Type]
  extends StObject
     with WebContentsEventMapping[String, String] {
  
  var `auth-requested`: WindowAuthRequestedEvent[Topic, Type]
  
  var `begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, Type]
  
  var `bounds-changed`: WindowBoundsChange[Topic, Type]
  
  var `bounds-changing`: WindowBoundsChange[Topic, Type]
  
  var `close-requested`: WindowEvent[Topic, Type]
  
  var closed: WindowEvent[Topic, Type]
  
  var closing: WindowEvent[Topic, Type]
  
  var `disabled-movement-bounds-changed`: WindowBoundsChange[Topic, Type]
  
  var `disabled-movement-bounds-changing`: WindowBoundsChange[Topic, Type]
  
  var embedded: WindowEvent[Topic, Type]
  
  var `end-user-bounds-changing`: WindowEndBoundsChangingEvent[Topic, Type]
  
  var `external-process-exited`: WindowExternalProcessExitedEvent[Topic, Type]
  
  var `external-process-started`: WindowExternalProcessStartedEvent[Topic, Type]
  
  var `group-changed`: WindowGroupChanged[Topic, Type]
  
  var hidden: WindowHiddenEvent[Topic, Type]
  
  var hotkey: InputEvent & (WindowEvent[Topic, Type])
  
  var initialized: WindowEvent[Topic, Type]
  
  var `layout-initialized`: WindowEvent[Topic, Type]
  
  var `layout-ready`: WindowEvent[Topic, Type]
  
  var maximized: WindowEvent[Topic, Type]
  
  var minimized: WindowEvent[Topic, Type]
  
  var `options-changed`: WindowOptionsChangedEvent[Topic, Type]
  
  var `performance-report`: WindowPerformanceReport[Topic, Type]
  
  var `preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[Topic, Type]
  
  var `preload-scripts-state-changing`: WindowPreloadScriptsStateChangeEvent[Topic, Type]
  
  var reloaded: WindowReloadedEvent[Topic, Type]
  
  var restored: WindowEvent[Topic, Type]
  
  var `show-requested`: WindowEvent[Topic, Type]
  
  var shown: WindowEvent[Topic, Type]
  
  var `user-movement-disabled`: WindowEvent[Topic, Type]
  
  var `user-movement-enabled`: WindowEvent[Topic, Type]
  
  var `view-attached`: WindowEvent[Topic, Type]
  
  var `view-detached`: ViewDetached[Topic, Type]
  
  var `will-move`: WillMoveOrResize[Topic, Type]
  
  var `will-resize`: WillMoveOrResize[Topic, Type]
}
object WindowEventMapping {
  
  @scala.inline
  def apply[Topic, Type](
    `auth-requested`: WindowAuthRequestedEvent[Topic, Type],
    `begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[Topic, Type],
    blurred: WindowEvent[String, String],
    `bounds-changed`: WindowBoundsChange[Topic, Type],
    `bounds-changing`: WindowBoundsChange[Topic, Type],
    `certificate-error`: CertificateErrorEvent[String, String],
    `close-requested`: WindowEvent[Topic, Type],
    closed: WindowEvent[Topic, Type],
    closing: WindowEvent[Topic, Type],
    crashed: CrashedEvent & (WindowEvent[String, String]),
    `did-change-theme-color`: WindowEvent[String, String],
    `disabled-movement-bounds-changed`: WindowBoundsChange[Topic, Type],
    `disabled-movement-bounds-changing`: WindowBoundsChange[Topic, Type],
    embedded: WindowEvent[Topic, Type],
    `end-user-bounds-changing`: WindowEndBoundsChangingEvent[Topic, Type],
    `external-process-exited`: WindowExternalProcessExitedEvent[Topic, Type],
    `external-process-started`: WindowExternalProcessStartedEvent[Topic, Type],
    focused: WindowEvent[String, String],
    `found-in-page`: WindowEvent[String, String],
    `group-changed`: WindowGroupChanged[Topic, Type],
    hidden: WindowHiddenEvent[Topic, Type],
    hotkey: InputEvent & (WindowEvent[Topic, Type]),
    initialized: WindowEvent[Topic, Type],
    `layout-initialized`: WindowEvent[Topic, Type],
    `layout-ready`: WindowEvent[Topic, Type],
    listenerRemoved: String,
    maximized: WindowEvent[Topic, Type],
    minimized: WindowEvent[Topic, Type],
    `navigation-rejected`: WindowNavigationRejectedEvent[String, String],
    newListener: String,
    `options-changed`: WindowOptionsChangedEvent[Topic, Type],
    `page-favicon-updated`: WindowEvent[String, String],
    `page-title-updated`: PageTitleUpdatedEvent[String, String],
    `performance-report`: WindowPerformanceReport[Topic, Type],
    `preload-scripts-state-changed`: WindowPreloadScriptsStateChangeEvent[Topic, Type],
    `preload-scripts-state-changing`: WindowPreloadScriptsStateChangeEvent[Topic, Type],
    reloaded: WindowReloadedEvent[Topic, Type],
    `resource-load-failed`: WindowResourceLoadFailedEvent[String, String],
    `resource-response-received`: WindowResourceResponseReceivedEvent[String, String],
    restored: WindowEvent[Topic, Type],
    `show-requested`: WindowEvent[Topic, Type],
    shown: WindowEvent[Topic, Type],
    `user-movement-disabled`: WindowEvent[Topic, Type],
    `user-movement-enabled`: WindowEvent[Topic, Type],
    `view-attached`: WindowEvent[Topic, Type],
    `view-detached`: ViewDetached[Topic, Type],
    `will-move`: WillMoveOrResize[Topic, Type],
    `will-resize`: WillMoveOrResize[Topic, Type]
  ): WindowEventMapping[Topic, Type] = {
    val __obj = js.Dynamic.literal(blurred = blurred.asInstanceOf[js.Any], closed = closed.asInstanceOf[js.Any], closing = closing.asInstanceOf[js.Any], crashed = crashed.asInstanceOf[js.Any], embedded = embedded.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hotkey = hotkey.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], maximized = maximized.asInstanceOf[js.Any], minimized = minimized.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], reloaded = reloaded.asInstanceOf[js.Any], restored = restored.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any])
    __obj.updateDynamic("auth-requested")(`auth-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("begin-user-bounds-changing")(`begin-user-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("bounds-changed")(`bounds-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("bounds-changing")(`bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("certificate-error")(`certificate-error`.asInstanceOf[js.Any])
    __obj.updateDynamic("close-requested")(`close-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("did-change-theme-color")(`did-change-theme-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("disabled-movement-bounds-changed")(`disabled-movement-bounds-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("disabled-movement-bounds-changing")(`disabled-movement-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("end-user-bounds-changing")(`end-user-bounds-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("external-process-exited")(`external-process-exited`.asInstanceOf[js.Any])
    __obj.updateDynamic("external-process-started")(`external-process-started`.asInstanceOf[js.Any])
    __obj.updateDynamic("found-in-page")(`found-in-page`.asInstanceOf[js.Any])
    __obj.updateDynamic("group-changed")(`group-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("layout-initialized")(`layout-initialized`.asInstanceOf[js.Any])
    __obj.updateDynamic("layout-ready")(`layout-ready`.asInstanceOf[js.Any])
    __obj.updateDynamic("navigation-rejected")(`navigation-rejected`.asInstanceOf[js.Any])
    __obj.updateDynamic("options-changed")(`options-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("page-favicon-updated")(`page-favicon-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("page-title-updated")(`page-title-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("performance-report")(`performance-report`.asInstanceOf[js.Any])
    __obj.updateDynamic("preload-scripts-state-changed")(`preload-scripts-state-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("preload-scripts-state-changing")(`preload-scripts-state-changing`.asInstanceOf[js.Any])
    __obj.updateDynamic("resource-load-failed")(`resource-load-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("resource-response-received")(`resource-response-received`.asInstanceOf[js.Any])
    __obj.updateDynamic("show-requested")(`show-requested`.asInstanceOf[js.Any])
    __obj.updateDynamic("user-movement-disabled")(`user-movement-disabled`.asInstanceOf[js.Any])
    __obj.updateDynamic("user-movement-enabled")(`user-movement-enabled`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-attached")(`view-attached`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-detached")(`view-detached`.asInstanceOf[js.Any])
    __obj.updateDynamic("will-move")(`will-move`.asInstanceOf[js.Any])
    __obj.updateDynamic("will-resize")(`will-resize`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowEventMapping[Topic, Type]]
  }
  
  @scala.inline
  implicit class WindowEventMappingMutableBuilder[Self <: WindowEventMapping[?, ?], Topic, Type] (val x: Self & (WindowEventMapping[Topic, Type])) extends AnyVal {
    
    @scala.inline
    def `setAuth-requested`(value: WindowAuthRequestedEvent[Topic, Type]): Self = StObject.set(x, "auth-requested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBegin-user-bounds-changing`(value: WindowBeginBoundsChangingEvent[Topic, Type]): Self = StObject.set(x, "begin-user-bounds-changing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBounds-changed`(value: WindowBoundsChange[Topic, Type]): Self = StObject.set(x, "bounds-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBounds-changing`(value: WindowBoundsChange[Topic, Type]): Self = StObject.set(x, "bounds-changing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setClose-requested`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "close-requested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosed(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosing(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDisabled-movement-bounds-changed`(value: WindowBoundsChange[Topic, Type]): Self = StObject.set(x, "disabled-movement-bounds-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDisabled-movement-bounds-changing`(value: WindowBoundsChange[Topic, Type]): Self = StObject.set(x, "disabled-movement-bounds-changing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedded(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "embedded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setEnd-user-bounds-changing`(value: WindowEndBoundsChangingEvent[Topic, Type]): Self = StObject.set(x, "end-user-bounds-changing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setExternal-process-exited`(value: WindowExternalProcessExitedEvent[Topic, Type]): Self = StObject.set(x, "external-process-exited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setExternal-process-started`(value: WindowExternalProcessStartedEvent[Topic, Type]): Self = StObject.set(x, "external-process-started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGroup-changed`(value: WindowGroupChanged[Topic, Type]): Self = StObject.set(x, "group-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: WindowHiddenEvent[Topic, Type]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHotkey(value: InputEvent & (WindowEvent[Topic, Type])): Self = StObject.set(x, "hotkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialized(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLayout-initialized`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "layout-initialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLayout-ready`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "layout-ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximized(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "maximized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimized(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "minimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOptions-changed`(value: WindowOptionsChangedEvent[Topic, Type]): Self = StObject.set(x, "options-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPerformance-report`(value: WindowPerformanceReport[Topic, Type]): Self = StObject.set(x, "performance-report", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPreload-scripts-state-changed`(value: WindowPreloadScriptsStateChangeEvent[Topic, Type]): Self = StObject.set(x, "preload-scripts-state-changed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPreload-scripts-state-changing`(value: WindowPreloadScriptsStateChangeEvent[Topic, Type]): Self = StObject.set(x, "preload-scripts-state-changing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReloaded(value: WindowReloadedEvent[Topic, Type]): Self = StObject.set(x, "reloaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestored(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "restored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShow-requested`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "show-requested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShown(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "shown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUser-movement-disabled`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "user-movement-disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUser-movement-enabled`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "user-movement-enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-attached`(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "view-attached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setView-detached`(value: ViewDetached[Topic, Type]): Self = StObject.set(x, "view-detached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWill-move`(value: WillMoveOrResize[Topic, Type]): Self = StObject.set(x, "will-move", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWill-resize`(value: WillMoveOrResize[Topic, Type]): Self = StObject.set(x, "will-resize", value.asInstanceOf[js.Any])
  }
}
