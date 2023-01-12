package typings.playable

import typings.playable.distSrcModulesTextMapTypesMod.ITextMap
import typings.playable.distSrcModulesUiCoreTooltipTypesMod.ITooltipService
import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiLiveIndicatorTypesMod {
  
  trait ILiveIndicator extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    var isActive: Boolean
    
    var isHidden: Boolean
    
    def show(): Unit
  }
  object ILiveIndicator {
    
    inline def apply(
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      isActive: Boolean,
      isHidden: Boolean,
      show: () => Unit
    ): ILiveIndicator = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), isActive = isActive.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[ILiveIndicator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ILiveIndicator] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  trait ILiveIndicatorViewCallbacks extends StObject {
    
    var onClick: EventListenerOrEventListenerObject
  }
  object ILiveIndicatorViewCallbacks {
    
    inline def apply(onClick: EventListenerOrEventListenerObject): ILiveIndicatorViewCallbacks = {
      val __obj = js.Dynamic.literal(onClick = onClick.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILiveIndicatorViewCallbacks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ILiveIndicatorViewCallbacks] (val x: Self) extends AnyVal {
      
      inline def setOnClick(value: EventListenerOrEventListenerObject): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      inline def setOnClickFunction1(value: /* evt */ Event => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    }
  }
  
  trait ILiveIndicatorViewConfig extends StObject {
    
    var callbacks: ILiveIndicatorViewCallbacks
    
    var textMap: ITextMap
    
    var tooltipService: ITooltipService
  }
  object ILiveIndicatorViewConfig {
    
    inline def apply(callbacks: ILiveIndicatorViewCallbacks, textMap: ITextMap, tooltipService: ITooltipService): ILiveIndicatorViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILiveIndicatorViewConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ILiveIndicatorViewConfig] (val x: Self) extends AnyVal {
      
      inline def setCallbacks(value: ILiveIndicatorViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
      
      inline def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
    }
  }
  
  trait ILiveIndicatorViewStyles extends StObject {
    
    var active: String
    
    var clickable: String
    
    var ended: String
    
    var hidden: String
    
    var liveIndicator: String
    
    var liveIndicatorButton: String
  }
  object ILiveIndicatorViewStyles {
    
    inline def apply(
      active: String,
      clickable: String,
      ended: String,
      hidden: String,
      liveIndicator: String,
      liveIndicatorButton: String
    ): ILiveIndicatorViewStyles = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], clickable = clickable.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], liveIndicator = liveIndicator.asInstanceOf[js.Any], liveIndicatorButton = liveIndicatorButton.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILiveIndicatorViewStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ILiveIndicatorViewStyles] (val x: Self) extends AnyVal {
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setClickable(value: String): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setEnded(value: String): Self = StObject.set(x, "ended", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setLiveIndicator(value: String): Self = StObject.set(x, "liveIndicator", value.asInstanceOf[js.Any])
      
      inline def setLiveIndicatorButton(value: String): Self = StObject.set(x, "liveIndicatorButton", value.asInstanceOf[js.Any])
    }
  }
}
