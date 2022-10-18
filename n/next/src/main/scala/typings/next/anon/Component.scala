package typings.next.anon

import typings.next.distSharedLibRouterRouterMod.AppComponent
import typings.next.distSharedLibRouterRouterMod.PrivateRouteInfo
import typings.next.distSharedLibRouterRouterMod.Subscription
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component extends StObject {
  
  var App: AppComponent
  
  var Component: ComponentType[js.Object]
  
  var defaultLocale: js.UndefOr[String] = js.undefined
  
  var domainLocales: js.UndefOr[js.Array[typings.next.distServerConfigSharedMod.DomainLocale]] = js.undefined
  
  var err: js.UndefOr[js.Error] = js.undefined
  
  var initialProps: Any
  
  var isFallback: Boolean
  
  var isPreview: js.UndefOr[Boolean] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var locales: js.UndefOr[js.Array[String]] = js.undefined
  
  var pageLoader: Any
  
  var subscription: Subscription
  
  def wrapApp(WrapAppComponent: AppComponent): Any
}
object Component {
  
  inline def apply(
    App: AppComponent,
    Component: ComponentType[js.Object],
    initialProps: Any,
    isFallback: Boolean,
    pageLoader: Any,
    subscription: (/* data */ PrivateRouteInfo, /* App */ AppComponent, /* resetScroll */ X | Null) => js.Promise[Unit],
    wrapApp: AppComponent => Any
  ): Component = {
    val __obj = js.Dynamic.literal(App = App.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], initialProps = initialProps.asInstanceOf[js.Any], isFallback = isFallback.asInstanceOf[js.Any], pageLoader = pageLoader.asInstanceOf[js.Any], subscription = js.Any.fromFunction3(subscription), wrapApp = js.Any.fromFunction1(wrapApp))
    __obj.asInstanceOf[Component]
  }
  
  extension [Self <: Component](x: Self) {
    
    inline def setApp(value: AppComponent): Self = StObject.set(x, "App", value.asInstanceOf[js.Any])
    
    inline def setComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
    
    inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
    
    inline def setDomainLocales(value: js.Array[typings.next.distServerConfigSharedMod.DomainLocale]): Self = StObject.set(x, "domainLocales", value.asInstanceOf[js.Any])
    
    inline def setDomainLocalesUndefined: Self = StObject.set(x, "domainLocales", js.undefined)
    
    inline def setDomainLocalesVarargs(value: typings.next.distServerConfigSharedMod.DomainLocale*): Self = StObject.set(x, "domainLocales", js.Array(value*))
    
    inline def setErr(value: js.Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    
    inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
    
    inline def setInitialProps(value: Any): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
    
    inline def setIsFallback(value: Boolean): Self = StObject.set(x, "isFallback", value.asInstanceOf[js.Any])
    
    inline def setIsPreview(value: Boolean): Self = StObject.set(x, "isPreview", value.asInstanceOf[js.Any])
    
    inline def setIsPreviewUndefined: Self = StObject.set(x, "isPreview", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
    
    inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
    
    inline def setPageLoader(value: Any): Self = StObject.set(x, "pageLoader", value.asInstanceOf[js.Any])
    
    inline def setSubscription(
      value: (/* data */ PrivateRouteInfo, /* App */ AppComponent, /* resetScroll */ X | Null) => js.Promise[Unit]
    ): Self = StObject.set(x, "subscription", js.Any.fromFunction3(value))
    
    inline def setWrapApp(value: AppComponent => Any): Self = StObject.set(x, "wrapApp", js.Any.fromFunction1(value))
  }
}
