package typings.mirrorx.mirrorxMod

import typings.history.historyMod.Location
import typings.history.historyMod.LocationState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteProps extends js.Object {
  var children: js.UndefOr[(js.Function1[/* props */ RouteComponentProps[_], ReactNode]) | ReactNode] = js.undefined
  var component: js.UndefOr[ComponentType[_ | RouteComponentProps[_]]] = js.undefined
  var exact: js.UndefOr[Boolean] = js.undefined
  var location: js.UndefOr[Location[LocationState]] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var render: js.UndefOr[js.Function1[/* props */ RouteComponentProps[_], ReactNode]] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object RouteProps {
  @scala.inline
  def apply(
    children: (js.Function1[/* props */ RouteComponentProps[_], ReactNode]) | ReactNode = null,
    component: ComponentType[_ | RouteComponentProps[_]] = null,
    exact: js.UndefOr[Boolean] = js.undefined,
    location: Location[LocationState] = null,
    path: String = null,
    render: /* props */ RouteComponentProps[_] => ReactNode = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): RouteProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteProps]
  }
}

