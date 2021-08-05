package typings.next.anon

import typings.next.routerMod.AppComponent
import typings.next.routerMod.PrivateRouteInfo
import typings.next.routerMod.Subscription
import typings.react.mod.ComponentType
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait App extends StObject {
  
  var App: AppComponent
  
  var Component: ComponentType[js.Object]
  
  var defaultLocale: js.UndefOr[String] = js.undefined
  
  var err: js.UndefOr[Error] = js.undefined
  
  var initialProps: js.Any
  
  var isFallback: Boolean
  
  var locale: js.UndefOr[String] = js.undefined
  
  var locales: js.UndefOr[js.Array[String]] = js.undefined
  
  var pageLoader: js.Any
  
  var subscription: Subscription
  
  def wrapApp(App: AppComponent): js.Any
}
object App {
  
  inline def apply(
    App: AppComponent,
    Component: ComponentType[js.Object],
    initialProps: js.Any,
    isFallback: Boolean,
    pageLoader: js.Any,
    subscription: (/* data */ PrivateRouteInfo, /* App */ AppComponent) => js.Promise[Unit],
    wrapApp: AppComponent => js.Any
  ): App = {
    val __obj = js.Dynamic.literal(App = App.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], initialProps = initialProps.asInstanceOf[js.Any], isFallback = isFallback.asInstanceOf[js.Any], pageLoader = pageLoader.asInstanceOf[js.Any], subscription = js.Any.fromFunction2(subscription), wrapApp = js.Any.fromFunction1(wrapApp))
    __obj.asInstanceOf[App]
  }
  
  extension [Self <: App](x: Self) {
    
    inline def setApp(value: AppComponent): Self = StObject.set(x, "App", value.asInstanceOf[js.Any])
    
    inline def setComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
    
    inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
    
    inline def setErr(value: Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    
    inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
    
    inline def setInitialProps(value: js.Any): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
    
    inline def setIsFallback(value: Boolean): Self = StObject.set(x, "isFallback", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
    
    inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value :_*))
    
    inline def setPageLoader(value: js.Any): Self = StObject.set(x, "pageLoader", value.asInstanceOf[js.Any])
    
    inline def setSubscription(value: (/* data */ PrivateRouteInfo, /* App */ AppComponent) => js.Promise[Unit]): Self = StObject.set(x, "subscription", js.Any.fromFunction2(value))
    
    inline def setWrapApp(value: AppComponent => js.Any): Self = StObject.set(x, "wrapApp", js.Any.fromFunction1(value))
  }
}
