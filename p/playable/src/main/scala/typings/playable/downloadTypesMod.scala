package typings.playable

import typings.playable.textMapTypesMod.ITextMap
import typings.playable.themeTypesMod.IThemeService
import typings.playable.tooltipTypesMod.ITooltipService
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object downloadTypesMod {
  
  @js.native
  trait IDownloadButton extends StObject {
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setDownloadClickCallback(callback: js.Function0[Unit]): Unit = js.native
    
    def show(): Unit = js.native
  }
  object IDownloadButton {
    
    @scala.inline
    def apply(
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      setDownloadClickCallback: js.Function0[Unit] => Unit,
      show: () => Unit
    ): IDownloadButton = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), setDownloadClickCallback = js.Any.fromFunction1(setDownloadClickCallback), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[IDownloadButton]
    }
    
    @scala.inline
    implicit class IDownloadButtonMutableBuilder[Self <: IDownloadButton] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetDownloadClickCallback(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "setDownloadClickCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IDownloadButtonAPI extends StObject {
    
    var setDownloadClickCallback: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]] = js.native
  }
  object IDownloadButtonAPI {
    
    @scala.inline
    def apply(): IDownloadButtonAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDownloadButtonAPI]
    }
    
    @scala.inline
    implicit class IDownloadButtonAPIMutableBuilder[Self <: IDownloadButtonAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetDownloadClickCallback(value: /* callback */ js.Function0[Unit] => Unit): Self = StObject.set(x, "setDownloadClickCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDownloadClickCallbackUndefined: Self = StObject.set(x, "setDownloadClickCallback", js.undefined)
    }
  }
  
  @js.native
  trait IDownloadViewCallbacks extends StObject {
    
    def onButtonClick(): Unit = js.native
  }
  object IDownloadViewCallbacks {
    
    @scala.inline
    def apply(onButtonClick: () => Unit): IDownloadViewCallbacks = {
      val __obj = js.Dynamic.literal(onButtonClick = js.Any.fromFunction0(onButtonClick))
      __obj.asInstanceOf[IDownloadViewCallbacks]
    }
    
    @scala.inline
    implicit class IDownloadViewCallbacksMutableBuilder[Self <: IDownloadViewCallbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnButtonClick(value: () => Unit): Self = StObject.set(x, "onButtonClick", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IDownloadViewConfig extends StObject {
    
    var callbacks: IDownloadViewCallbacks = js.native
    
    var textMap: ITextMap = js.native
    
    var theme: IThemeService = js.native
    
    var tooltipService: ITooltipService = js.native
  }
  object IDownloadViewConfig {
    
    @scala.inline
    def apply(
      callbacks: IDownloadViewCallbacks,
      textMap: ITextMap,
      theme: IThemeService,
      tooltipService: ITooltipService
    ): IDownloadViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDownloadViewConfig]
    }
    
    @scala.inline
    implicit class IDownloadViewConfigMutableBuilder[Self <: IDownloadViewConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbacks(value: IDownloadViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDownloadViewStyles extends StObject {
    
    var buttonWrapper: String = js.native
    
    var downloadButton: String = js.native
    
    var hidden: String = js.native
  }
  object IDownloadViewStyles {
    
    @scala.inline
    def apply(buttonWrapper: String, downloadButton: String, hidden: String): IDownloadViewStyles = {
      val __obj = js.Dynamic.literal(buttonWrapper = buttonWrapper.asInstanceOf[js.Any], downloadButton = downloadButton.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDownloadViewStyles]
    }
    
    @scala.inline
    implicit class IDownloadViewStylesMutableBuilder[Self <: IDownloadViewStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonWrapper(value: String): Self = StObject.set(x, "buttonWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadButton(value: String): Self = StObject.set(x, "downloadButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    }
  }
}
