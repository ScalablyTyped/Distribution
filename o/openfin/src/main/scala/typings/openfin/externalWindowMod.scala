package typings.openfin

import org.scalablytyped.runtime.StringDictionary
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.windowMod.WindowBeginBoundsChangingEvent
import typings.openfin.windowMod.WindowBoundsChange
import typings.openfin.windowMod.WindowEndBoundsChangingEvent
import typings.openfin.windowMod.WindowGroupChanged
import typings.openfin.windowMod.WindowHiddenEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object externalWindowMod {
  
  /* Inlined openfin.openfin/_v2/api/events/base.BaseEventMap & std.Pick<openfin.openfin/_v2/api/events/window.WindowEventMapping<string, string>, 'begin-user-bounds-changing' | 'blurred' | 'bounds-changed' | 'bounds-changing' | 'closed' | 'closing' | 'disabled-movement-bounds-changed' | 'disabled-movement-bounds-changing' | 'end-user-bounds-changing' | 'focused' | 'group-changed' | 'hidden' | 'maximized' | 'minimized' | 'restored' | 'shown' | 'user-movement-disabled' | 'user-movement-enabled'> */
  @js.native
  trait ExternalWindowEventMapping[Topic, Type]
    extends /**
    * @hidden
    * Custom properties and metadata. This can be extended in specific context object.
    */
  /* key */ StringDictionary[js.Any] {
    
    var `begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[String, String] = js.native
    
    var blurred: WindowEvent[String, String] = js.native
    
    var `bounds-changed`: WindowBoundsChange[String, String] = js.native
    
    var `bounds-changing`: WindowBoundsChange[String, String] = js.native
    
    var closed: WindowEvent[String, String] = js.native
    
    var closing: WindowEvent[String, String] = js.native
    
    var `disabled-movement-bounds-changed`: WindowBoundsChange[String, String] = js.native
    
    var `disabled-movement-bounds-changing`: WindowBoundsChange[String, String] = js.native
    
    var `end-user-bounds-changing`: WindowEndBoundsChangingEvent[String, String] = js.native
    
    var focused: WindowEvent[String, String] = js.native
    
    var `group-changed`: WindowGroupChanged[String, String] = js.native
    
    var hidden: WindowHiddenEvent[String, String] = js.native
    
    var listenerRemoved: String = js.native
    
    var maximized: WindowEvent[String, String] = js.native
    
    var minimized: WindowEvent[String, String] = js.native
    
    var newListener: String = js.native
    
    var restored: WindowEvent[String, String] = js.native
    
    var shown: WindowEvent[String, String] = js.native
    
    var `user-movement-disabled`: WindowEvent[String, String] = js.native
    
    var `user-movement-enabled`: WindowEvent[String, String] = js.native
  }
  object ExternalWindowEventMapping {
    
    @scala.inline
    def apply[Topic, Type](
      `begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[String, String],
      blurred: WindowEvent[String, String],
      `bounds-changed`: WindowBoundsChange[String, String],
      `bounds-changing`: WindowBoundsChange[String, String],
      closed: WindowEvent[String, String],
      closing: WindowEvent[String, String],
      `disabled-movement-bounds-changed`: WindowBoundsChange[String, String],
      `disabled-movement-bounds-changing`: WindowBoundsChange[String, String],
      `end-user-bounds-changing`: WindowEndBoundsChangingEvent[String, String],
      focused: WindowEvent[String, String],
      `group-changed`: WindowGroupChanged[String, String],
      hidden: WindowHiddenEvent[String, String],
      listenerRemoved: String,
      maximized: WindowEvent[String, String],
      minimized: WindowEvent[String, String],
      newListener: String,
      restored: WindowEvent[String, String],
      shown: WindowEvent[String, String],
      `user-movement-disabled`: WindowEvent[String, String],
      `user-movement-enabled`: WindowEvent[String, String]
    ): ExternalWindowEventMapping[Topic, Type] = {
      val __obj = js.Dynamic.literal(blurred = blurred.asInstanceOf[js.Any], closed = closed.asInstanceOf[js.Any], closing = closing.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], maximized = maximized.asInstanceOf[js.Any], minimized = minimized.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], restored = restored.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any])
      __obj.updateDynamic("begin-user-bounds-changing")(`begin-user-bounds-changing`.asInstanceOf[js.Any])
      __obj.updateDynamic("bounds-changed")(`bounds-changed`.asInstanceOf[js.Any])
      __obj.updateDynamic("bounds-changing")(`bounds-changing`.asInstanceOf[js.Any])
      __obj.updateDynamic("disabled-movement-bounds-changed")(`disabled-movement-bounds-changed`.asInstanceOf[js.Any])
      __obj.updateDynamic("disabled-movement-bounds-changing")(`disabled-movement-bounds-changing`.asInstanceOf[js.Any])
      __obj.updateDynamic("end-user-bounds-changing")(`end-user-bounds-changing`.asInstanceOf[js.Any])
      __obj.updateDynamic("group-changed")(`group-changed`.asInstanceOf[js.Any])
      __obj.updateDynamic("user-movement-disabled")(`user-movement-disabled`.asInstanceOf[js.Any])
      __obj.updateDynamic("user-movement-enabled")(`user-movement-enabled`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalWindowEventMapping[Topic, Type]]
    }
    
    @scala.inline
    implicit class ExternalWindowEventMappingMutableBuilder[Self <: ExternalWindowEventMapping[_, _], Topic, Type] (val x: Self with (ExternalWindowEventMapping[Topic, Type])) extends AnyVal {
      
      @scala.inline
      def `setBegin-user-bounds-changing`(value: WindowBeginBoundsChangingEvent[String, String]): Self = StObject.set(x, "begin-user-bounds-changing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurred(value: WindowEvent[String, String]): Self = StObject.set(x, "blurred", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBounds-changed`(value: WindowBoundsChange[String, String]): Self = StObject.set(x, "bounds-changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBounds-changing`(value: WindowBoundsChange[String, String]): Self = StObject.set(x, "bounds-changing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosed(value: WindowEvent[String, String]): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosing(value: WindowEvent[String, String]): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDisabled-movement-bounds-changed`(value: WindowBoundsChange[String, String]): Self = StObject.set(x, "disabled-movement-bounds-changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDisabled-movement-bounds-changing`(value: WindowBoundsChange[String, String]): Self = StObject.set(x, "disabled-movement-bounds-changing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setEnd-user-bounds-changing`(value: WindowEndBoundsChangingEvent[String, String]): Self = StObject.set(x, "end-user-bounds-changing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocused(value: WindowEvent[String, String]): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGroup-changed`(value: WindowGroupChanged[String, String]): Self = StObject.set(x, "group-changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidden(value: WindowHiddenEvent[String, String]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenerRemoved(value: String): Self = StObject.set(x, "listenerRemoved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximized(value: WindowEvent[String, String]): Self = StObject.set(x, "maximized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimized(value: WindowEvent[String, String]): Self = StObject.set(x, "minimized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewListener(value: String): Self = StObject.set(x, "newListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestored(value: WindowEvent[String, String]): Self = StObject.set(x, "restored", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShown(value: WindowEvent[String, String]): Self = StObject.set(x, "shown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setUser-movement-disabled`(value: WindowEvent[String, String]): Self = StObject.set(x, "user-movement-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setUser-movement-enabled`(value: WindowEvent[String, String]): Self = StObject.set(x, "user-movement-enabled", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ Type in keyof openfin.openfin/_v2/api/events/externalWindow.ExternalWindowEventMapping<string, string> ]: openfin.openfin/_v2/api/events/externalWindow.ExternalWindowEventMapping<'external-window', Type>[Type]} */
  @js.native
  trait ExternalWindowEvents extends StObject {
    
    var `begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[String, String] = js.native
    
    var blurred: WindowEvent[String, String] = js.native
    
    var `bounds-changed`: WindowBoundsChange[String, String] = js.native
    
    var `bounds-changing`: WindowBoundsChange[String, String] = js.native
    
    var closed: WindowEvent[String, String] = js.native
    
    var closing: WindowEvent[String, String] = js.native
    
    var `disabled-movement-bounds-changed`: WindowBoundsChange[String, String] = js.native
    
    var `disabled-movement-bounds-changing`: WindowBoundsChange[String, String] = js.native
    
    var `end-user-bounds-changing`: WindowEndBoundsChangingEvent[String, String] = js.native
    
    var focused: WindowEvent[String, String] = js.native
    
    var `group-changed`: WindowGroupChanged[String, String] = js.native
    
    var hidden: WindowHiddenEvent[String, String] = js.native
    
    var listenerRemoved: String = js.native
    
    var maximized: WindowEvent[String, String] = js.native
    
    var minimized: WindowEvent[String, String] = js.native
    
    var newListener: String = js.native
    
    var restored: WindowEvent[String, String] = js.native
    
    var shown: WindowEvent[String, String] = js.native
    
    var `user-movement-disabled`: WindowEvent[String, String] = js.native
    
    var `user-movement-enabled`: WindowEvent[String, String] = js.native
  }
  object ExternalWindowEvents {
    
    @scala.inline
    def apply(
      `begin-user-bounds-changing`: WindowBeginBoundsChangingEvent[String, String],
      blurred: WindowEvent[String, String],
      `bounds-changed`: WindowBoundsChange[String, String],
      `bounds-changing`: WindowBoundsChange[String, String],
      closed: WindowEvent[String, String],
      closing: WindowEvent[String, String],
      `disabled-movement-bounds-changed`: WindowBoundsChange[String, String],
      `disabled-movement-bounds-changing`: WindowBoundsChange[String, String],
      `end-user-bounds-changing`: WindowEndBoundsChangingEvent[String, String],
      focused: WindowEvent[String, String],
      `group-changed`: WindowGroupChanged[String, String],
      hidden: WindowHiddenEvent[String, String],
      listenerRemoved: String,
      maximized: WindowEvent[String, String],
      minimized: WindowEvent[String, String],
      newListener: String,
      restored: WindowEvent[String, String],
      shown: WindowEvent[String, String],
      `user-movement-disabled`: WindowEvent[String, String],
      `user-movement-enabled`: WindowEvent[String, String]
    ): ExternalWindowEvents = {
      val __obj = js.Dynamic.literal(blurred = blurred.asInstanceOf[js.Any], closed = closed.asInstanceOf[js.Any], closing = closing.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], maximized = maximized.asInstanceOf[js.Any], minimized = minimized.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], restored = restored.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any])
      __obj.updateDynamic("begin-user-bounds-changing")(`begin-user-bounds-changing`.asInstanceOf[js.Any])
      __obj.updateDynamic("bounds-changed")(`bounds-changed`.asInstanceOf[js.Any])
      __obj.updateDynamic("bounds-changing")(`bounds-changing`.asInstanceOf[js.Any])
      __obj.updateDynamic("disabled-movement-bounds-changed")(`disabled-movement-bounds-changed`.asInstanceOf[js.Any])
      __obj.updateDynamic("disabled-movement-bounds-changing")(`disabled-movement-bounds-changing`.asInstanceOf[js.Any])
      __obj.updateDynamic("end-user-bounds-changing")(`end-user-bounds-changing`.asInstanceOf[js.Any])
      __obj.updateDynamic("group-changed")(`group-changed`.asInstanceOf[js.Any])
      __obj.updateDynamic("user-movement-disabled")(`user-movement-disabled`.asInstanceOf[js.Any])
      __obj.updateDynamic("user-movement-enabled")(`user-movement-enabled`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalWindowEvents]
    }
    
    @scala.inline
    implicit class ExternalWindowEventsMutableBuilder[Self <: ExternalWindowEvents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setBegin-user-bounds-changing`(value: WindowBeginBoundsChangingEvent[String, String]): Self = StObject.set(x, "begin-user-bounds-changing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurred(value: WindowEvent[String, String]): Self = StObject.set(x, "blurred", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBounds-changed`(value: WindowBoundsChange[String, String]): Self = StObject.set(x, "bounds-changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBounds-changing`(value: WindowBoundsChange[String, String]): Self = StObject.set(x, "bounds-changing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosed(value: WindowEvent[String, String]): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosing(value: WindowEvent[String, String]): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDisabled-movement-bounds-changed`(value: WindowBoundsChange[String, String]): Self = StObject.set(x, "disabled-movement-bounds-changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDisabled-movement-bounds-changing`(value: WindowBoundsChange[String, String]): Self = StObject.set(x, "disabled-movement-bounds-changing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setEnd-user-bounds-changing`(value: WindowEndBoundsChangingEvent[String, String]): Self = StObject.set(x, "end-user-bounds-changing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocused(value: WindowEvent[String, String]): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGroup-changed`(value: WindowGroupChanged[String, String]): Self = StObject.set(x, "group-changed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidden(value: WindowHiddenEvent[String, String]): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenerRemoved(value: String): Self = StObject.set(x, "listenerRemoved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximized(value: WindowEvent[String, String]): Self = StObject.set(x, "maximized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimized(value: WindowEvent[String, String]): Self = StObject.set(x, "minimized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewListener(value: String): Self = StObject.set(x, "newListener", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestored(value: WindowEvent[String, String]): Self = StObject.set(x, "restored", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShown(value: WindowEvent[String, String]): Self = StObject.set(x, "shown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setUser-movement-disabled`(value: WindowEvent[String, String]): Self = StObject.set(x, "user-movement-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setUser-movement-enabled`(value: WindowEvent[String, String]): Self = StObject.set(x, "user-movement-enabled", value.asInstanceOf[js.Any])
    }
  }
}
