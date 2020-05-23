package typings.mirrorx.mod

import org.scalablytyped.runtime.TopLevel
import typings.history.mod.History
import typings.history.mod.Location
import typings.history.mod.LocationState
import typings.reactRouter.mod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteComponentProps[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typings.mirrorx.mirrorxStrings.RouteComponentProps with TopLevel[js.Any] */] extends js.Object {
  var history: History[LocationState]
  var location: Location[LocationState]
  var `match`: typings.reactRouter.mod.`match`[Params]
  var staticContext: js.UndefOr[js.Any] = js.undefined
}

object RouteComponentProps {
  @scala.inline
  def apply[Params](
    history: History[LocationState],
    location: Location[LocationState],
    `match`: `match`[Params],
    staticContext: js.Any = null
  ): RouteComponentProps[Params] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (staticContext != null) __obj.updateDynamic("staticContext")(staticContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteComponentProps[Params]]
  }
}

