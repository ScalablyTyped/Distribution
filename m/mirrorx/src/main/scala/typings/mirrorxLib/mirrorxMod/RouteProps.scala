package typings
package mirrorxLib.mirrorxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteProps extends js.Object {
  var children: js.UndefOr[
    (js.Function1[/* props */ RouteComponentProps[_], reactLib.reactMod.ReactNs.ReactNode]) | reactLib.reactMod.ReactNs.ReactNode
  ] = js.undefined
  var component: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentType[RouteComponentProps[_]] | reactLib.reactMod.ReactNs.ComponentType[_]
  ] = js.undefined
  var exact: js.UndefOr[scala.Boolean] = js.undefined
  var location: js.UndefOr[historyLib.historyMod.Location[historyLib.historyMod.LocationState]] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var render: js.UndefOr[
    js.Function1[/* props */ RouteComponentProps[_], reactLib.reactMod.ReactNs.ReactNode]
  ] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

