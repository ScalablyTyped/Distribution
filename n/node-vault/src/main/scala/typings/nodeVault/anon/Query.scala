package typings.nodeVault.anon

import typings.nodeVault.mod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  var query: js.UndefOr[Option] = js.undefined
  var req: js.UndefOr[Option] = js.undefined
  var res: js.UndefOr[Option] = js.undefined
}

object Query {
  @scala.inline
  def apply(query: Option = null, req: Option = null, res: Option = null): Query = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (req != null) __obj.updateDynamic("req")(req.asInstanceOf[js.Any])
    if (res != null) __obj.updateDynamic("res")(res.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
}

