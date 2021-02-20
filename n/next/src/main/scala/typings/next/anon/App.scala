package typings.next.anon

import typings.next.routerMod.AppComponent
import typings.next.routerMod.PrivateRouteInfo
import typings.next.routerMod.Subscription
import typings.react.mod.ComponentType
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait App extends StObject {
  
  var App: AppComponent = js.native
  
  var Component: ComponentType[js.Object] = js.native
  
  var defaultLocale: js.UndefOr[String] = js.native
  
  var err: js.UndefOr[Error] = js.native
  
  var initialProps: js.Any = js.native
  
  var isFallback: Boolean = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var locales: js.UndefOr[js.Array[String]] = js.native
  
  var pageLoader: js.Any = js.native
  
  var subscription: Subscription = js.native
  
  def wrapApp(App: AppComponent): js.Any = js.native
}
object App {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class AppMutableBuilder[Self <: App] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: AppComponent): Self = StObject.set(x, "App", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
    
    @scala.inline
    def setErr(value: Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
    
    @scala.inline
    def setInitialProps(value: js.Any): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFallback(value: Boolean): Self = StObject.set(x, "isFallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
    
    @scala.inline
    def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value :_*))
    
    @scala.inline
    def setPageLoader(value: js.Any): Self = StObject.set(x, "pageLoader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription(value: (/* data */ PrivateRouteInfo, /* App */ AppComponent) => js.Promise[Unit]): Self = StObject.set(x, "subscription", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapApp(value: AppComponent => js.Any): Self = StObject.set(x, "wrapApp", js.Any.fromFunction1(value))
  }
}
