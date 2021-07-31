package typings.playable

import typings.playable.textMapTypesMod.ITextMap
import typings.playable.themeTypesMod.IThemeService
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playTypesMod {
  
  trait IPlayControl extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
  }
  object IPlayControl {
    
    @scala.inline
    def apply(destroy: () => Unit, getElement: () => HTMLElement): IPlayControl = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement))
      __obj.asInstanceOf[IPlayControl]
    }
    
    @scala.inline
    implicit class IPlayControlMutableBuilder[Self <: IPlayControl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
    }
  }
  
  trait IPlayViewCallbacks extends StObject {
    
    def onButtonClick(): Unit
  }
  object IPlayViewCallbacks {
    
    @scala.inline
    def apply(onButtonClick: () => Unit): IPlayViewCallbacks = {
      val __obj = js.Dynamic.literal(onButtonClick = js.Any.fromFunction0(onButtonClick))
      __obj.asInstanceOf[IPlayViewCallbacks]
    }
    
    @scala.inline
    implicit class IPlayViewCallbacksMutableBuilder[Self <: IPlayViewCallbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnButtonClick(value: () => Unit): Self = StObject.set(x, "onButtonClick", js.Any.fromFunction0(value))
    }
  }
  
  trait IPlayViewConfig extends StObject {
    
    var callbacks: IPlayViewCallbacks
    
    var textMap: ITextMap
    
    var theme: IThemeService
  }
  object IPlayViewConfig {
    
    @scala.inline
    def apply(callbacks: IPlayViewCallbacks, textMap: ITextMap, theme: IThemeService): IPlayViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPlayViewConfig]
    }
    
    @scala.inline
    implicit class IPlayViewConfigMutableBuilder[Self <: IPlayViewConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbacks(value: IPlayViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(hidden: String, icon: String, paused: String, playControl: String, playbackToggle: String): IPlayViewStyles = {
      val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], playControl = playControl.asInstanceOf[js.Any], playbackToggle = playbackToggle.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPlayViewStyles]
    }
    
    @scala.inline
    implicit class IPlayViewStylesMutableBuilder[Self <: IPlayViewStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaused(value: String): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayControl(value: String): Self = StObject.set(x, "playControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaybackToggle(value: String): Self = StObject.set(x, "playbackToggle", value.asInstanceOf[js.Any])
    }
  }
}
