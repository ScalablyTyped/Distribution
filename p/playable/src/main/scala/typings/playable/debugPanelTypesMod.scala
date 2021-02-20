package typings.playable

import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debugPanelTypesMod {
  
  @js.native
  trait IDebugPanelHighlightStyles extends StObject {
    
    var boolean: String = js.native
    
    var key: String = js.native
    
    var `null`: String = js.native
    
    var number: String = js.native
    
    var string: String = js.native
  }
  object IDebugPanelHighlightStyles {
    
    @scala.inline
    def apply(boolean: String, key: String, `null`: String, number: String, string: String): IDebugPanelHighlightStyles = {
      val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
      __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDebugPanelHighlightStyles]
    }
    
    @scala.inline
    implicit class IDebugPanelHighlightStylesMutableBuilder[Self <: IDebugPanelHighlightStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoolean(value: String): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNull(value: String): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDebugPanelViewCallbacks extends StObject {
    
    var onCloseButtonClick: EventListenerOrEventListenerObject = js.native
  }
  object IDebugPanelViewCallbacks {
    
    @scala.inline
    def apply(onCloseButtonClick: EventListenerOrEventListenerObject): IDebugPanelViewCallbacks = {
      val __obj = js.Dynamic.literal(onCloseButtonClick = onCloseButtonClick.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDebugPanelViewCallbacks]
    }
    
    @scala.inline
    implicit class IDebugPanelViewCallbacksMutableBuilder[Self <: IDebugPanelViewCallbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnCloseButtonClick(value: EventListenerOrEventListenerObject): Self = StObject.set(x, "onCloseButtonClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCloseButtonClickFunction1(value: /* evt */ Event => Unit): Self = StObject.set(x, "onCloseButtonClick", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IDebugPanelViewConfig extends StObject {
    
    var callbacks: IDebugPanelViewCallbacks = js.native
  }
  object IDebugPanelViewConfig {
    
    @scala.inline
    def apply(callbacks: IDebugPanelViewCallbacks): IDebugPanelViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDebugPanelViewConfig]
    }
    
    @scala.inline
    implicit class IDebugPanelViewConfigMutableBuilder[Self <: IDebugPanelViewConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbacks(value: IDebugPanelViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined playable.playable/dist/src/modules/ui/debug-panel/types.IDebugPanelHighlightStyles & {  debugPanel :string,   infoContainer :string,   closeButton :string,   hidden :string} */
  @js.native
  trait IDebugPanelViewStyles extends StObject {
    
    var boolean: String = js.native
    
    var closeButton: String = js.native
    
    var debugPanel: String = js.native
    
    var hidden: String = js.native
    
    var infoContainer: String = js.native
    
    var key: String = js.native
    
    var `null`: String = js.native
    
    var number: String = js.native
    
    var string: String = js.native
  }
  object IDebugPanelViewStyles {
    
    @scala.inline
    def apply(
      boolean: String,
      closeButton: String,
      debugPanel: String,
      hidden: String,
      infoContainer: String,
      key: String,
      `null`: String,
      number: String,
      string: String
    ): IDebugPanelViewStyles = {
      val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], closeButton = closeButton.asInstanceOf[js.Any], debugPanel = debugPanel.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], infoContainer = infoContainer.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
      __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDebugPanelViewStyles]
    }
    
    @scala.inline
    implicit class IDebugPanelViewStylesMutableBuilder[Self <: IDebugPanelViewStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoolean(value: String): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseButton(value: String): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugPanel(value: String): Self = StObject.set(x, "debugPanel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoContainer(value: String): Self = StObject.set(x, "infoContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNull(value: String): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
}
