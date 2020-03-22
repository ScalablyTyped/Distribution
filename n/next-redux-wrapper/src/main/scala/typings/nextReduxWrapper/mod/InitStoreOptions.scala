package typings.nextReduxWrapper.mod

import typings.next.utilsMod.NextPageContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitStoreOptions extends js.Object {
  var ctx: NextPageContext
  var initialState: js.UndefOr[js.Any] = js.undefined
}

object InitStoreOptions {
  @scala.inline
  def apply(ctx: NextPageContext, initialState: js.Any = null): InitStoreOptions = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitStoreOptions]
  }
}

