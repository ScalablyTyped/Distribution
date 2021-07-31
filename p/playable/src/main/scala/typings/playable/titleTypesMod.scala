package typings.playable

import typings.playable.themeTypesMod.IThemeService
import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object titleTypesMod {
  
  @js.native
  trait ITitle extends StObject {
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setTitle(): Unit = js.native
    def setTitle(title: String): Unit = js.native
    
    def setTitleClickCallback(): Unit = js.native
    def setTitleClickCallback(callback: js.Function0[Unit]): Unit = js.native
    
    def show(): Unit = js.native
  }
  
  trait ITitleAPI extends StObject {
    
    var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], Unit]] = js.undefined
    
    var setTitleClickCallback: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Function0[Unit]], Unit]] = js.undefined
  }
  object ITitleAPI {
    
    @scala.inline
    def apply(): ITitleAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITitleAPI]
    }
    
    @scala.inline
    implicit class ITitleAPIMutableBuilder[Self <: ITitleAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetTitle(value: /* title */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTitleClickCallback(value: /* callback */ js.UndefOr[js.Function0[Unit]] => Unit): Self = StObject.set(x, "setTitleClickCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTitleClickCallbackUndefined: Self = StObject.set(x, "setTitleClickCallback", js.undefined)
      
      @scala.inline
      def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
    }
  }
  
  trait ITitleViewCallbacks extends StObject {
    
    var onClick: EventListenerOrEventListenerObject
  }
  object ITitleViewCallbacks {
    
    @scala.inline
    def apply(onClick: EventListenerOrEventListenerObject): ITitleViewCallbacks = {
      val __obj = js.Dynamic.literal(onClick = onClick.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITitleViewCallbacks]
    }
    
    @scala.inline
    implicit class ITitleViewCallbacksMutableBuilder[Self <: ITitleViewCallbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: EventListenerOrEventListenerObject): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClickFunction1(value: /* evt */ Event => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    }
  }
  
  trait ITitleViewConfig extends StObject {
    
    var callbacks: ITitleViewCallbacks
    
    var theme: IThemeService
  }
  object ITitleViewConfig {
    
    @scala.inline
    def apply(callbacks: ITitleViewCallbacks, theme: IThemeService): ITitleViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITitleViewConfig]
    }
    
    @scala.inline
    implicit class ITitleViewConfigMutableBuilder[Self <: ITitleViewConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbacks(value: ITitleViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITitleViewStyles extends StObject {
    
    var hidden: String
    
    var link: String
    
    var title: String
  }
  object ITitleViewStyles {
    
    @scala.inline
    def apply(hidden: String, link: String, title: String): ITitleViewStyles = {
      val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITitleViewStyles]
    }
    
    @scala.inline
    implicit class ITitleViewStylesMutableBuilder[Self <: ITitleViewStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
