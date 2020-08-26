package typings.nextServer.anon

import typings.nextServer.routerMod.RouteInfo
import typings.nextServer.routerMod.Subscription
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App extends js.Object {
  var App: ComponentType[js.Object] = js.native
  var Component: ComponentType[js.Object] = js.native
  var err: js.UndefOr[typings.std.Error] = js.native
  var initialProps: js.Any = js.native
  var pageLoader: js.Any = js.native
  var subscription: Subscription = js.native
  def wrapApp(App: ComponentType[js.Object]): js.Any = js.native
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
    def setApp(value: ComponentType[js.Object]): Self = this.set("App", value.asInstanceOf[js.Any])
    @scala.inline
    def setComponent(value: ComponentType[js.Object]): Self = this.set("Component", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialProps(value: js.Any): Self = this.set("initialProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageLoader(value: js.Any): Self = this.set("pageLoader", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscription(value: (/* data */ RouteInfo, /* App */ js.UndefOr[ComponentType[js.Object]]) => Unit): Self = this.set("subscription", js.Any.fromFunction2(value))
    @scala.inline
    def setWrapApp(value: ComponentType[js.Object] => js.Any): Self = this.set("wrapApp", js.Any.fromFunction1(value))
    @scala.inline
    def setErr(value: typings.std.Error): Self = this.set("err", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErr: Self = this.set("err", js.undefined)
  }
  
}

