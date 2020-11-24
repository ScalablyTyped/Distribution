package typings.openapiTypes.mod.OpenAPIV2

import typings.openapiTypes.openapiTypesStrings.`implicit`
import typings.openapiTypes.openapiTypesStrings.accessCode
import typings.openapiTypes.openapiTypesStrings.application
import typings.openapiTypes.openapiTypesStrings.oauth2
import typings.openapiTypes.openapiTypesStrings.password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecuritySchemeOauth2Base extends SecuritySchemeObjectBase {
  
  var flow: `implicit` | password | application | accessCode = js.native
  
  var scopes: ScopesObject = js.native
  
  @JSName("type")
  var type_SecuritySchemeOauth2Base: oauth2 = js.native
}
object SecuritySchemeOauth2Base {
  
  @scala.inline
  def apply(flow: `implicit` | password | application | accessCode, scopes: ScopesObject, `type`: oauth2): SecuritySchemeOauth2Base = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeOauth2Base]
  }
  
  @scala.inline
  implicit class SecuritySchemeOauth2BaseOps[Self <: SecuritySchemeOauth2Base] (val x: Self) extends AnyVal {
    
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
    def setFlow(value: `implicit` | password | application | accessCode): Self = this.set("flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopes(value: ScopesObject): Self = this.set("scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: oauth2): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
