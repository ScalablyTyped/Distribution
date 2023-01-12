package typings.playable

import typings.playable.distSrcModulesUiCoreThemeTypesMod.IThemeService
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiControlsTimeTypesMod {
  
  trait ITimeControl extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    def reset(): Unit
    
    def show(): Unit
  }
  object ITimeControl {
    
    inline def apply(
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      reset: () => Unit,
      show: () => Unit
    ): ITimeControl = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), reset = js.Any.fromFunction0(reset), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[ITimeControl]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITimeControl] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  trait ITimeViewConfig extends StObject {
    
    var theme: IThemeService
  }
  object ITimeViewConfig {
    
    inline def apply(theme: IThemeService): ITimeViewConfig = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimeViewConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITimeViewConfig] (val x: Self) extends AnyVal {
      
      inline def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITimeViewStyles extends StObject {
    
    var current: String
    
    var duration: String
    
    var hidden: String
    
    var separator: String
    
    var time: String
    
    var timeWrapper: String
  }
  object ITimeViewStyles {
    
    inline def apply(
      current: String,
      duration: String,
      hidden: String,
      separator: String,
      time: String,
      timeWrapper: String
    ): ITimeViewStyles = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timeWrapper = timeWrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimeViewStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITimeViewStyles] (val x: Self) extends AnyVal {
      
      inline def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeWrapper(value: String): Self = StObject.set(x, "timeWrapper", value.asInstanceOf[js.Any])
    }
  }
}
