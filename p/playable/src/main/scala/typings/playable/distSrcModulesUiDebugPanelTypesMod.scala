package typings.playable

import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiDebugPanelTypesMod {
  
  trait IDebugPanelHighlightStyles extends StObject {
    
    var boolean: String
    
    var key: String
    
    var `null`: String
    
    var number: String
    
    var string: String
  }
  object IDebugPanelHighlightStyles {
    
    inline def apply(boolean: String, key: String, `null`: String, number: String, string: String): IDebugPanelHighlightStyles = {
      val __obj = js.Dynamic.literal(boolean = boolean.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
      __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDebugPanelHighlightStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDebugPanelHighlightStyles] (val x: Self) extends AnyVal {
      
      inline def setBoolean(value: String): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNull(value: String): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDebugPanelViewCallbacks extends StObject {
    
    var onCloseButtonClick: EventListenerOrEventListenerObject
  }
  object IDebugPanelViewCallbacks {
    
    inline def apply(onCloseButtonClick: EventListenerOrEventListenerObject): IDebugPanelViewCallbacks = {
      val __obj = js.Dynamic.literal(onCloseButtonClick = onCloseButtonClick.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDebugPanelViewCallbacks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDebugPanelViewCallbacks] (val x: Self) extends AnyVal {
      
      inline def setOnCloseButtonClick(value: EventListenerOrEventListenerObject): Self = StObject.set(x, "onCloseButtonClick", value.asInstanceOf[js.Any])
      
      inline def setOnCloseButtonClickFunction1(value: /* evt */ Event => Unit): Self = StObject.set(x, "onCloseButtonClick", js.Any.fromFunction1(value))
    }
  }
  
  trait IDebugPanelViewConfig extends StObject {
    
    var callbacks: IDebugPanelViewCallbacks
  }
  object IDebugPanelViewConfig {
    
    inline def apply(callbacks: IDebugPanelViewCallbacks): IDebugPanelViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDebugPanelViewConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDebugPanelViewConfig] (val x: Self) extends AnyVal {
      
      inline def setCallbacks(value: IDebugPanelViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDebugPanelViewStyles
    extends StObject
       with IDebugPanelHighlightStyles {
    
    var closeButton: String
    
    var debugPanel: String
    
    var hidden: String
    
    var infoContainer: String
  }
  object IDebugPanelViewStyles {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: IDebugPanelViewStyles] (val x: Self) extends AnyVal {
      
      inline def setCloseButton(value: String): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
      
      inline def setDebugPanel(value: String): Self = StObject.set(x, "debugPanel", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setInfoContainer(value: String): Self = StObject.set(x, "infoContainer", value.asInstanceOf[js.Any])
    }
  }
}
