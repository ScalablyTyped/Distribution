package typings.playable

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaderTypesMod {
  
  trait ILoader extends StObject {
    
    def destroy(): Unit
    
    def getElement(): HTMLElement
    
    def hide(): Unit
    
    var isDelayedShowScheduled: Boolean
    
    def show(): Unit
    
    def stopDelayedShow(): Unit
  }
  object ILoader {
    
    @scala.inline
    def apply(
      destroy: () => Unit,
      getElement: () => HTMLElement,
      hide: () => Unit,
      isDelayedShowScheduled: Boolean,
      show: () => Unit,
      stopDelayedShow: () => Unit
    ): ILoader = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getElement = js.Any.fromFunction0(getElement), hide = js.Any.fromFunction0(hide), isDelayedShowScheduled = isDelayedShowScheduled.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), stopDelayedShow = js.Any.fromFunction0(stopDelayedShow))
      __obj.asInstanceOf[ILoader]
    }
    
    @scala.inline
    implicit class ILoaderMutableBuilder[Self <: ILoader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetElement(value: () => HTMLElement): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDelayedShowScheduled(value: Boolean): Self = StObject.set(x, "isDelayedShowScheduled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopDelayedShow(value: () => Unit): Self = StObject.set(x, "stopDelayedShow", js.Any.fromFunction0(value))
    }
  }
  
  trait ILoaderViewStyles extends StObject {
    
    var active: String
    
    var hidden: String
    
    var loader: String
  }
  object ILoaderViewStyles {
    
    @scala.inline
    def apply(active: String, hidden: String, loader: String): ILoaderViewStyles = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILoaderViewStyles]
    }
    
    @scala.inline
    implicit class ILoaderViewStylesMutableBuilder[Self <: ILoaderViewStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoader(value: String): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    }
  }
}
