package typings
package mirrorxLib.mirrorxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteProps extends js.Object {
  var children: js.UndefOr[
    (js.Function1[/* props */ RouteComponentProps[_], reactLib.reactMod.ReactNode]) | reactLib.reactMod.ReactNode
  ] = js.undefined
  var component: js.UndefOr[
    reactLib.reactMod.ComponentType[RouteComponentProps[_]] | reactLib.reactMod.ComponentType[_]
  ] = js.undefined
  var exact: js.UndefOr[scala.Boolean] = js.undefined
  var location: js.UndefOr[historyLib.historyMod.Location[historyLib.historyMod.LocationState]] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var render: js.UndefOr[js.Function1[/* props */ RouteComponentProps[_], reactLib.reactMod.ReactNode]] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object RouteProps {
  @scala.inline
  def apply(
    children: (js.Function1[/* props */ RouteComponentProps[_], reactLib.reactMod.ReactNode]) | reactLib.reactMod.ReactNode = null,
    component: reactLib.reactMod.ComponentType[RouteComponentProps[_]] | reactLib.reactMod.ComponentType[_] = null,
    exact: js.UndefOr[scala.Boolean] = js.undefined,
    location: historyLib.historyMod.Location[historyLib.historyMod.LocationState] = null,
    path: java.lang.String = null,
    render: /* props */ RouteComponentProps[_] => reactLib.reactMod.ReactNode = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): RouteProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact)
    if (location != null) __obj.updateDynamic("location")(location)
    if (path != null) __obj.updateDynamic("path")(path)
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[RouteProps]
  }
}

