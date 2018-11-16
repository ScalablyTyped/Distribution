package typings
package mirrorxLib.mirrorxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RouteComponentProps[Params /* <: mirrorxLib.mirrorxLibStrings.RouteComponentProps with js.Any */] extends js.Object {
  var history: historyLib.historyMod.History[historyLib.historyMod.LocationState]
  var location: historyLib.historyMod.Location[historyLib.historyMod.LocationState]
  var `match`: reactDashRouterLib.reactDashRouterMod.`match`[Params]
  var staticContext: js.UndefOr[js.Any] = js.undefined
}

