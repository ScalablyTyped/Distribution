package typings.next.distNextDashServerLibRouterRouterMod

import typings.react.reactMod.ComponentType
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteInfo extends js.Object {
  var Component: ComponentType[js.Object]
  var err: js.UndefOr[Error] = js.undefined
  var error: js.UndefOr[js.Any] = js.undefined
  var props: js.UndefOr[js.Any] = js.undefined
}

object RouteInfo {
  @scala.inline
  def apply(Component: ComponentType[js.Object], err: Error = null, error: js.Any = null, props: js.Any = null): RouteInfo = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any])
    if (err != null) __obj.updateDynamic("err")(err.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteInfo]
  }
}

