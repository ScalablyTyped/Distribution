package typings.nextServer.anon

import typings.nextServer.routerMod.RouteInfo
import typings.nextServer.routerMod.Subscription
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait App extends StObject {
  
  var App: ComponentType[js.Object]
  
  var Component: ComponentType[js.Object]
  
  var err: js.UndefOr[typings.std.Error] = js.undefined
  
  var initialProps: js.Any
  
  var pageLoader: js.Any
  
  var subscription: Subscription
  
  def wrapApp(App: ComponentType[js.Object]): js.Any
}
object App {
  
  @scala.inline
  def apply(
    App: ComponentType[js.Object],
    Component: ComponentType[js.Object],
    initialProps: js.Any,
    pageLoader: js.Any,
    subscription: (/* data */ RouteInfo, /* App */ js.UndefOr[ComponentType[js.Object]]) => Unit,
    wrapApp: ComponentType[js.Object] => js.Any
  ): App = {
    val __obj = js.Dynamic.literal(App = App.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], initialProps = initialProps.asInstanceOf[js.Any], pageLoader = pageLoader.asInstanceOf[js.Any], subscription = js.Any.fromFunction2(subscription), wrapApp = js.Any.fromFunction1(wrapApp))
    __obj.asInstanceOf[App]
  }
  
  @scala.inline
  implicit class AppMutableBuilder[Self <: App] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: ComponentType[js.Object]): Self = StObject.set(x, "App", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErr(value: typings.std.Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
    
    @scala.inline
    def setInitialProps(value: js.Any): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageLoader(value: js.Any): Self = StObject.set(x, "pageLoader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription(value: (/* data */ RouteInfo, /* App */ js.UndefOr[ComponentType[js.Object]]) => Unit): Self = StObject.set(x, "subscription", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapApp(value: ComponentType[js.Object] => js.Any): Self = StObject.set(x, "wrapApp", js.Any.fromFunction1(value))
  }
}
