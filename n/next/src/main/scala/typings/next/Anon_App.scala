package typings.next

import typings.next.distNextDashServerLibRouterRouterMod.RouteInfo
import typings.next.distNextDashServerLibRouterRouterMod.Subscription
import typings.react.reactMod.ComponentType
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_App extends js.Object {
  var App: ComponentType[js.Object]
  var Component: ComponentType[js.Object]
  var err: js.UndefOr[Error] = js.undefined
  var initialProps: js.Any
  var pageLoader: js.Any
  var subscription: Subscription
  def wrapApp(App: ComponentType[js.Object]): js.Any
}

object Anon_App {
  @scala.inline
  def apply(
    App: ComponentType[js.Object],
    Component: ComponentType[js.Object],
    initialProps: js.Any,
    pageLoader: js.Any,
    subscription: (/* data */ RouteInfo, /* App */ js.UndefOr[ComponentType[js.Object]]) => Unit,
    wrapApp: ComponentType[js.Object] => js.Any,
    err: Error = null
  ): Anon_App = {
    val __obj = js.Dynamic.literal(App = App.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], initialProps = initialProps, pageLoader = pageLoader, subscription = js.Any.fromFunction2(subscription), wrapApp = js.Any.fromFunction1(wrapApp))
    if (err != null) __obj.updateDynamic("err")(err)
    __obj.asInstanceOf[Anon_App]
  }
}

