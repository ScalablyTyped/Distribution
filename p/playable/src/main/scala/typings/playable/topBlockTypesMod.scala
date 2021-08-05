package typings.playable

import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topBlockTypesMod {
  
  trait ITopBlock extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    def hideContent(): Unit
    
    def hideLiveIndicator(): Unit
    
    def hideTitle(): Unit
    
    var isFocused: Boolean
    
    def show(): Unit
    
    def showContent(): Unit
    
    def showLiveIndicator(): Unit
    
    def showTitle(): Unit
  }
  object ITopBlock {
    
    inline def apply(
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      hideContent: () => Unit,
      hideLiveIndicator: () => Unit,
      hideTitle: () => Unit,
      isFocused: Boolean,
      show: () => Unit,
      showContent: () => Unit,
      showLiveIndicator: () => Unit,
      showTitle: () => Unit
    ): ITopBlock = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), hideContent = js.Any.fromFunction0(hideContent), hideLiveIndicator = js.Any.fromFunction0(hideLiveIndicator), hideTitle = js.Any.fromFunction0(hideTitle), isFocused = isFocused.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), showContent = js.Any.fromFunction0(showContent), showLiveIndicator = js.Any.fromFunction0(showLiveIndicator), showTitle = js.Any.fromFunction0(showTitle))
      __obj.asInstanceOf[ITopBlock]
    }
    
    extension [Self <: ITopBlock](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setHideContent(value: () => Unit): Self = StObject.set(x, "hideContent", js.Any.fromFunction0(value))
      
      inline def setHideLiveIndicator(value: () => Unit): Self = StObject.set(x, "hideLiveIndicator", js.Any.fromFunction0(value))
      
      inline def setHideTitle(value: () => Unit): Self = StObject.set(x, "hideTitle", js.Any.fromFunction0(value))
      
      inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      inline def setShowContent(value: () => Unit): Self = StObject.set(x, "showContent", js.Any.fromFunction0(value))
      
      inline def setShowLiveIndicator(value: () => Unit): Self = StObject.set(x, "showLiveIndicator", js.Any.fromFunction0(value))
      
      inline def setShowTitle(value: () => Unit): Self = StObject.set(x, "showTitle", js.Any.fromFunction0(value))
    }
  }
  
  trait ITopBlockAPI extends StObject {
    
    var hideLiveIndicator: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var hideTitle: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var showLiveIndicator: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var showTitle: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ITopBlockAPI {
    
    inline def apply(): ITopBlockAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITopBlockAPI]
    }
    
    extension [Self <: ITopBlockAPI](x: Self) {
      
      inline def setHideLiveIndicator(value: () => Unit): Self = StObject.set(x, "hideLiveIndicator", js.Any.fromFunction0(value))
      
      inline def setHideLiveIndicatorUndefined: Self = StObject.set(x, "hideLiveIndicator", js.undefined)
      
      inline def setHideTitle(value: () => Unit): Self = StObject.set(x, "hideTitle", js.Any.fromFunction0(value))
      
      inline def setHideTitleUndefined: Self = StObject.set(x, "hideTitle", js.undefined)
      
      inline def setShowLiveIndicator(value: () => Unit): Self = StObject.set(x, "showLiveIndicator", js.Any.fromFunction0(value))
      
      inline def setShowLiveIndicatorUndefined: Self = StObject.set(x, "showLiveIndicator", js.undefined)
      
      inline def setShowTitle(value: () => Unit): Self = StObject.set(x, "showTitle", js.Any.fromFunction0(value))
      
      inline def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
    }
  }
  
  trait ITopBlockViewCallbacks extends StObject {
    
    var onBlockMouseMove: EventListenerOrEventListenerObject
    
    var onBlockMouseOut: EventListenerOrEventListenerObject
  }
  object ITopBlockViewCallbacks {
    
    inline def apply(
      onBlockMouseMove: EventListenerOrEventListenerObject,
      onBlockMouseOut: EventListenerOrEventListenerObject
    ): ITopBlockViewCallbacks = {
      val __obj = js.Dynamic.literal(onBlockMouseMove = onBlockMouseMove.asInstanceOf[js.Any], onBlockMouseOut = onBlockMouseOut.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITopBlockViewCallbacks]
    }
    
    extension [Self <: ITopBlockViewCallbacks](x: Self) {
      
      inline def setOnBlockMouseMove(value: EventListenerOrEventListenerObject): Self = StObject.set(x, "onBlockMouseMove", value.asInstanceOf[js.Any])
      
      inline def setOnBlockMouseMoveFunction1(value: /* evt */ Event => Unit): Self = StObject.set(x, "onBlockMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnBlockMouseOut(value: EventListenerOrEventListenerObject): Self = StObject.set(x, "onBlockMouseOut", value.asInstanceOf[js.Any])
      
      inline def setOnBlockMouseOutFunction1(value: /* evt */ Event => Unit): Self = StObject.set(x, "onBlockMouseOut", js.Any.fromFunction1(value))
    }
  }
  
  trait ITopBlockViewConfig extends StObject {
    
    var callbacks: ITopBlockViewCallbacks
    
    var elements: ITopBlockViewElements
  }
  object ITopBlockViewConfig {
    
    inline def apply(callbacks: ITopBlockViewCallbacks, elements: ITopBlockViewElements): ITopBlockViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITopBlockViewConfig]
    }
    
    extension [Self <: ITopBlockViewConfig](x: Self) {
      
      inline def setCallbacks(value: ITopBlockViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setElements(value: ITopBlockViewElements): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITopBlockViewElements extends StObject {
    
    var liveIndicator: HTMLElement
    
    var title: HTMLElement
  }
  object ITopBlockViewElements {
    
    inline def apply(liveIndicator: HTMLElement, title: HTMLElement): ITopBlockViewElements = {
      val __obj = js.Dynamic.literal(liveIndicator = liveIndicator.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITopBlockViewElements]
    }
    
    extension [Self <: ITopBlockViewElements](x: Self) {
      
      inline def setLiveIndicator(value: HTMLElement): Self = StObject.set(x, "liveIndicator", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: HTMLElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITopBlockViewStyles extends StObject {
    
    var activated: String
    
    var elementsContainer: String
    
    var hidden: String
    
    var liveIndicatorContainer: String
    
    var titleContainer: String
    
    var topBlock: String
  }
  object ITopBlockViewStyles {
    
    inline def apply(
      activated: String,
      elementsContainer: String,
      hidden: String,
      liveIndicatorContainer: String,
      titleContainer: String,
      topBlock: String
    ): ITopBlockViewStyles = {
      val __obj = js.Dynamic.literal(activated = activated.asInstanceOf[js.Any], elementsContainer = elementsContainer.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], liveIndicatorContainer = liveIndicatorContainer.asInstanceOf[js.Any], titleContainer = titleContainer.asInstanceOf[js.Any], topBlock = topBlock.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITopBlockViewStyles]
    }
    
    extension [Self <: ITopBlockViewStyles](x: Self) {
      
      inline def setActivated(value: String): Self = StObject.set(x, "activated", value.asInstanceOf[js.Any])
      
      inline def setElementsContainer(value: String): Self = StObject.set(x, "elementsContainer", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setLiveIndicatorContainer(value: String): Self = StObject.set(x, "liveIndicatorContainer", value.asInstanceOf[js.Any])
      
      inline def setTitleContainer(value: String): Self = StObject.set(x, "titleContainer", value.asInstanceOf[js.Any])
      
      inline def setTopBlock(value: String): Self = StObject.set(x, "topBlock", value.asInstanceOf[js.Any])
    }
  }
}
