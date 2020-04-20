package typings.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaIDObj extends js.Object {
  var schema_name: String
  var schema_version: String
}

object SchemaIDObj {
  @scala.inline
  def apply(schema_name: String, schema_version: String): SchemaIDObj = {
    val __obj = js.Dynamic.literal(schema_name = schema_name.asInstanceOf[js.Any], schema_version = schema_version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIDObj]
  }
}

