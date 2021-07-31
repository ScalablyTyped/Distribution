package typings.playable

import org.scalablytyped.runtime.StringDictionary
import typings.playable.coreTypesMod.IStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeTypesMod {
  
  trait ICSSRule
    extends StObject
       with /* cssPropName */ StringDictionary[String | ICSSRuleFunction | ICSSRule]
  object ICSSRule {
    
    @scala.inline
    def apply(): ICSSRule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICSSRule]
    }
  }
  
  type ICSSRuleFunction = js.Function1[/* data */ js.Any, String]
  
  type ICSSRules = StringDictionary[ICSSRule]
  
  trait IThemeAPI extends StObject {
    
    var updateTheme: js.UndefOr[js.Function1[/* themeConfig */ IThemeConfig, Unit]] = js.undefined
  }
  object IThemeAPI {
    
    @scala.inline
    def apply(): IThemeAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IThemeAPI]
    }
    
    @scala.inline
    implicit class IThemeAPIMutableBuilder[Self <: IThemeAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUpdateTheme(value: /* themeConfig */ IThemeConfig => Unit): Self = StObject.set(x, "updateTheme", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateThemeUndefined: Self = StObject.set(x, "updateTheme", js.undefined)
    }
  }
  
  trait IThemeConfig extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var progressColor: js.UndefOr[String] = js.undefined
  }
  object IThemeConfig {
    
    @scala.inline
    def apply(): IThemeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IThemeConfig]
    }
    
    @scala.inline
    implicit class IThemeConfigMutableBuilder[Self <: IThemeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setProgressColor(value: String): Self = StObject.set(x, "progressColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressColorUndefined: Self = StObject.set(x, "progressColor", js.undefined)
    }
  }
  
  trait IThemeService extends StObject {
    
    def destroy(): Unit
    
    def get(module: js.Object): IStyles
    
    def registerModuleTheme(module: js.Object, rules: ICSSRules): Unit
    
    def updateTheme(config: IThemeConfig): Unit
  }
  object IThemeService {
    
    @scala.inline
    def apply(
      destroy: () => Unit,
      get: js.Object => IStyles,
      registerModuleTheme: (js.Object, ICSSRules) => Unit,
      updateTheme: IThemeConfig => Unit
    ): IThemeService = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), get = js.Any.fromFunction1(get), registerModuleTheme = js.Any.fromFunction2(registerModuleTheme), updateTheme = js.Any.fromFunction1(updateTheme))
      __obj.asInstanceOf[IThemeService]
    }
    
    @scala.inline
    implicit class IThemeServiceMutableBuilder[Self <: IThemeService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet(value: js.Object => IStyles): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegisterModuleTheme(value: (js.Object, ICSSRules) => Unit): Self = StObject.set(x, "registerModuleTheme", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdateTheme(value: IThemeConfig => Unit): Self = StObject.set(x, "updateTheme", js.Any.fromFunction1(value))
    }
  }
}
