package typings.playable

import typings.playable.textMapTypesMod.ITextMap
import typings.playable.themeTypesMod.IThemeService
import typings.playable.tooltipTypesMod.ITooltipService
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logoTypesMod {
  
  @js.native
  trait ILogoAPI extends StObject {
    
    var setLogo: js.UndefOr[js.Function1[/* src */ String, Unit]] = js.native
    
    var setLogoClickCallback: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Function0[Unit]], Unit]] = js.native
  }
  object ILogoAPI {
    
    @scala.inline
    def apply(): ILogoAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILogoAPI]
    }
    
    @scala.inline
    implicit class ILogoAPIMutableBuilder[Self <: ILogoAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSetLogo(value: /* src */ String => Unit): Self = StObject.set(x, "setLogo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetLogoClickCallback(value: /* callback */ js.UndefOr[js.Function0[Unit]] => Unit): Self = StObject.set(x, "setLogoClickCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetLogoClickCallbackUndefined: Self = StObject.set(x, "setLogoClickCallback", js.undefined)
      
      @scala.inline
      def setSetLogoUndefined: Self = StObject.set(x, "setLogo", js.undefined)
    }
  }
  
  @js.native
  trait ILogoControl extends StObject {
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setLogo(src: String): Unit = js.native
    
    def setLogoClickCallback(): Unit = js.native
    def setLogoClickCallback(callback: js.Function0[Unit]): Unit = js.native
    
    def show(): Unit = js.native
  }
  
  @js.native
  trait ILogoViewCallbacks extends StObject {
    
    def onLogoClick(): Unit = js.native
  }
  object ILogoViewCallbacks {
    
    @scala.inline
    def apply(onLogoClick: () => Unit): ILogoViewCallbacks = {
      val __obj = js.Dynamic.literal(onLogoClick = js.Any.fromFunction0(onLogoClick))
      __obj.asInstanceOf[ILogoViewCallbacks]
    }
    
    @scala.inline
    implicit class ILogoViewCallbacksMutableBuilder[Self <: ILogoViewCallbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnLogoClick(value: () => Unit): Self = StObject.set(x, "onLogoClick", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ILogoViewConfig extends StObject {
    
    var callbacks: ILogoViewCallbacks = js.native
    
    var logo: js.UndefOr[String] = js.native
    
    var textMap: ITextMap = js.native
    
    var theme: IThemeService = js.native
    
    var tooltipService: ITooltipService = js.native
  }
  object ILogoViewConfig {
    
    @scala.inline
    def apply(
      callbacks: ILogoViewCallbacks,
      textMap: ITextMap,
      theme: IThemeService,
      tooltipService: ITooltipService
    ): ILogoViewConfig = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], textMap = textMap.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltipService = tooltipService.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILogoViewConfig]
    }
    
    @scala.inline
    implicit class ILogoViewConfigMutableBuilder[Self <: ILogoViewConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbacks(value: ILogoViewCallbacks): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
      
      @scala.inline
      def setTextMap(value: ITextMap): Self = StObject.set(x, "textMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: IThemeService): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipService(value: ITooltipService): Self = StObject.set(x, "tooltipService", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ILogoViewStyles extends StObject {
    
    var hidden: String = js.native
    
    var logoButton: String = js.native
    
    var logoImage: String = js.native
    
    var logoWrapper: String = js.native
  }
  object ILogoViewStyles {
    
    @scala.inline
    def apply(hidden: String, logoButton: String, logoImage: String, logoWrapper: String): ILogoViewStyles = {
      val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], logoButton = logoButton.asInstanceOf[js.Any], logoImage = logoImage.asInstanceOf[js.Any], logoWrapper = logoWrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILogoViewStyles]
    }
    
    @scala.inline
    implicit class ILogoViewStylesMutableBuilder[Self <: ILogoViewStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogoButton(value: String): Self = StObject.set(x, "logoButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogoImage(value: String): Self = StObject.set(x, "logoImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogoWrapper(value: String): Self = StObject.set(x, "logoWrapper", value.asInstanceOf[js.Any])
    }
  }
}
