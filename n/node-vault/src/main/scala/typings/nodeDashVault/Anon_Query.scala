package typings.nodeDashVault

import typings.nodeDashVault.nodeDashVaultMod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Query extends js.Object {
  var query: js.UndefOr[Option] = js.undefined
  var req: js.UndefOr[Option] = js.undefined
  var res: js.UndefOr[Option] = js.undefined
}

object Anon_Query {
  @scala.inline
  def apply(query: Option = null, req: Option = null, res: Option = null): Anon_Query = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(query)
    if (req != null) __obj.updateDynamic("req")(req)
    if (res != null) __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[Anon_Query]
  }
}

