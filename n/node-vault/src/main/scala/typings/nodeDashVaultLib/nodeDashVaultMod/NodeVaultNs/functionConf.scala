package typings
package nodeDashVaultLib.nodeDashVaultMod.NodeVaultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait functionConf extends js.Object {
  var method: java.lang.String
  var path: java.lang.String
  var schema: js.UndefOr[nodeDashVaultLib.Anon_Query] = js.undefined
}

object functionConf {
  @scala.inline
  def apply(method: java.lang.String, path: java.lang.String, schema: nodeDashVaultLib.Anon_Query = null): functionConf = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("path")(path)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[functionConf]
  }
}

