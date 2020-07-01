package typings.mongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookOptions extends js.Object {
  var document: js.UndefOr[Boolean] = js.undefined
  var query: js.UndefOr[Boolean] = js.undefined
}

object HookOptions {
  @scala.inline
  def apply(document: js.UndefOr[Boolean] = js.undefined, query: js.UndefOr[Boolean] = js.undefined): HookOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(document)) __obj.updateDynamic("document")(document.get.asInstanceOf[js.Any])
    if (!js.isUndefined(query)) __obj.updateDynamic("query")(query.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookOptions]
  }
}

