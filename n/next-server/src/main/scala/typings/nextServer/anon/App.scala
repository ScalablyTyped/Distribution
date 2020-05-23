package typings.nextServer.anon

import typings.nextServer.routerMod.RouteInfo
import typings.nextServer.routerMod.Subscription
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
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
    wrapApp: ComponentType[js.Object] => js.Any,
    err: typings.std.Error = null
  ): App = {
    val __obj = js.Dynamic.literal(App = App.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], initialProps = initialProps.asInstanceOf[js.Any], pageLoader = pageLoader.asInstanceOf[js.Any], subscription = js.Any.fromFunction2(subscription), wrapApp = js.Any.fromFunction1(wrapApp))
    if (err != null) __obj.updateDynamic("err")(err.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
}

