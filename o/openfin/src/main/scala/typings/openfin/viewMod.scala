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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewMod {
  
  @js.native
  trait InputEvent extends StObject {
    
    var altKey: Boolean = js.native
    
    var code: String = js.native
    
    var command: js.UndefOr[String] = js.native
    
    var ctrlKey: Boolean = js.native
    
    var inputType: keyUp | keyDown = js.native
    
    var key: String = js.native
    
    var metaKey: Boolean = js.native
    
    var repeat: Boolean = js.native
    
    var shiftKey: Boolean = js.native
  }
  object InputEvent {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class InputEventMutableBuilder[Self <: InputEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
      
      @scala.inline
      def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputType(value: keyUp | keyDown): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    }
  }
  
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
    implicit class PropagatedViewEventMappingMutableBuilder[Self <: PropagatedViewEventMapping[_, _], Topic, Type] (val x: Self with (PropagatedViewEventMapping[Topic, Type])) extends AnyVal {
      
      @scala.inline
      def `setView-blurred`(value: (WindowEvent[Topic, Type]) with PropagatedViewIdentity): Self = StObject.set(x, "view-blurred", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-crashed`(value: CrashedEvent with (WindowEvent[Topic, Type]) with PropagatedViewIdentity): Self = StObject.set(x, "view-crashed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-created`(value: CrashedEvent with (WindowEvent[Topic, Type]) with PropagatedViewIdentity): Self = StObject.set(x, "view-created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-destroyed`(value: (WindowEvent[Topic, Type]) with PropagatedViewIdentity): Self = StObject.set(x, "view-destroyed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-did-change-theme-color`(value: (WindowEvent[Topic, Type]) with PropagatedViewIdentity): Self = StObject.set(x, "view-did-change-theme-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-focused`(value: (WindowEvent[Topic, Type]) with PropagatedViewIdentity): Self = StObject.set(x, "view-focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-hidden`(value: (WindowEvent[Topic, Type]) with PropagatedViewIdentity): Self = StObject.set(x, "view-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-hotkey`(value: InputEvent with (WindowEvent[Topic, Type]) with PropagatedViewIdentity): Self = StObject.set(x, "view-hotkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-navigation-rejected`(value: (WindowNavigationRejectedEvent[Topic, Type]) with PropagatedViewIdentity): Self = StObject.set(x, "view-navigation-rejected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-page-favicon-updated`(value: (WindowEvent[Topic, Type]) with PropagatedViewIdentity): Self = StObject.set(x, "view-page-favicon-updated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-page-title-updated`(value: (WindowEvent[Topic, Type]) with PropagatedViewIdentity): Self = StObject.set(x, "view-page-title-updated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-resource-load-failed`(value: (WindowResourceLoadFailedEvent[Topic, Type]) with PropagatedViewIdentity): Self = StObject.set(x, "view-resource-load-failed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-resource-response-received`(value: (WindowResourceResponseReceivedEvent[Topic, Type]) with PropagatedViewIdentity): Self = StObject.set(x, "view-resource-response-received", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-shown`(value: (WindowEvent[Topic, Type]) with PropagatedViewIdentity): Self = StObject.set(x, "view-shown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-target-changed`(value: (TargetChangedEvent[Topic, Type]) with PropagatedViewIdentity): Self = StObject.set(x, "view-target-changed", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ Type in keyof openfin.openfin/_v2/api/events/view.PropagatedViewEventMapping<string, string> ]: openfin.openfin/_v2/api/events/view.PropagatedViewEventMapping<Topic, Type>[Type]} */
  @js.native
  trait PropagatedViewEvents[Topic] extends StObject {
    
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
    implicit class PropagatedViewEventsMutableBuilder[Self <: PropagatedViewEvents[_], Topic] (val x: Self with PropagatedViewEvents[Topic]) extends AnyVal {
      
      @scala.inline
      def setListenerRemoved(value: String): Self = StObject.set(x, "listenerRemoved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewListener(value: String): Self = StObject.set(x, "newListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-blurred`(value: (WindowEvent[Topic, `view-blurred`]) with PropagatedViewIdentity): Self = StObject.set(x, "view-blurred", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-crashed`(value: CrashedEvent with (WindowEvent[Topic, `view-crashed`]) with PropagatedViewIdentity): Self = StObject.set(x, "view-crashed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-created`(value: CrashedEvent with (WindowEvent[Topic, `view-created`]) with PropagatedViewIdentity): Self = StObject.set(x, "view-created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-destroyed`(value: (WindowEvent[Topic, `view-destroyed`]) with PropagatedViewIdentity): Self = StObject.set(x, "view-destroyed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-did-change-theme-color`(value: (WindowEvent[Topic, `view-did-change-theme-color`]) with PropagatedViewIdentity): Self = StObject.set(x, "view-did-change-theme-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-focused`(value: (WindowEvent[Topic, `view-focused`]) with PropagatedViewIdentity): Self = StObject.set(x, "view-focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-hidden`(value: (WindowEvent[Topic, `view-hidden`]) with PropagatedViewIdentity): Self = StObject.set(x, "view-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-hotkey`(value: InputEvent with (WindowEvent[Topic, `view-hotkey`]) with PropagatedViewIdentity): Self = StObject.set(x, "view-hotkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-navigation-rejected`(
        value: (WindowNavigationRejectedEvent[Topic, `view-navigation-rejected`]) with PropagatedViewIdentity
      ): Self = StObject.set(x, "view-navigation-rejected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-page-favicon-updated`(value: (WindowEvent[Topic, `view-page-favicon-updated`]) with PropagatedViewIdentity): Self = StObject.set(x, "view-page-favicon-updated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-page-title-updated`(value: (WindowEvent[Topic, `view-page-title-updated`]) with PropagatedViewIdentity): Self = StObject.set(x, "view-page-title-updated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-resource-load-failed`(
        value: (WindowResourceLoadFailedEvent[Topic, `view-resource-load-failed`]) with PropagatedViewIdentity
      ): Self = StObject.set(x, "view-resource-load-failed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-resource-response-received`(
        value: (WindowResourceResponseReceivedEvent[Topic, `view-resource-response-received`]) with PropagatedViewIdentity
      ): Self = StObject.set(x, "view-resource-response-received", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-shown`(value: (WindowEvent[Topic, `view-shown`]) with PropagatedViewIdentity): Self = StObject.set(x, "view-shown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setView-target-changed`(value: (TargetChangedEvent[Topic, `view-target-changed`]) with PropagatedViewIdentity): Self = StObject.set(x, "view-target-changed", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PropagatedViewIdentity extends StObject {
    
    var viewIdentity: NamedIdentity = js.native
  }
  object PropagatedViewIdentity {
    
    @scala.inline
    def apply(viewIdentity: NamedIdentity): PropagatedViewIdentity = {
      val __obj = js.Dynamic.literal(viewIdentity = viewIdentity.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropagatedViewIdentity]
    }
    
    @scala.inline
    implicit class PropagatedViewIdentityMutableBuilder[Self <: PropagatedViewIdentity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setViewIdentity(value: NamedIdentity): Self = StObject.set(x, "viewIdentity", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TargetChangedEvent[Topic, Type] extends WindowEvent[Topic, Type] {
    
    var previousTarget: NamedIdentity = js.native
    
    var target: NamedIdentity = js.native
  }
  object TargetChangedEvent {
    
    @scala.inline
    def apply[Topic, Type](
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
    
    @scala.inline
    implicit class TargetChangedEventMutableBuilder[Self <: TargetChangedEvent[_, _], Topic, Type] (val x: Self with (TargetChangedEvent[Topic, Type])) extends AnyVal {
      
      @scala.inline
      def setPreviousTarget(value: NamedIdentity): Self = StObject.set(x, "previousTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: NamedIdentity): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
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
    implicit class ViewEventMappingMutableBuilder[Self <: ViewEventMapping[_, _], Topic, Type] (val x: Self with (ViewEventMapping[Topic, Type])) extends AnyVal {
      
      @scala.inline
      def setAttached(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyed(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidden(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHotkey(value: InputEvent with (WindowEvent[Topic, Type])): Self = StObject.set(x, "hotkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShown(value: WindowEvent[Topic, Type]): Self = StObject.set(x, "shown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTarget-changed`(value: TargetChangedEvent[Topic, Type]): Self = StObject.set(x, "target-changed", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ Type in keyof openfin.openfin/_v2/api/events/view.ViewEventMapping<string, string> ]: openfin.openfin/_v2/api/events/view.ViewEventMapping<'view', Type>[Type]} */
  @js.native
  trait ViewEvents extends StObject {
    
    var attached: WindowEvent[view, typings.openfin.openfinStrings.attached] = js.native
    
    var blurred: WindowEvent[String, String] = js.native
    
    var `certificate-error`: CertificateErrorEvent[String, String] = js.native
    
    var crashed: CrashedEvent with (WindowEvent[String, String]) = js.native
    
    var created: WindowEvent[view, typings.openfin.openfinStrings.created] = js.native
    
    var destroyed: WindowEvent[view, typings.openfin.openfinStrings.destroyed] = js.native
    
    var `did-change-theme-color`: WindowEvent[String, String] = js.native
    
    var focused: WindowEvent[String, String] = js.native
    
    var `found-in-page`: WindowEvent[String, String] = js.native
    
    var hidden: WindowEvent[view, typings.openfin.openfinStrings.hidden] = js.native
    
    var hotkey: InputEvent with (WindowEvent[view, typings.openfin.openfinStrings.hotkey]) = js.native
    
    var listenerRemoved: String = js.native
    
    var `navigation-rejected`: WindowNavigationRejectedEvent[String, String] = js.native
    
    var newListener: String = js.native
    
    var `page-favicon-updated`: WindowEvent[String, String] = js.native
    
    var `page-title-updated`: PageTitleUpdatedEvent[String, String] = js.native
    
    var `resource-load-failed`: WindowResourceLoadFailedEvent[String, String] = js.native
    
    var `resource-response-received`: WindowResourceResponseReceivedEvent[String, String] = js.native
    
    var shown: WindowEvent[view, typings.openfin.openfinStrings.shown] = js.native
    
    var `target-changed`: TargetChangedEvent[view, typings.openfin.openfinStrings.`target-changed`] = js.native
  }
  object ViewEvents {
    
    @scala.inline
    def apply(
      attached: WindowEvent[view, attached],
      blurred: WindowEvent[String, String],
      `certificate-error`: CertificateErrorEvent[String, String],
      crashed: CrashedEvent with (WindowEvent[String, String]),
      created: WindowEvent[view, created],
      destroyed: WindowEvent[view, destroyed],
      `did-change-theme-color`: WindowEvent[String, String],
      focused: WindowEvent[String, String],
      `found-in-page`: WindowEvent[String, String],
      hidden: WindowEvent[view, hidden],
      hotkey: InputEvent with (WindowEvent[view, hotkey]),
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
    
    @scala.inline
    implicit class ViewEventsMutableBuilder[Self <: ViewEvents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttached(value: WindowEvent[view, attached]): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurred(value: WindowEvent[String, String]): Self = StObject.set(x, "blurred", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCertificate-error`(value: CertificateErrorEvent[String, String]): Self = StObject.set(x, "certificate-error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrashed(value: CrashedEvent with (WindowEvent[String, String])): Self = StObject.set(x, "crashed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: WindowEvent[view, created]): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyed(value: WindowEvent[view, destroyed]): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDid-change-theme-color`(value: WindowEvent[String, String]): Self = StObject.set(x, "did-change-theme-color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocused(value: WindowEvent[String, String]): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setFound-in-page`(value: WindowEvent[String, String]): Self = StObject.set(x, "found-in-page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidden(value: WindowEvent[view, hidden]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHotkey(value: InputEvent with (WindowEvent[view, hotkey])): Self = StObject.set(x, "hotkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenerRemoved(value: String): Self = StObject.set(x, "listenerRemoved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setNavigation-rejected`(value: WindowNavigationRejectedEvent[String, String]): Self = StObject.set(x, "navigation-rejected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewListener(value: String): Self = StObject.set(x, "newListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPage-favicon-updated`(value: WindowEvent[String, String]): Self = StObject.set(x, "page-favicon-updated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPage-title-updated`(value: PageTitleUpdatedEvent[String, String]): Self = StObject.set(x, "page-title-updated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setResource-load-failed`(value: WindowResourceLoadFailedEvent[String, String]): Self = StObject.set(x, "resource-load-failed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setResource-response-received`(value: WindowResourceResponseReceivedEvent[String, String]): Self = StObject.set(x, "resource-response-received", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShown(value: WindowEvent[view, shown]): Self = StObject.set(x, "shown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTarget-changed`(value: TargetChangedEvent[view, `target-changed`]): Self = StObject.set(x, "target-changed", value.asInstanceOf[js.Any])
    }
  }
}
