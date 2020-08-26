package typings.openapiTypes.mod.OpenAPIV3

import typings.openapiTypes.openapiTypesStrings.openIdConnect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenIdSecurityScheme extends SecuritySchemeObject {
  var description: js.UndefOr[String] = js.native
  var openIdConnectUrl: String = js.native
  var `type`: openIdConnect = js.native
}

object OpenIdSecurityScheme {
  @scala.inline
  def apply(openIdConnectUrl: String, `type`: openIdConnect): OpenIdSecurityScheme = {
    val __obj = js.Dynamic.literal(openIdConnectUrl = openIdConnectUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenIdSecurityScheme]
  }
  @scala.inline
  implicit class OpenIdSecuritySchemeOps[Self <: OpenIdSecurityScheme] (val x: Self) extends AnyVal {
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
    def setOpenIdConnectUrl(value: String): Self = this.set("openIdConnectUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: openIdConnect): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
  
}

