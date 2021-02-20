package typings.playable

import typings.playable.textMapTypesMod.ITextMap
import typings.playable.themeTypesMod.IThemeService
import typings.playable.tooltipTypesMod.ITooltipService
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fullScreenTypesMod {
  
  @js.native
  trait IFullScreenControl extends StObject {
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def show(): Unit = js.native
  }
  object IFullScreenControl {
    
    @scala.inline
    def apply(destroy: () => Unit, getElement: () => HTMLElement, hide: () => Unit, show: () => Unit): IFullScreenControl = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[IFullScreenControl]
    }
    
    @scala.inline
    implicit class IFullScreenControlMutableBuilder[Self <: IFullScreenControl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IFullScreenViewCallbacks extends StObject {
    
    def onButtonClick(): Unit = js.native
  }
  object IFullScreenViewCallbacks {
    
    @scala.inline
    def apply(onButtonClick: () => Unit): IFullScreenViewCallbacks = {
      val __obj = js.Dynamic.literal(onButtonClick = js.Any.fromFunction0(onButtonClick))
      __obj.asInstanceOf[IFullScreenViewCallbacks]
    }
    
    @scala.inline
    implicit class IFullScreenViewCallbacksMutableBuilder[Self <: IFullScreenViewCallbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnButtonClick(value: () => Unit): Self = StObject.set(x, "onButtonClick", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IFullScreenViewConfig extends StObject {
    
    var callbacks: IFullScreenViewCallbacks = js.native
    
    var textMap: ITextMap = js.native
    
    var theme: IThemeService = js.native
    
    var tooltipService: ITooltipService = js.native
  }
  object IFullScreenViewConfig {
    
    @scala.inline
    def apply(
      callbacks: IFullScreenViewCallbacks,
      textMap: ITextMap,
      theme: IThemeService,
      tooltipService: ITooltipService
    ): IFullScreenViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFullScreenViewConfig]
    }
    
    @scala.inline
    implicit class IFullScreenViewConfigMutableBuilder[Self <: IFullScreenViewConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbacks(value: IFullScreenViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IFullScreenViewStyles extends StObject {
    
    var enterIcon: String = js.native
    
    var exitIcon: String = js.native
    
    var fullScreenControl: String = js.native
    
    var fullScreenToggle: String = js.native
    
    var hidden: String = js.native
    
    var icon: String = js.native
    
    var inFullScreen: String = js.native
  }
  object IFullScreenViewStyles {
    
    @scala.inline
    def apply(
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
    implicit class IFullScreenViewStylesMutableBuilder[Self <: IFullScreenViewStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnterIcon(value: String): Self = StObject.set(x, "enterIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitIcon(value: String): Self = StObject.set(x, "exitIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullScreenControl(value: String): Self = StObject.set(x, "fullScreenControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullScreenToggle(value: String): Self = StObject.set(x, "fullScreenToggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInFullScreen(value: String): Self = StObject.set(x, "inFullScreen", value.asInstanceOf[js.Any])
    }
  }
}
