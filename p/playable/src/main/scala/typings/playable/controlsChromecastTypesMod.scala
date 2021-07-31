package typings.playable

import typings.playable.textMapTypesMod.ITextMap
import typings.playable.themeTypesMod.IThemeService
import typings.playable.tooltipTypesMod.ITooltipService
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlsChromecastTypesMod {
  
  trait IChromecastButton extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    def setChromecastButtonCallback(callback: js.Function): Unit
    
    def show(): Unit
  }
  object IChromecastButton {
    
    @scala.inline
    def apply(
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      setChromecastButtonCallback: js.Function => Unit,
      show: () => Unit
    ): IChromecastButton = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), setChromecastButtonCallback = js.Any.fromFunction1(setChromecastButtonCallback), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[IChromecastButton]
    }
    
    @scala.inline
    implicit class IChromecastButtonMutableBuilder[Self <: IChromecastButton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetChromecastButtonCallback(value: js.Function => Unit): Self = StObject.set(x, "setChromecastButtonCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  trait IChromecastStyles extends StObject {
    
    var buttonWrapper: String
    
    var downloadButton: String
    
    var hidden: String
  }
  object IChromecastStyles {
    
    @scala.inline
    def apply(buttonWrapper: String, downloadButton: String, hidden: String): IChromecastStyles = {
      val __obj = js.Dynamic.literal(buttonWrapper = buttonWrapper.asInstanceOf[js.Any], downloadButton = downloadButton.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any])
      __obj.asInstanceOf[IChromecastStyles]
    }
    
    @scala.inline
    implicit class IChromecastStylesMutableBuilder[Self <: IChromecastStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonWrapper(value: String): Self = StObject.set(x, "buttonWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadButton(value: String): Self = StObject.set(x, "downloadButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    }
  }
  
  trait IChromecastViewCallbacks extends StObject {
    
    var onButtonClick: js.Function
  }
  object IChromecastViewCallbacks {
    
    @scala.inline
    def apply(onButtonClick: js.Function): IChromecastViewCallbacks = {
      val __obj = js.Dynamic.literal(onButtonClick = onButtonClick.asInstanceOf[js.Any])
      __obj.asInstanceOf[IChromecastViewCallbacks]
    }
    
    @scala.inline
    implicit class IChromecastViewCallbacksMutableBuilder[Self <: IChromecastViewCallbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnButtonClick(value: js.Function): Self = StObject.set(x, "onButtonClick", value.asInstanceOf[js.Any])
    }
  }
  
  trait IChromecastViewConfig extends StObject {
    
    var callbacks: IChromecastViewCallbacks
    
    var textMap: ITextMap
    
    var theme: IThemeService
    
    var tooltipService: ITooltipService
  }
  object IChromecastViewConfig {
    
    @scala.inline
    def apply(
      callbacks: IChromecastViewCallbacks,
      textMap: ITextMap,
      theme: IThemeService,
      tooltipService: ITooltipService
    ): IChromecastViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
      __obj.asInstanceOf[IChromecastViewConfig]
    }
    
    @scala.inline
    implicit class IChromecastViewConfigMutableBuilder[Self <: IChromecastViewConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbacks(value: IChromecastViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
    }
  }
}
