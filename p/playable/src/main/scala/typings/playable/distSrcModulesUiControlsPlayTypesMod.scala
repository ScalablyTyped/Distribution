package typings.playable

import typings.playable.distSrcModulesTextMapTypesMod.ITextMap
import typings.playable.distSrcModulesUiCoreThemeTypesMod.IThemeService
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiControlsPlayTypesMod {
  
  trait IPlayControl extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
  }
  object IPlayControl {
    
    inline def apply(destroy: () => Unit, getElement: () => HTMLElement): IPlayControl = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement))
      __obj.asInstanceOf[IPlayControl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPlayControl] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
    }
  }
  
  trait IPlayViewCallbacks extends StObject {
    
    def onButtonClick(): Unit
  }
  object IPlayViewCallbacks {
    
    inline def apply(onButtonClick: () => Unit): IPlayViewCallbacks = {
      val __obj = js.Dynamic.literal(onButtonClick = js.Any.fromFunction0(onButtonClick))
      __obj.asInstanceOf[IPlayViewCallbacks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPlayViewCallbacks] (val x: Self) extends AnyVal {
      
      inline def setOnButtonClick(value: () => Unit): Self = StObject.set(x, "onButtonClick", js.Any.fromFunction0(value))
    }
  }
  
  trait IPlayViewConfig extends StObject {
    
    var callbacks: IPlayViewCallbacks
    
    var textMap: ITextMap
    
    var theme: IThemeService
  }
  object IPlayViewConfig {
    
    inline def apply(callbacks: IPlayViewCallbacks, textMap: ITextMap, theme: IThemeService): IPlayViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPlayViewConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPlayViewConfig] (val x: Self) extends AnyVal {
      
      inline def setCallbacks(value: IPlayViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPlayViewStyles extends StObject {
    
    var hidden: String
    
    var icon: String
    
    var paused: String
    
    var playControl: String
    
    var playbackToggle: String
  }
  object IPlayViewStyles {
    
    inline def apply(hidden: String, icon: String, paused: String, playControl: String, playbackToggle: String): IPlayViewStyles = {
      val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], playControl = playControl.asInstanceOf[js.Any], playbackToggle = playbackToggle.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPlayViewStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPlayViewStyles] (val x: Self) extends AnyVal {
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setPaused(value: String): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      inline def setPlayControl(value: String): Self = StObject.set(x, "playControl", value.asInstanceOf[js.Any])
      
      inline def setPlaybackToggle(value: String): Self = StObject.set(x, "playbackToggle", value.asInstanceOf[js.Any])
    }
  }
}
