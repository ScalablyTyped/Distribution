package typings
package nodeDashVaultLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Query extends js.Object {
  var query: js.UndefOr[nodeDashVaultLib.nodeDashVaultMod.NodeVaultNs.Option] = js.undefined
  var req: js.UndefOr[nodeDashVaultLib.nodeDashVaultMod.NodeVaultNs.Option] = js.undefined
  var res: js.UndefOr[nodeDashVaultLib.nodeDashVaultMod.NodeVaultNs.Option] = js.undefined
}

object Anon_Query {
  @scala.inline
  def apply(
    query: nodeDashVaultLib.nodeDashVaultMod.NodeVaultNs.Option = null,
    req: nodeDashVaultLib.nodeDashVaultMod.NodeVaultNs.Option = null,
    res: nodeDashVaultLib.nodeDashVaultMod.NodeVaultNs.Option = null
  ): Anon_Query = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(query)
    if (req != null) __obj.updateDynamic("req")(req)
    if (res != null) __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[Anon_Query]
  }
}

