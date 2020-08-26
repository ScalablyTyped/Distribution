package typings.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaIDObj extends js.Object {
  var schema_name: String = js.native
  var schema_version: String = js.native
}

object SchemaIDObj {
  @scala.inline
  def apply(schema_name: String, schema_version: String): SchemaIDObj = {
    val __obj = js.Dynamic.literal(schema_name = schema_name.asInstanceOf[js.Any], schema_version = schema_version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIDObj]
  }
  @scala.inline
  implicit class SchemaIDObjOps[Self <: SchemaIDObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSchema_name(value: String): Self = this.set("schema_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema_version(value: String): Self = this.set("schema_version", value.asInstanceOf[js.Any])
  }
  
}

