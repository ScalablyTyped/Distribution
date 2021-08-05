package typings.openfin

import typings.openfin.eventsApplicationMod.CrashedEvent
import typings.openfin.eventsBaseMod.BaseEventMap
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.identityMod.NamedIdentity
import typings.openfin.openfinStrings.`target-changed`
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
import typings.openfin.openfinStrings.attached
import typings.openfin.openfinStrings.created
import typings.openfin.openfinStrings.destroyed
import typings.openfin.openfinStrings.hidden
import typings.openfin.openfinStrings.hotkey
import typings.openfin.openfinStrings.keyDown
import typings.openfin.openfinStrings.keyUp
import typings.openfin.openfinStrings.shown
import typings.openfin.openfinStrings.view
import typings.openfin.webcontentsMod.CertificateErrorEvent
import typings.openfin.webcontentsMod.PageTitleUpdatedEvent
import typings.openfin.webcontentsMod.WebContentsEventMapping
import typings.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typings.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import typings.openfin.windowMod.WindowNavigationRejectedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewMod {
  
  trait InputEvent extends StObject {
    
    var altKey: Boolean
    
    var code: String
    
    var command: js.UndefOr[String] = js.undefined
    
    var ctrlKey: Boolean
    
    var inputType: keyUp | keyDown
    
    var key: String
    
    var metaKey: Boolean
    
    var repeat: Boolean
    
    var shiftKey: Boolean
  }
  object InputEvent {
    
    inline def apply(
      altKey: Boolean,
      code: String,
      ctrlKey: Boolean,
      inputType: keyUp | keyDown,
      key: String,
      metaKey: Boolean,
      repeat: Boolean,
      shiftKey: Boolean
    ): InputEvent = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputEvent]
    }
    
    extension [Self <: InputEvent](x: Self) {
      
      inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
      
      inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      inline def setInputType(value: keyUp | keyDown): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      inline def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait PropagatedViewEventMapping[Topic, Type]
    extends StObject
       with BaseEventMap {
    
    var `view-blurred`: (WindowEvent[Topic, Type]) & PropagatedViewIdentity
    
    var `view-crashed`: CrashedEvent & (WindowEvent[Topic, Type]) & PropagatedViewIdentity
    
    var `view-created`: CrashedEvent & (WindowEvent[Topic, Type]) & PropagatedViewIdentity
    
    var `view-destroyed`: (WindowEvent[Topic, Type]) & PropagatedViewIdentity
    
    var `view-did-change-theme-color`: (WindowEvent[Topic, Type]) & PropagatedViewIdentity
    
    var `view-focused`: (WindowEvent[Topic, Type]) & PropagatedViewIdentity
    
    var `view-hidden`: (WindowEvent[Topic, Type]) & PropagatedViewIdentity
    
    var `view-hotkey`: InputEvent & (WindowEvent[Topic, Type]) & PropagatedViewIdentity
    
    var `view-navigation-rejected`: (WindowNavigationRejectedEvent[Topic, Type]) & PropagatedViewIdentity
    
    var `view-page-favicon-updated`: (WindowEvent[Topic, Type]) & PropagatedViewIdentity
    
    var `view-page-title-updated`: (WindowEvent[Topic, Type]) & PropagatedViewIdentity
    
    var `view-resource-load-failed`: (WindowResourceLoadFailedEvent[Topic, Type]) & PropagatedViewIdentity
    
    var `view-resource-response-received`: (WindowResourceResponseReceivedEvent[Topic, Type]) & PropagatedViewIdentity
    
    var `view-shown`: (WindowEvent[Topic, Type]) & PropagatedViewIdentity
    
    var `view-target-changed`: (TargetChangedEvent[Topic, Type]) & PropagatedViewIdentity
  }
  object PropagatedViewEventMapping {
    
    inline def apply[Topic, Type](
      listenerRemoved: String,
      newListener: String,
      `view-blurred`: (WindowEvent[Topic, Type]) & PropagatedViewIdentity,
      `view-crashed`: CrashedEvent & (WindowEvent[Topic, Type]) & PropagatedViewIdentity,
      `view-created`: CrashedEvent & (WindowEvent[Topic, Type]) & PropagatedViewIdentity,
      `view-destroyed`: (WindowEvent[Topic, Type]) & PropagatedViewIdentity,
      `view-did-change-theme-color`: (WindowEvent[Topic, Type]) & PropagatedViewIdentity,
      `view-focused`: (WindowEvent[Topic, Type]) & PropagatedViewIdentity,
      `view-hidden`: (WindowEvent[Topic, Type]) & PropagatedViewIdentity,
      `view-hotkey`: InputEvent & (WindowEvent[Topic, Type]) & PropagatedViewIdentity,
      `view-navigation-rejected`: (WindowNavigationRejectedEvent[Topic, Type]) & PropagatedViewIdentity,
      `view-page-favicon-updated`: (WindowEvent[Topic, Type]) & PropagatedViewIdentity,
      `view-page-title-updated`: (WindowEvent[Topic, Type]) & PropagatedViewIdentity,
      `view-resource-load-failed`: (WindowResourceLoadFailedEvent[Topic, Type]) & PropagatedViewIdentity,
      `view-resource-response-received`: (WindowResourceResponseReceivedEvent[Topic, Type]) & PropagatedViewIdentity,
      `view-shown`: (WindowEvent[Topic, Type]) & PropagatedViewIdentity,
      `view-target-changed`: (TargetChangedEvent[Topic, Type]) & PropagatedViewIdentity
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
    
    extension [Self <: PropagatedViewEventMapping[?, ?], Topic, Type](x: Self & (PropagatedViewEventMapping[Topic, Type])) {
      
      inline def `setView-blurred`(value: (WindowEvent[Topic, Type]) & PropagatedViewIdentity): Self = StObject.set(x, "view-blurred", value.asInstanceOf[js.Any])
      
      inline def `setView-crashed`(value: CrashedEvent & (WindowEvent[Topic, Type]) & PropagatedViewIdentity): Self = StObject.set(x, "view-crashed", value.asInstanceOf[js.Any])
      
      inline def `setView-created`(value: CrashedEvent & (WindowEvent[Topic, Type]) & PropagatedViewIdentity): Self = StObject.set(x, "view-created", value.asInstanceOf[js.Any])
      
      inline def `setView-destroyed`(value: (WindowEvent[Topic, Type]) & PropagatedViewIdentity): Self = StObject.set(x, "view-destroyed", value.asInstanceOf[js.Any])
      
      inline def `setView-did-change-theme-color`(value: (WindowEvent[Topic, Type]) & PropagatedViewIdentity): Self = StObject.set(x, "view-did-change-theme-color", value.asInstanceOf[js.Any])
      
      inline def `setView-focused`(value: (WindowEvent[Topic, Type]) & PropagatedViewIdentity): Self = StObject.set(x, "view-focused", value.asInstanceOf[js.Any])
      
      inline def `setView-hidden`(value: (WindowEvent[Topic, Type]) & PropagatedViewIdentity): Self = StObject.set(x, "view-hidden", value.asInstanceOf[js.Any])
      
      inline def `setView-hotkey`(value: InputEvent & (WindowEvent[Topic, Type]) & PropagatedViewIdentity): Self = StObject.set(x, "view-hotkey", value.asInstanceOf[js.Any])
      
      inline def `setView-navigation-rejected`(value: (WindowNavigationRejectedEvent[Topic, Type]) & PropagatedViewIdentity): Self = StObject.set(x, "view-navigation-rejected", value.asInstanceOf[js.Any])
      
      inline def `setView-page-favicon-updated`(value: (WindowEvent[Topic, Type]) & PropagatedViewIdentity): Self = StObject.set(x, "view-page-favicon-updated", value.asInstanceOf[js.Any])
      
      inline def `setView-page-title-updated`(value: (WindowEvent[Topic, Type]) & PropagatedViewIdentity): Self = StObject.set(x, "view-page-title-updated", value.asInstanceOf[js.Any])
      
      inline def `setView-resource-load-failed`(value: (WindowResourceLoadFailedEvent[Topic, Type]) & PropagatedViewIdentity): Self = StObject.set(x, "view-resource-load-failed", value.asInstanceOf[js.Any])
      
      inline def `setView-resource-response-received`(value: (WindowResourceResponseReceivedEvent[Topic, Type]) & PropagatedViewIdentity): Self = StObject.set(x, "view-resource-response-received", value.asInstanceOf[js.Any])
      
      inline def `setView-shown`(value: (WindowEvent[Topic, Type]) & PropagatedViewIdentity): Self = StObject.set(x, "view-shown", value.asInstanceOf[js.Any])
      
      inline def `setView-target-changed`(value: (TargetChangedEvent[Topic, Type]) & PropagatedViewIdentity): Self = StObject.set(x, "view-target-changed", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ Type in keyof openfin.openfin/_v2/api/events/view.PropagatedViewEventMapping<string, string> ]: openfin.openfin/_v2/api/events/view.PropagatedViewEventMapping<Topic, Type>[Type]} */
  trait PropagatedViewEvents[Topic] extends StObject {
    
    var listenerRemoved: String
    
    var newListener: String
    
    var `view-blurred`: (WindowEvent[Topic, typings.openfin.openfinStrings.`view-blurred`]) & PropagatedViewIdentity
    
    var `view-crashed`: CrashedEvent & (WindowEvent[Topic, typings.openfin.openfinStrings.`view-crashed`]) & PropagatedViewIdentity
    
    var `view-created`: CrashedEvent & (WindowEvent[Topic, typings.openfin.openfinStrings.`view-created`]) & PropagatedViewIdentity
    
    var `view-destroyed`: (WindowEvent[Topic, typings.openfin.openfinStrings.`view-destroyed`]) & PropagatedViewIdentity
    
    var `view-did-change-theme-color`: (WindowEvent[Topic, typings.openfin.openfinStrings.`view-did-change-theme-color`]) & PropagatedViewIdentity
    
    var `view-focused`: (WindowEvent[Topic, typings.openfin.openfinStrings.`view-focused`]) & PropagatedViewIdentity
    
    var `view-hidden`: (WindowEvent[Topic, typings.openfin.openfinStrings.`view-hidden`]) & PropagatedViewIdentity
    
    var `view-hotkey`: InputEvent & (WindowEvent[Topic, typings.openfin.openfinStrings.`view-hotkey`]) & PropagatedViewIdentity
    
    var `view-navigation-rejected`: (WindowNavigationRejectedEvent[Topic, typings.openfin.openfinStrings.`view-navigation-rejected`]) & PropagatedViewIdentity
    
    var `view-page-favicon-updated`: (WindowEvent[Topic, typings.openfin.openfinStrings.`view-page-favicon-updated`]) & PropagatedViewIdentity
    
    var `view-page-title-updated`: (WindowEvent[Topic, typings.openfin.openfinStrings.`view-page-title-updated`]) & PropagatedViewIdentity
    
    var `view-resource-load-failed`: (WindowResourceLoadFailedEvent[Topic, typings.openfin.openfinStrings.`view-resource-load-failed`]) & PropagatedViewIdentity
    
    var `view-resource-response-received`: (WindowResourceResponseReceivedEvent[Topic, typings.openfin.openfinStrings.`view-resource-response-received`]) & PropagatedViewIdentity
    
    var `view-shown`: (WindowEvent[Topic, typings.openfin.openfinStrings.`view-shown`]) & PropagatedViewIdentity
    
    var `view-target-changed`: (TargetChangedEvent[Topic, typings.openfin.openfinStrings.`view-target-changed`]) & PropagatedViewIdentity
  }
  object PropagatedViewEvents {
    
    inline def apply[Topic](
      listenerRemoved: String,
      newListener: String,
      `view-blurred`: (WindowEvent[Topic, `view-blurred`]) & PropagatedViewIdentity,
      `view-crashed`: CrashedEvent & (WindowEvent[Topic, `view-crashed`]) & PropagatedViewIdentity,
      `view-created`: CrashedEvent & (WindowEvent[Topic, `view-created`]) & PropagatedViewIdentity,
      `view-destroyed`: (WindowEvent[Topic, `view-destroyed`]) & PropagatedViewIdentity,
      `view-did-change-theme-color`: (WindowEvent[Topic, `view-did-change-theme-color`]) & PropagatedViewIdentity,
      `view-focused`: (WindowEvent[Topic, `view-focused`]) & PropagatedViewIdentity,
      `view-hidden`: (WindowEvent[Topic, `view-hidden`]) & PropagatedViewIdentity,
      `view-hotkey`: InputEvent & (WindowEvent[Topic, `view-hotkey`]) & PropagatedViewIdentity,
      `view-navigation-rejected`: (WindowNavigationRejectedEvent[Topic, `view-navigation-rejected`]) & PropagatedViewIdentity,
      `view-page-favicon-updated`: (WindowEvent[Topic, `view-page-favicon-updated`]) & PropagatedViewIdentity,
      `view-page-title-updated`: (WindowEvent[Topic, `view-page-title-updated`]) & PropagatedViewIdentity,
      `view-resource-load-failed`: (WindowResourceLoadFailedEvent[Topic, `view-resource-load-failed`]) & PropagatedViewIdentity,
      `view-resource-response-received`: (WindowResourceResponseReceivedEvent[Topic, `view-resource-response-received`]) & PropagatedViewIdentity,
      `view-shown`: (WindowEvent[Topic, `view-shown`]) & PropagatedViewIdentity,
      `view-target-changed`: (TargetChangedEvent[Topic, `view-target-changed`]) & PropagatedViewIdentity
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
    
    extension [Self <: PropagatedViewEvents[?], Topic](x: Self & PropagatedViewEvents[Topic]) {
      
      inline def setListenerRemoved(value: String): Self = StObject.set(x, "listenerRemoved", value.asInstanceOf[js.Any])
      
      inline def setNewListener(value: String): Self = StObject.set(x, "newListener", value.asInstanceOf[js.Any])
      
      inline def `setView-blurred`(value: (WindowEvent[Topic, `view-blurred`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-blurred", value.asInstanceOf[js.Any])
      
      inline def `setView-crashed`(value: CrashedEvent & (WindowEvent[Topic, `view-crashed`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-crashed", value.asInstanceOf[js.Any])
      
      inline def `setView-created`(value: CrashedEvent & (WindowEvent[Topic, `view-created`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-created", value.asInstanceOf[js.Any])
      
      inline def `setView-destroyed`(value: (WindowEvent[Topic, `view-destroyed`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-destroyed", value.asInstanceOf[js.Any])
      
      inline def `setView-did-change-theme-color`(value: (WindowEvent[Topic, `view-did-change-theme-color`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-did-change-theme-color", value.asInstanceOf[js.Any])
      
      inline def `setView-focused`(value: (WindowEvent[Topic, `view-focused`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-focused", value.asInstanceOf[js.Any])
      
      inline def `setView-hidden`(value: (WindowEvent[Topic, `view-hidden`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-hidden", value.asInstanceOf[js.Any])
      
      inline def `setView-hotkey`(value: InputEvent & (WindowEvent[Topic, `view-hotkey`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-hotkey", value.asInstanceOf[js.Any])
      
      inline def `setView-navigation-rejected`(value: (WindowNavigationRejectedEvent[Topic, `view-navigation-rejected`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-navigation-rejected", value.asInstanceOf[js.Any])
      
      inline def `setView-page-favicon-updated`(value: (WindowEvent[Topic, `view-page-favicon-updated`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-page-favicon-updated", value.asInstanceOf[js.Any])
      
      inline def `setView-page-title-updated`(value: (WindowEvent[Topic, `view-page-title-updated`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-page-title-updated", value.asInstanceOf[js.Any])
      
      inline def `setView-resource-load-failed`(
        value: (WindowResourceLoadFailedEvent[Topic, `view-resource-load-failed`]) & PropagatedViewIdentity
      ): Self = StObject.set(x, "view-resource-load-failed", value.asInstanceOf[js.Any])
      
      inline def `setView-resource-response-received`(
        value: (WindowResourceResponseReceivedEvent[Topic, `view-resource-response-received`]) & PropagatedViewIdentity
      ): Self = StObject.set(x, "view-resource-response-received", value.asInstanceOf[js.Any])
      
      inline def `setView-shown`(value: (WindowEvent[Topic, `view-shown`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-shown", value.asInstanceOf[js.Any])
      
      inline def `setView-target-changed`(value: (TargetChangedEvent[Topic, `view-target-changed`]) & PropagatedViewIdentity): Self = StObject.set(x, "view-target-changed", value.asInstanceOf[js.Any])
    }
  }
  
  trait PropagatedViewIdentity extends StObject {
    
    var viewIdentity: NamedIdentity
  }
  object PropagatedViewIdentity {
    
    inline def apply(viewIdentity: NamedIdentity): PropagatedViewIdentity = {
      val __obj = js.Dynamic.literal(viewIdentity = viewIdentity.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropagatedViewIdentity]
    }
    
    extension [Self <: PropagatedViewIdentity](x: Self) {
      
      inline def setViewIdentity(value: NamedIdentity): Self = StObject.set(x, "viewIdentity", value.asInstanceOf[js.Any])
    }
  }
  
  trait TargetChangedEvent[Topic, Type]
    extends StObject
       with WindowEvent[Topic, Type] {
    
    var previousTarget: NamedIdentity
    
    var target: NamedIdentity
  }
  object TargetChangedEvent {
    
    inline def apply[Topic, Type](
      name: String,
      previousTarget: NamedIdentity,
      target: NamedIdentity,
      topic: Topic,
      `type`: Type,
      uuid: String
    ): TargetChangedEvent[Topic, Type] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], previousTarget = previousTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetChangedEvent[Topic, Type]]
    }
    
    extension [Self <: TargetChangedEvent[?, ?], Topic, Type](x: Self & (TargetChangedEvent[Topic, Type])) {
      
      inline def setPreviousTarget(value: NamedIdentity): Self = StObject.set(x, "previousTarget", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: NamedIdentity): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait ViewEventMapping[Topic, Type]
    extends StObject
       with WebContentsEventMapping[String, String] {
    
    var attached: WindowEvent[Topic, Type]
    
    var created: WindowEvent[Topic, Type]
    
    var destroyed: WindowEvent[Topic, Type]
    
    var hidden: WindowEvent[Topic, Type]
    
    var hotkey: InputEvent & (WindowEvent[Topic, Type])
    
    var shown: WindowEvent[Topic, Type]
    
    var `target-changed`: TargetChangedEvent[Topic, Type]
  }
  object ViewEventMapping {
    
    inline def apply[Topic, Type](
      attached: WindowEvent[Topic, Type],
      blurred: WindowEvent[String, String],
      `certificate-error`: CertificateErrorEvent[String, String],
      crashed: CrashedEvent & (WindowEvent[String, String]),
      created: WindowEvent[Topic, Type],
      destroyed: WindowEvent[Topic, Type],
      `did-change-theme-color`: WindowEvent[String, String],
      focused: WindowEvent[String, String],
      `found-in-page`: WindowEvent[String, String],
      hidden: WindowEvent[Topic, Type],
      hotkey: InputEvent & (WindowEvent[Topic, Type]),
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
    
    extension [Self <: ViewEventMapping[?, ?], Topic, Type](x: Self & (ViewEventMapping[Topic, Type])) {
      
      inline def setAttached(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      inline def setCreated(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setDestroyed(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHotkey(value: InputEvent & (WindowEvent[Topic, Type])): Self = StObject.set(x, "hotkey", value.asInstanceOf[js.Any])
      
      inline def setShown(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "shown", value.asInstanceOf[js.Any])
      
      inline def `setTarget-changed`(value: TargetChangedEvent[Topic, Type]): Self = StObject.set(x, "target-changed", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ Type in keyof openfin.openfin/_v2/api/events/view.ViewEventMapping<string, string> ]: openfin.openfin/_v2/api/events/view.ViewEventMapping<'view', Type>[Type]} */
  trait ViewEvents extends StObject {
    
    var attached: WindowEvent[view, typings.openfin.openfinStrings.attached]
    
    var blurred: WindowEvent[String, String]
    
    var `certificate-error`: CertificateErrorEvent[String, String]
    
    var crashed: CrashedEvent & (WindowEvent[String, String])
    
    var created: WindowEvent[view, typings.openfin.openfinStrings.created]
    
    var destroyed: WindowEvent[view, typings.openfin.openfinStrings.destroyed]
    
    var `did-change-theme-color`: WindowEvent[String, String]
    
    var focused: WindowEvent[String, String]
    
    var `found-in-page`: WindowEvent[String, String]
    
    var hidden: WindowEvent[view, typings.openfin.openfinStrings.hidden]
    
    var hotkey: InputEvent & (WindowEvent[view, typings.openfin.openfinStrings.hotkey])
    
    var listenerRemoved: String
    
    var `navigation-rejected`: WindowNavigationRejectedEvent[String, String]
    
    var newListener: String
    
    var `page-favicon-updated`: WindowEvent[String, String]
    
    var `page-title-updated`: PageTitleUpdatedEvent[String, String]
    
    var `resource-load-failed`: WindowResourceLoadFailedEvent[String, String]
    
    var `resource-response-received`: WindowResourceResponseReceivedEvent[String, String]
    
    var shown: WindowEvent[view, typings.openfin.openfinStrings.shown]
    
    var `target-changed`: TargetChangedEvent[view, typings.openfin.openfinStrings.`target-changed`]
  }
  object ViewEvents {
    
    inline def apply(
      attached: WindowEvent[view, attached],
      blurred: WindowEvent[String, String],
      `certificate-error`: CertificateErrorEvent[String, String],
      crashed: CrashedEvent & (WindowEvent[String, String]),
      created: WindowEvent[view, created],
      destroyed: WindowEvent[view, destroyed],
      `did-change-theme-color`: WindowEvent[String, String],
      focused: WindowEvent[String, String],
      `found-in-page`: WindowEvent[String, String],
      hidden: WindowEvent[view, hidden],
      hotkey: InputEvent & (WindowEvent[view, hotkey]),
      listenerRemoved: String,
      `navigation-rejected`: WindowNavigationRejectedEvent[String, String],
      newListener: String,
      `page-favicon-updated`: WindowEvent[String, String],
      `page-title-updated`: PageTitleUpdatedEvent[String, String],
      `resource-load-failed`: WindowResourceLoadFailedEvent[String, String],
      `resource-response-received`: WindowResourceResponseReceivedEvent[String, String],
      shown: WindowEvent[view, shown],
      `target-changed`: TargetChangedEvent[view, `target-changed`]
    ): ViewEvents = {
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
      __obj.asInstanceOf[ViewEvents]
    }
    
    extension [Self <: ViewEvents](x: Self) {
      
      inline def setAttached(value: WindowEvent[view, attached]): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      inline def setBlurred(value: WindowEvent[String, String]): Self = StObject.set(x, "blurred", value.asInstanceOf[js.Any])
      
      inline def `setCertificate-error`(value: CertificateErrorEvent[String, String]): Self = StObject.set(x, "certificate-error", value.asInstanceOf[js.Any])
      
      inline def setCrashed(value: CrashedEvent & (WindowEvent[String, String])): Self = StObject.set(x, "crashed", value.asInstanceOf[js.Any])
      
      inline def setCreated(value: WindowEvent[view, created]): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setDestroyed(value: WindowEvent[view, destroyed]): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
      
      inline def `setDid-change-theme-color`(value: WindowEvent[String, String]): Self = StObject.set(x, "did-change-theme-color", value.asInstanceOf[js.Any])
      
      inline def setFocused(value: WindowEvent[String, String]): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def `setFound-in-page`(value: WindowEvent[String, String]): Self = StObject.set(x, "found-in-page", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: WindowEvent[view, hidden]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHotkey(value: InputEvent & (WindowEvent[view, hotkey])): Self = StObject.set(x, "hotkey", value.asInstanceOf[js.Any])
      
      inline def setListenerRemoved(value: String): Self = StObject.set(x, "listenerRemoved", value.asInstanceOf[js.Any])
      
      inline def `setNavigation-rejected`(value: WindowNavigationRejectedEvent[String, String]): Self = StObject.set(x, "navigation-rejected", value.asInstanceOf[js.Any])
      
      inline def setNewListener(value: String): Self = StObject.set(x, "newListener", value.asInstanceOf[js.Any])
      
      inline def `setPage-favicon-updated`(value: WindowEvent[String, String]): Self = StObject.set(x, "page-favicon-updated", value.asInstanceOf[js.Any])
      
      inline def `setPage-title-updated`(value: PageTitleUpdatedEvent[String, String]): Self = StObject.set(x, "page-title-updated", value.asInstanceOf[js.Any])
      
      inline def `setResource-load-failed`(value: WindowResourceLoadFailedEvent[String, String]): Self = StObject.set(x, "resource-load-failed", value.asInstanceOf[js.Any])
      
      inline def `setResource-response-received`(value: WindowResourceResponseReceivedEvent[String, String]): Self = StObject.set(x, "resource-response-received", value.asInstanceOf[js.Any])
      
      inline def setShown(value: WindowEvent[view, shown]): Self = StObject.set(x, "shown", value.asInstanceOf[js.Any])
      
      inline def `setTarget-changed`(value: TargetChangedEvent[view, `target-changed`]): Self = StObject.set(x, "target-changed", value.asInstanceOf[js.Any])
    }
  }
}
