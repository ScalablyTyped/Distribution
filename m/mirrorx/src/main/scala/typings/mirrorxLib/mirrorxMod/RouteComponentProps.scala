package typings
package mirrorxLib.mirrorxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteComponentProps[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ mirrorxLib.mirrorxLibStrings.RouteComponentProps with js.Any */] extends js.Object {
  var history: historyLib.historyMod.History[historyLib.historyMod.LocationState]
  var location: historyLib.historyMod.Location[historyLib.historyMod.LocationState]
  var `match`: reactDashRouterLib.reactDashRouterMod.`match`[Params]
  var staticContext: js.UndefOr[js.Any] = js.undefined
}

object RouteComponentProps {
  @scala.inline
  def apply[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ mirrorxLib.mirrorxLibStrings.RouteComponentProps with js.Any */](
    history: historyLib.historyMod.History[historyLib.historyMod.LocationState],
    location: historyLib.historyMod.Location[historyLib.historyMod.LocationState],
    `match`: reactDashRouterLib.reactDashRouterMod.`match`[Params],
    staticContext: js.Any = null
  ): RouteComponentProps[Params] = {
    val __obj = js.Dynamic.literal(history = history, location = location)
    __obj.updateDynamic("match")(`match`)
    if (staticContext != null) __obj.updateDynamic("staticContext")(staticContext)
    __obj.asInstanceOf[RouteComponentProps[Params]]
  }
}

