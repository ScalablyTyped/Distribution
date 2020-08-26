package typings.openapiSchemaValidator.mod

import typings.openapiTypes.mod.IJsonSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenAPISchemaValidatorArgs extends js.Object {
  var extensions: js.UndefOr[IJsonSchema] = js.native
  var version: Double | String = js.native
}

object OpenAPISchemaValidatorArgs {
  @scala.inline
  def apply(version: Double | String): OpenAPISchemaValidatorArgs = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPISchemaValidatorArgs]
  }
  @scala.inline
  implicit class OpenAPISchemaValidatorArgsOps[Self <: OpenAPISchemaValidatorArgs] (val x: Self) extends AnyVal {
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
    def setVersion(value: Double | String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtensions(value: IJsonSchema): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
  }
  
}

