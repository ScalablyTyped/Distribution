package typings.playable

import typings.playable.distSrcModulesTextMapTypesMod.ITextMap
import typings.playable.distSrcModulesUiCoreThemeTypesMod.IThemeService
import typings.playable.distSrcModulesUiCoreTooltipTypesMod.ITooltipService
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiControlsFullScreenTypesMod {
  
  trait IFullScreenControl extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    def show(): Unit
  }
  object IFullScreenControl {
    
    inline def apply(destroy: () => Unit, getElement: () => HTMLElement, hide: () => Unit, show: () => Unit): IFullScreenControl = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[IFullScreenControl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFullScreenControl] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  trait IFullScreenViewCallbacks extends StObject {
    
    def onButtonClick(): Unit
  }
  object IFullScreenViewCallbacks {
    
    inline def apply(onButtonClick: () => Unit): IFullScreenViewCallbacks = {
      val __obj = js.Dynamic.literal(onButtonClick = js.Any.fromFunction0(onButtonClick))
      __obj.asInstanceOf[IFullScreenViewCallbacks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFullScreenViewCallbacks] (val x: Self) extends AnyVal {
      
      inline def setOnButtonClick(value: () => Unit): Self = StObject.set(x, "onButtonClick", js.Any.fromFunction0(value))
    }
  }
  
  trait IFullScreenViewConfig extends StObject {
    
    var callbacks: IFullScreenViewCallbacks
    
    var textMap: ITextMap
    
    var theme: IThemeService
    
    var tooltipService: ITooltipService
  }
  object IFullScreenViewConfig {
    
    inline def apply(
      callbacks: IFullScreenViewCallbacks,
      textMap: ITextMap,
      theme: IThemeService,
      tooltipService: ITooltipService
    ): IFullScreenViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFullScreenViewConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFullScreenViewConfig] (val x: Self) extends AnyVal {
      
      inline def setCallbacks(value: IFullScreenViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFullScreenViewStyles extends StObject {
    
    var enterIcon: String
    
    var exitIcon: String
    
    var fullScreenControl: String
    
    var fullScreenToggle: String
    
    var hidden: String
    
    var icon: String
    
    var inFullScreen: String
  }
  object IFullScreenViewStyles {
    
    inline def apply(
      enterIcon: String,
      exitIcon: String,
      fullScreenControl: String,
      fullScreenToggle: String,
      hidden: String,
      icon: String,
      inFullScreen: String
    ): IFullScreenViewStyles = {
      val __obj = js.Dynamic.literal(enterIcon = enterIcon.asInstanceOf[js.Any], exitIcon = exitIcon.asInstanceOf[js.Any], fullScreenControl = fullScreenControl.asInstanceOf[js.Any], fullScreenToggle = fullScreenToggle.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], inFullScreen = inFullScreen.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFullScreenViewStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IFullScreenViewStyles] (val x: Self) extends AnyVal {
      
      inline def setEnterIcon(value: String): Self = StObject.set(x, "enterIcon", value.asInstanceOf[js.Any])
      
      inline def setExitIcon(value: String): Self = StObject.set(x, "exitIcon", value.asInstanceOf[js.Any])
      
      inline def setFullScreenControl(value: String): Self = StObject.set(x, "fullScreenControl", value.asInstanceOf[js.Any])
      
      inline def setFullScreenToggle(value: String): Self = StObject.set(x, "fullScreenToggle", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setInFullScreen(value: String): Self = StObject.set(x, "inFullScreen", value.asInstanceOf[js.Any])
    }
  }
}
