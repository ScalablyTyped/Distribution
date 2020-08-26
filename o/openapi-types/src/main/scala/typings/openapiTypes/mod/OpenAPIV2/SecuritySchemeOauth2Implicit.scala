package typings.openapiTypes.mod.OpenAPIV2

import typings.openapiTypes.openapiTypesStrings.`implicit`
import typings.openapiTypes.openapiTypesStrings.oauth2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecuritySchemeOauth2Implicit
  extends SecuritySchemeOauth2Base
     with SecuritySchemeOauth2 {
  var authorizationUrl: String = js.native
  @JSName("flow")
  var flow_SecuritySchemeOauth2Implicit: `implicit` = js.native
}

object SecuritySchemeOauth2Implicit {
  @scala.inline
  def apply(authorizationUrl: String, flow: `implicit`, scopes: ScopesObject, `type`: oauth2): SecuritySchemeOauth2Implicit = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeOauth2Implicit]
  }
  @scala.inline
  implicit class SecuritySchemeOauth2ImplicitOps[Self <: SecuritySchemeOauth2Implicit] (val x: Self) extends AnyVal {
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
    def setAuthorizationUrl(value: String): Self = this.set("authorizationUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlow(value: `implicit`): Self = this.set("flow", value.asInstanceOf[js.Any])
  }
  
}

