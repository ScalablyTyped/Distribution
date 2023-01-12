package typings.playable

import typings.playable.distSrcModulesTextMapTypesMod.ITextMap
import typings.playable.distSrcModulesUiCoreThemeTypesMod.IThemeService
import typings.playable.distSrcModulesUiCoreTooltipTypesMod.ITooltipService
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiControlsDownloadTypesMod {
  
  trait IDownloadButton extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    def setDownloadClickCallback(callback: js.Function0[Unit]): Unit
    
    def show(): Unit
  }
  object IDownloadButton {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: IDownloadButton] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setSetDownloadClickCallback(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "setDownloadClickCallback", js.Any.fromFunction1(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  trait IDownloadButtonAPI extends StObject {
    
    var setDownloadClickCallback: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Unit]] = js.undefined
  }
  object IDownloadButtonAPI {
    
    inline def apply(): IDownloadButtonAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDownloadButtonAPI]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDownloadButtonAPI] (val x: Self) extends AnyVal {
      
      inline def setSetDownloadClickCallback(value: /* callback */ js.Function0[Unit] => Unit): Self = StObject.set(x, "setDownloadClickCallback", js.Any.fromFunction1(value))
      
      inline def setSetDownloadClickCallbackUndefined: Self = StObject.set(x, "setDownloadClickCallback", js.undefined)
    }
  }
  
  trait IDownloadViewCallbacks extends StObject {
    
    def onButtonClick(): Unit
  }
  object IDownloadViewCallbacks {
    
    inline def apply(onButtonClick: () => Unit): IDownloadViewCallbacks = {
      val __obj = js.Dynamic.literal(onButtonClick = js.Any.fromFunction0(onButtonClick))
      __obj.asInstanceOf[IDownloadViewCallbacks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDownloadViewCallbacks] (val x: Self) extends AnyVal {
      
      inline def setOnButtonClick(value: () => Unit): Self = StObject.set(x, "onButtonClick", js.Any.fromFunction0(value))
    }
  }
  
  trait IDownloadViewConfig extends StObject {
    
    var callbacks: IDownloadViewCallbacks
    
    var textMap: ITextMap
    
    var theme: IThemeService
    
    var tooltipService: ITooltipService
  }
  object IDownloadViewConfig {
    
    inline def apply(
      callbacks: IDownloadViewCallbacks,
      textMap: ITextMap,
      theme: IThemeService,
      tooltipService: ITooltipService
    ): IDownloadViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDownloadViewConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDownloadViewConfig] (val x: Self) extends AnyVal {
      
      inline def setCallbacks(value: IDownloadViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDownloadViewStyles extends StObject {
    
    var buttonWrapper: String
    
    var downloadButton: String
    
    var hidden: String
  }
  object IDownloadViewStyles {
    
    inline def apply(buttonWrapper: String, downloadButton: String, hidden: String): IDownloadViewStyles = {
      val __obj = js.Dynamic.literal(buttonWrapper = buttonWrapper.asInstanceOf[js.Any], downloadButton = downloadButton.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDownloadViewStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDownloadViewStyles] (val x: Self) extends AnyVal {
      
      inline def setButtonWrapper(value: String): Self = StObject.set(x, "buttonWrapper", value.asInstanceOf[js.Any])
      
      inline def setDownloadButton(value: String): Self = StObject.set(x, "downloadButton", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    }
  }
}
