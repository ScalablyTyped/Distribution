package typings.playable

import typings.playable.distSrcModulesUiCoreThemeTypesMod.IThemeService
import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiOverlayTypesMod {
  
  trait IOverlay extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    def setPoster(src: String): Unit
    
    def show(): Unit
  }
  object IOverlay {
    
    inline def apply(
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      setPoster: String => Unit,
      show: () => Unit
    ): IOverlay = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), setPoster = js.Any.fromFunction1(setPoster), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[IOverlay]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOverlay] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setSetPoster(value: String => Unit): Self = StObject.set(x, "setPoster", js.Any.fromFunction1(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  trait IOverlayAPI extends StObject {
    
    var hideOverlay: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var setPoster: js.UndefOr[js.Function1[/* src */ String, Unit]] = js.undefined
    
    var showOverlay: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object IOverlayAPI {
    
    inline def apply(): IOverlayAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOverlayAPI]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOverlayAPI] (val x: Self) extends AnyVal {
      
      inline def setHideOverlay(value: () => Unit): Self = StObject.set(x, "hideOverlay", js.Any.fromFunction0(value))
      
      inline def setHideOverlayUndefined: Self = StObject.set(x, "hideOverlay", js.undefined)
      
      inline def setSetPoster(value: /* src */ String => Unit): Self = StObject.set(x, "setPoster", js.Any.fromFunction1(value))
      
      inline def setSetPosterUndefined: Self = StObject.set(x, "setPoster", js.undefined)
      
      inline def setShowOverlay(value: () => Unit): Self = StObject.set(x, "showOverlay", js.Any.fromFunction0(value))
      
      inline def setShowOverlayUndefined: Self = StObject.set(x, "showOverlay", js.undefined)
    }
  }
  
  trait IOverlayViewCallbacks extends StObject {
    
    var onPlayClick: EventListenerOrEventListenerObject
  }
  object IOverlayViewCallbacks {
    
    inline def apply(onPlayClick: EventListenerOrEventListenerObject): IOverlayViewCallbacks = {
      val __obj = js.Dynamic.literal(onPlayClick = onPlayClick.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOverlayViewCallbacks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOverlayViewCallbacks] (val x: Self) extends AnyVal {
      
      inline def setOnPlayClick(value: EventListenerOrEventListenerObject): Self = StObject.set(x, "onPlayClick", value.asInstanceOf[js.Any])
      
      inline def setOnPlayClickFunction1(value: /* evt */ Event => Unit): Self = StObject.set(x, "onPlayClick", js.Any.fromFunction1(value))
    }
  }
  
  trait IOverlayViewConfig extends StObject {
    
    var callbacks: IOverlayViewCallbacks
    
    var theme: IThemeService
  }
  object IOverlayViewConfig {
    
    inline def apply(callbacks: IOverlayViewCallbacks, theme: IThemeService): IOverlayViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOverlayViewConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOverlayViewConfig] (val x: Self) extends AnyVal {
      
      inline def setCallbacks(value: IOverlayViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IOverlayViewStyles extends StObject {
    
    var active: String
    
    var hidden: String
    
    var overlay: String
    
    var poster: String
    
    var transparency: String
  }
  object IOverlayViewStyles {
    
    inline def apply(active: String, hidden: String, overlay: String, poster: String, transparency: String): IOverlayViewStyles = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any], poster = poster.asInstanceOf[js.Any], transparency = transparency.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOverlayViewStyles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOverlayViewStyles] (val x: Self) extends AnyVal {
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setOverlay(value: String): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
      
      inline def setTransparency(value: String): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
    }
  }
}
