package typings.nextDashReduxDashWrapper.nextDashReduxDashWrapperMod

import typings.redux.reduxMod.AnyAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitStoreOptions extends js.Object {
  var ctx: js.UndefOr[NextJSContext[_, AnyAction]] = js.undefined
  var initialState: js.UndefOr[js.Any] = js.undefined
}

object InitStoreOptions {
  @scala.inline
  def apply(ctx: NextJSContext[_, AnyAction] = null, initialState: js.Any = null): InitStoreOptions = {
    val __obj = js.Dynamic.literal()
    if (ctx != null) __obj.updateDynamic("ctx")(ctx)
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    __obj.asInstanceOf[InitStoreOptions]
  }
}

