package typings.nodeVault.mod

import typings.nodeVault.anon.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait functionConf extends js.Object {
  var method: String
  var path: String
  var schema: js.UndefOr[Query] = js.undefined
}

object functionConf {
  @scala.inline
  def apply(method: String, path: String, schema: Query = null): functionConf = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[functionConf]
  }
}

