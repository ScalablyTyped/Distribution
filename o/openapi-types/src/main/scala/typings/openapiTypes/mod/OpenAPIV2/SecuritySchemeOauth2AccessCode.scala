package typings.openapiTypes.mod.OpenAPIV2

import typings.openapiTypes.openapiTypesStrings.accessCode
import typings.openapiTypes.openapiTypesStrings.oauth2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecuritySchemeOauth2AccessCode
  extends SecuritySchemeOauth2Base
     with SecuritySchemeOauth2 {
  var authorizationUrl: String = js.native
  @JSName("flow")
  var flow_SecuritySchemeOauth2AccessCode: accessCode = js.native
  var tokenUrl: String = js.native
}

object SecuritySchemeOauth2AccessCode {
  @scala.inline
  def apply(authorizationUrl: String, flow: accessCode, scopes: ScopesObject, tokenUrl: String, `type`: oauth2): SecuritySchemeOauth2AccessCode = {
    val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeOauth2AccessCode]
  }
  @scala.inline
  implicit class SecuritySchemeOauth2AccessCodeOps[Self <: SecuritySchemeOauth2AccessCode] (val x: Self) extends AnyVal {
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
    def setFlow(value: accessCode): Self = this.set("flow", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokenUrl(value: String): Self = this.set("tokenUrl", value.asInstanceOf[js.Any])
  }
  
}

