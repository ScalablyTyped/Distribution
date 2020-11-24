package typings.next.anon

import typings.next.routerMod.AppComponent
import typings.next.routerMod.PrivateRouteInfo
import typings.next.routerMod.Subscription
import typings.react.mod.ComponentType
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait App extends js.Object {
  
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
  implicit class AppOps[Self <: App] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApp(value: AppComponent): Self = this.set("App", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: ComponentType[js.Object]): Self = this.set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialProps(value: js.Any): Self = this.set("initialProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFallback(value: Boolean): Self = this.set("isFallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageLoader(value: js.Any): Self = this.set("pageLoader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription(value: (/* data */ PrivateRouteInfo, /* App */ AppComponent) => js.Promise[Unit]): Self = this.set("subscription", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapApp(value: AppComponent => js.Any): Self = this.set("wrapApp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDefaultLocale(value: String): Self = this.set("defaultLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLocale: Self = this.set("defaultLocale", js.undefined)
    
    @scala.inline
    def setErr(value: Error): Self = this.set("err", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErr: Self = this.set("err", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setLocalesVarargs(value: String*): Self = this.set("locales", js.Array(value :_*))
    
    @scala.inline
    def setLocales(value: js.Array[String]): Self = this.set("locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocales: Self = this.set("locales", js.undefined)
  }
}
