package typings.playable

import typings.playable.textMapTypesMod.ITextMap
import typings.playable.themeTypesMod.IThemeService
import typings.playable.tooltipTypesMod.ITooltipService
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlsPictureInPictureTypesMod {
  
  trait IPictureInPictureControl extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    def show(): Unit
  }
  object IPictureInPictureControl {
    
    @scala.inline
    def apply(destroy: () => Unit, getElement: () => HTMLElement, hide: () => Unit, show: () => Unit): IPictureInPictureControl = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[IPictureInPictureControl]
    }
    
    @scala.inline
    implicit class IPictureInPictureControlMutableBuilder[Self <: IPictureInPictureControl] (val x: Self) extends AnyVal {
      
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
  
  trait IPictureInPictureViewCallbacks extends StObject {
    
    def onButtonClick(): Unit
  }
  object IPictureInPictureViewCallbacks {
    
    @scala.inline
    def apply(onButtonClick: () => Unit): IPictureInPictureViewCallbacks = {
      val __obj = js.Dynamic.literal(onButtonClick = js.Any.fromFunction0(onButtonClick))
      __obj.asInstanceOf[IPictureInPictureViewCallbacks]
    }
    
    @scala.inline
    implicit class IPictureInPictureViewCallbacksMutableBuilder[Self <: IPictureInPictureViewCallbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnButtonClick(value: () => Unit): Self = StObject.set(x, "onButtonClick", js.Any.fromFunction0(value))
    }
  }
  
  trait IPictureInPictureViewConfig extends StObject {
    
    var callbacks: IPictureInPictureViewCallbacks
    
    var textMap: ITextMap
    
    var theme: IThemeService
    
    var tooltipService: ITooltipService
  }
  object IPictureInPictureViewConfig {
    
    @scala.inline
    def apply(
      callbacks: IPictureInPictureViewCallbacks,
      textMap: ITextMap,
      theme: IThemeService,
      tooltipService: ITooltipService
    ): IPictureInPictureViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPictureInPictureViewConfig]
    }
    
    @scala.inline
    implicit class IPictureInPictureViewConfigMutableBuilder[Self <: IPictureInPictureViewConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbacks(value: IPictureInPictureViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPictureInPictureViewStyles extends StObject {
    
    var hidden: String
    
    var icon: String
    
    var inPictureInPicture: String
    
    var pictureInPictureControl: String
    
    var pictureInPictureToggle: String
  }
  object IPictureInPictureViewStyles {
    
    @scala.inline
    def apply(
      hidden: String,
      icon: String,
      inPictureInPicture: String,
      pictureInPictureControl: String,
      pictureInPictureToggle: String
    ): IPictureInPictureViewStyles = {
      val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], inPictureInPicture = inPictureInPicture.asInstanceOf[js.Any], pictureInPictureControl = pictureInPictureControl.asInstanceOf[js.Any], pictureInPictureToggle = pictureInPictureToggle.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPictureInPictureViewStyles]
    }
    
    @scala.inline
    implicit class IPictureInPictureViewStylesMutableBuilder[Self <: IPictureInPictureViewStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInPictureInPicture(value: String): Self = StObject.set(x, "inPictureInPicture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPictureInPictureControl(value: String): Self = StObject.set(x, "pictureInPictureControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPictureInPictureToggle(value: String): Self = StObject.set(x, "pictureInPictureToggle", value.asInstanceOf[js.Any])
    }
  }
}
