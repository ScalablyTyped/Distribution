package typings.nodeDashVault.nodeDashVaultMod

import typings.nodeDashVault.Anon_Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionConf extends js.Object {
  var method: String
  var path: String
  var schema: js.UndefOr[Anon_Query] = js.undefined
}

object FunctionConf {
  @scala.inline
  def apply(method: String, path: String, schema: Anon_Query = null): FunctionConf = {
    val __obj = js.Dynamic.literal(method = method, path = path)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[FunctionConf]
  }
}

