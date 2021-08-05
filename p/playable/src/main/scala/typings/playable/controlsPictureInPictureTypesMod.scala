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
    
    inline def apply(destroy: () => Unit, getElement: () => HTMLElement, hide: () => Unit, show: () => Unit): IPictureInPictureControl = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[IPictureInPictureControl]
    }
    
    extension [Self <: IPictureInPictureControl](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  trait IPictureInPictureViewCallbacks extends StObject {
    
    def onButtonClick(): Unit
  }
  object IPictureInPictureViewCallbacks {
    
    inline def apply(onButtonClick: () => Unit): IPictureInPictureViewCallbacks = {
      val __obj = js.Dynamic.literal(onButtonClick = js.Any.fromFunction0(onButtonClick))
      __obj.asInstanceOf[IPictureInPictureViewCallbacks]
    }
    
    extension [Self <: IPictureInPictureViewCallbacks](x: Self) {
      
      inline def setOnButtonClick(value: () => Unit): Self = StObject.set(x, "onButtonClick", js.Any.fromFunction0(value))
    }
  }
  
  trait IPictureInPictureViewConfig extends StObject {
    
    var callbacks: IPictureInPictureViewCallbacks
    
    var textMap: ITextMap
    
    var theme: IThemeService
    
    var tooltipService: ITooltipService
  }
  object IPictureInPictureViewConfig {
    
    inline def apply(
      callbacks: IPictureInPictureViewCallbacks,
      textMap: ITextMap,
      theme: IThemeService,
      tooltipService: ITooltipService
    ): IPictureInPictureViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPictureInPictureViewConfig]
    }
    
    extension [Self <: IPictureInPictureViewConfig](x: Self) {
      
      inline def setCallbacks(value: IPictureInPictureViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
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
    
    inline def apply(
      hidden: String,
      icon: String,
      inPictureInPicture: String,
      pictureInPictureControl: String,
      pictureInPictureToggle: String
    ): IPictureInPictureViewStyles = {
      val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], inPictureInPicture = inPictureInPicture.asInstanceOf[js.Any], pictureInPictureControl = pictureInPictureControl.asInstanceOf[js.Any], pictureInPictureToggle = pictureInPictureToggle.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPictureInPictureViewStyles]
    }
    
    extension [Self <: IPictureInPictureViewStyles](x: Self) {
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setInPictureInPicture(value: String): Self = StObject.set(x, "inPictureInPicture", value.asInstanceOf[js.Any])
      
      inline def setPictureInPictureControl(value: String): Self = StObject.set(x, "pictureInPictureControl", value.asInstanceOf[js.Any])
      
      inline def setPictureInPictureToggle(value: String): Self = StObject.set(x, "pictureInPictureToggle", value.asInstanceOf[js.Any])
    }
  }
}
