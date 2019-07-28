package typings.mirrorx.mirrorxMod

import typings.history.historyMod.History
import typings.history.historyMod.Location
import typings.history.historyMod.LocationState
import typings.reactDashRouter.reactDashRouterMod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteComponentProps[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typings.mirrorx.mirrorxStrings.RouteComponentProps with js.Any */] extends js.Object {
  var history: History[LocationState]
  var location: Location[LocationState]
  var `match`: typings.reactDashRouter.reactDashRouterMod.`match`[Params]
  var staticContext: js.UndefOr[js.Any] = js.undefined
}

object RouteComponentProps {
  @scala.inline
  def apply[Params /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.mirrorx.mirrorxStrings.RouteComponentProps with js.Any */](
    history: History[LocationState],
    location: Location[LocationState],
    `match`: `match`[Params],
    staticContext: js.Any = null
  ): RouteComponentProps[Params] = {
    val __obj = js.Dynamic.literal(history = history, location = location)
    __obj.updateDynamic("match")(`match`)
    if (staticContext != null) __obj.updateDynamic("staticContext")(staticContext)
    __obj.asInstanceOf[RouteComponentProps[Params]]
  }
}

