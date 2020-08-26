package typings.openapiTypes.mod.OpenAPIV3

import typings.openapiTypes.openapiTypesStrings.http
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpSecurityScheme extends SecuritySchemeObject {
  var bearerFormat: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var scheme: String = js.native
  var `type`: http = js.native
}

object HttpSecurityScheme {
  @scala.inline
  def apply(scheme: String, `type`: http): HttpSecurityScheme = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpSecurityScheme]
  }
  @scala.inline
  implicit class HttpSecuritySchemeOps[Self <: HttpSecurityScheme] (val x: Self) extends AnyVal {
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
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: http): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setBearerFormat(value: String): Self = this.set("bearerFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBearerFormat: Self = this.set("bearerFormat", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
  
}

