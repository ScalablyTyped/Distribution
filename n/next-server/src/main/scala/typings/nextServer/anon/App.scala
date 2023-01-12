package typings.nextServer.anon

import typings.nextServer.distLibRouterRouterMod.RouteInfo
import typings.nextServer.distLibRouterRouterMod.Subscription
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait App extends StObject {
  
  var App: ComponentType[js.Object]
  
  var Component: ComponentType[js.Object]
  
  var err: js.UndefOr[js.Error] = js.undefined
  
  var initialProps: Any
  
  var pageLoader: Any
  
  var subscription: Subscription
  
  def wrapApp(App: ComponentType[js.Object]): Any
}
object App {
  
  inline def apply(
    App: ComponentType[js.Object],
    Component: ComponentType[js.Object],
    initialProps: Any,
    pageLoader: Any,
    subscription: (/* data */ RouteInfo, /* App */ js.UndefOr[ComponentType[js.Object]]) => Unit,
    wrapApp: ComponentType[js.Object] => Any
  ): App = {
    val __obj = js.Dynamic.literal(App = App.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], initialProps = initialProps.asInstanceOf[js.Any], pageLoader = pageLoader.asInstanceOf[js.Any], subscription = js.Any.fromFunction2(subscription), wrapApp = js.Any.fromFunction1(wrapApp))
    __obj.asInstanceOf[App]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: App] (val x: Self) extends AnyVal {
    
    inline def setApp(value: ComponentType[js.Object]): Self = StObject.set(x, "App", value.asInstanceOf[js.Any])
    
    inline def setComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setErr(value: js.Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
    
    inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
    
    inline def setInitialProps(value: Any): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
    
    inline def setPageLoader(value: Any): Self = StObject.set(x, "pageLoader", value.asInstanceOf[js.Any])
    
    inline def setSubscription(value: (/* data */ RouteInfo, /* App */ js.UndefOr[ComponentType[js.Object]]) => Unit): Self = StObject.set(x, "subscription", js.Any.fromFunction2(value))
    
    inline def setWrapApp(value: ComponentType[js.Object] => Any): Self = StObject.set(x, "wrapApp", js.Any.fromFunction1(value))
  }
}
