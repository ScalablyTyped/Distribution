package typings.playable

import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topBlockTypesMod {
  
  @js.native
  trait ITopBlock extends StObject {
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def hideContent(): Unit = js.native
    
    def hideLiveIndicator(): Unit = js.native
    
    def hideTitle(): Unit = js.native
    
    var isFocused: Boolean = js.native
    
    def show(): Unit = js.native
    
    def showContent(): Unit = js.native
    
    def showLiveIndicator(): Unit = js.native
    
    def showTitle(): Unit = js.native
  }
  object ITopBlock {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ITopBlockMutableBuilder[Self <: ITopBlock] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHideContent(value: () => Unit): Self = StObject.set(x, "hideContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHideLiveIndicator(value: () => Unit): Self = StObject.set(x, "hideLiveIndicator", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHideTitle(value: () => Unit): Self = StObject.set(x, "hideTitle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowContent(value: () => Unit): Self = StObject.set(x, "showContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowLiveIndicator(value: () => Unit): Self = StObject.set(x, "showLiveIndicator", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowTitle(value: () => Unit): Self = StObject.set(x, "showTitle", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ITopBlockAPI extends StObject {
    
    var hideLiveIndicator: js.UndefOr[js.Function0[Unit]] = js.native
    
    var hideTitle: js.UndefOr[js.Function0[Unit]] = js.native
    
    var showLiveIndicator: js.UndefOr[js.Function0[Unit]] = js.native
    
    var showTitle: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object ITopBlockAPI {
    
    @scala.inline
    def apply(): ITopBlockAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITopBlockAPI]
    }
    
    @scala.inline
    implicit class ITopBlockAPIMutableBuilder[Self <: ITopBlockAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHideLiveIndicator(value: () => Unit): Self = StObject.set(x, "hideLiveIndicator", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHideLiveIndicatorUndefined: Self = StObject.set(x, "hideLiveIndicator", js.undefined)
      
      @scala.inline
      def setHideTitle(value: () => Unit): Self = StObject.set(x, "hideTitle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHideTitleUndefined: Self = StObject.set(x, "hideTitle", js.undefined)
      
      @scala.inline
      def setShowLiveIndicator(value: () => Unit): Self = StObject.set(x, "showLiveIndicator", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowLiveIndicatorUndefined: Self = StObject.set(x, "showLiveIndicator", js.undefined)
      
      @scala.inline
      def setShowTitle(value: () => Unit): Self = StObject.set(x, "showTitle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
    }
  }
  
  @js.native
  trait ITopBlockViewCallbacks extends StObject {
    
    var onBlockMouseMove: EventListenerOrEventListenerObject = js.native
    
    var onBlockMouseOut: EventListenerOrEventListenerObject = js.native
  }
  object ITopBlockViewCallbacks {
    
    @scala.inline
    def apply(
      onBlockMouseMove: EventListenerOrEventListenerObject,
      onBlockMouseOut: EventListenerOrEventListenerObject
    ): ITopBlockViewCallbacks = {
      val __obj = js.Dynamic.literal(onBlockMouseMove = onBlockMouseMove.asInstanceOf[js.Any], onBlockMouseOut = onBlockMouseOut.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITopBlockViewCallbacks]
    }
    
    @scala.inline
    implicit class ITopBlockViewCallbacksMutableBuilder[Self <: ITopBlockViewCallbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnBlockMouseMove(value: EventListenerOrEventListenerObject): Self = StObject.set(x, "onBlockMouseMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBlockMouseMoveFunction1(value: /* evt */ Event => Unit): Self = StObject.set(x, "onBlockMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlockMouseOut(value: EventListenerOrEventListenerObject): Self = StObject.set(x, "onBlockMouseOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBlockMouseOutFunction1(value: /* evt */ Event => Unit): Self = StObject.set(x, "onBlockMouseOut", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ITopBlockViewConfig extends StObject {
    
    var callbacks: ITopBlockViewCallbacks = js.native
    
    var elements: ITopBlockViewElements = js.native
  }
  object ITopBlockViewConfig {
    
    @scala.inline
    def apply(callbacks: ITopBlockViewCallbacks, elements: ITopBlockViewElements): ITopBlockViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITopBlockViewConfig]
    }
    
    @scala.inline
    implicit class ITopBlockViewConfigMutableBuilder[Self <: ITopBlockViewConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbacks(value: ITopBlockViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElements(value: ITopBlockViewElements): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITopBlockViewElements extends StObject {
    
    var liveIndicator: HTMLElement = js.native
    
    var title: HTMLElement = js.native
  }
  object ITopBlockViewElements {
    
    @scala.inline
    def apply(liveIndicator: HTMLElement, title: HTMLElement): ITopBlockViewElements = {
      val __obj = js.Dynamic.literal(liveIndicator = liveIndicator.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITopBlockViewElements]
    }
    
    @scala.inline
    implicit class ITopBlockViewElementsMutableBuilder[Self <: ITopBlockViewElements] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLiveIndicator(value: HTMLElement): Self = StObject.set(x, "liveIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: HTMLElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITopBlockViewStyles extends StObject {
    
    var activated: String = js.native
    
    var elementsContainer: String = js.native
    
    var hidden: String = js.native
    
    var liveIndicatorContainer: String = js.native
    
    var titleContainer: String = js.native
    
    var topBlock: String = js.native
  }
  object ITopBlockViewStyles {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ITopBlockViewStylesMutableBuilder[Self <: ITopBlockViewStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivated(value: String): Self = StObject.set(x, "activated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementsContainer(value: String): Self = StObject.set(x, "elementsContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLiveIndicatorContainer(value: String): Self = StObject.set(x, "liveIndicatorContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleContainer(value: String): Self = StObject.set(x, "titleContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopBlock(value: String): Self = StObject.set(x, "topBlock", value.asInstanceOf[js.Any])
    }
  }
}
