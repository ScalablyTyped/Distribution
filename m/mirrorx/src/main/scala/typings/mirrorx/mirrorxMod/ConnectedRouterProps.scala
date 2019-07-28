package typings.mirrorx.mirrorxMod

import typings.history.historyMod.History
import typings.history.historyMod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectedRouterProps[State] extends js.Object {
  var history: js.UndefOr[History[LocationState]] = js.undefined
  var store: js.UndefOr[js.Any] = js.undefined
}

object ConnectedRouterProps {
  @scala.inline
  def apply[State](history: History[LocationState] = null, store: js.Any = null): ConnectedRouterProps[State] = {
    val __obj = js.Dynamic.literal()
    if (history != null) __obj.updateDynamic("history")(history)
    if (store != null) __obj.updateDynamic("store")(store)
    __obj.asInstanceOf[ConnectedRouterProps[State]]
  }
}

