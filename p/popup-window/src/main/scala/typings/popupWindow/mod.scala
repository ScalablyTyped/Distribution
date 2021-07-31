package typings.popupWindow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("popup-window", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with PopupWindow {
    def this(url: String) = this()
    def this(url: String, config: PopupWindowConfig) = this()
    def this(url: Unit, config: PopupWindowConfig) = this()
    
    /**
      * Accepts a callback - the callback is called when the window is closed.
      */
    /* CompleteClass */
    override def blocked(callback: js.Function1[/* win */ this.type, Unit]): PopupWindow = js.native
    
    /**
      * Close the browser window.
      */
    /* CompleteClass */
    override def close(): PopupWindow = js.native
    
    /**
      * Accepts a callback - the callback is called when the window is blocked from opening.
      */
    /* CompleteClass */
    override def closed(callback: js.Function1[/* win */ this.type, Unit]): PopupWindow = js.native
    
    /* CompleteClass */
    override val name: String = js.native
    
    /**
      * Open a new browser window.
      */
    /* CompleteClass */
    override def open(): PopupWindow = js.native
    
    /**
      * Accepts a callback - the callback is called when the window is opened.
      */
    /* CompleteClass */
    override def opened(callback: js.Function1[/* win */ this.type, Unit]): PopupWindow = js.native
    
    /* CompleteClass */
    override val url: String = js.native
  }
  
  trait PopupWindow extends StObject {
    
    /**
      * Accepts a callback - the callback is called when the window is closed.
      */
    def blocked(callback: js.Function1[/* win */ this.type, Unit]): PopupWindow
    
    /**
      * Close the browser window.
      */
    def close(): PopupWindow
    
    /**
      * Accepts a callback - the callback is called when the window is blocked from opening.
      */
    def closed(callback: js.Function1[/* win */ this.type, Unit]): PopupWindow
    
    val name: String
    
    /**
      * Open a new browser window.
      */
    def open(): PopupWindow
    
    /**
      * Accepts a callback - the callback is called when the window is opened.
      */
    def opened(callback: js.Function1[/* win */ this.type, Unit]): PopupWindow
    
    val url: String
  }
  object PopupWindow {
    
    @scala.inline
    def apply(
      blocked: js.Function1[PopupWindow, Unit] => PopupWindow,
      close: () => PopupWindow,
      closed: js.Function1[PopupWindow, Unit] => PopupWindow,
      name: String,
      open: () => PopupWindow,
      opened: js.Function1[PopupWindow, Unit] => PopupWindow,
      url: String
    ): PopupWindow = {
      val __obj = js.Dynamic.literal(blocked = js.Any.fromFunction1(blocked), close = js.Any.fromFunction0(close), closed = js.Any.fromFunction1(closed), name = name.asInstanceOf[js.Any], open = js.Any.fromFunction0(open), opened = js.Any.fromFunction1(opened), url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopupWindow]
    }
    
    @scala.inline
    implicit class PopupWindowMutableBuilder[Self <: PopupWindow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlocked(value: js.Function1[PopupWindow, Unit] => PopupWindow): Self = StObject.set(x, "blocked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClose(value: () => PopupWindow): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClosed(value: js.Function1[PopupWindow, Unit] => PopupWindow): Self = StObject.set(x, "closed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpen(value: () => PopupWindow): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOpened(value: js.Function1[PopupWindow, Unit] => PopupWindow): Self = StObject.set(x, "opened", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait PopupWindowConfig extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var location: js.UndefOr[Boolean] = js.undefined
    
    var menubar: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var resizable: js.UndefOr[Boolean] = js.undefined
    
    var scrollbars: js.UndefOr[Boolean] = js.undefined
    
    var status: js.UndefOr[Boolean] = js.undefined
    
    var toolbar: js.UndefOr[Boolean] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object PopupWindowConfig {
    
    @scala.inline
    def apply(): PopupWindowConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopupWindowConfig]
    }
    
    @scala.inline
    implicit class PopupWindowConfigMutableBuilder[Self <: PopupWindowConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setLocation(value: Boolean): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setMenubar(value: Boolean): Self = StObject.set(x, "menubar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenubarUndefined: Self = StObject.set(x, "menubar", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      @scala.inline
      def setScrollbars(value: Boolean): Self = StObject.set(x, "scrollbars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarsUndefined: Self = StObject.set(x, "scrollbars", js.undefined)
      
      @scala.inline
      def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setToolbar(value: Boolean): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
