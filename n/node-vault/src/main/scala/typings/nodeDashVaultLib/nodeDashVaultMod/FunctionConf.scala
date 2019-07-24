package typings
package nodeDashVaultLib.nodeDashVaultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionConf extends js.Object {
  var method: java.lang.String
  var path: java.lang.String
  var schema: js.UndefOr[nodeDashVaultLib.Anon_Query] = js.undefined
}

object FunctionConf {
  @scala.inline
  def apply(method: java.lang.String, path: java.lang.String, schema: nodeDashVaultLib.Anon_Query = null): FunctionConf = {
    val __obj = js.Dynamic.literal(method = method, path = path)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[FunctionConf]
  }
}

