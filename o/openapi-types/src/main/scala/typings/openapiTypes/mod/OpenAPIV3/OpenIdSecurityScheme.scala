package typings.openapiTypes.mod.OpenAPIV3

import typings.openapiTypes.openapiTypesStrings.openIdConnect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class OpenIdSecuritySchemeMutableBuilder[Self <: OpenIdSecurityScheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setOpenIdConnectUrl(value: String): Self = StObject.set(x, "openIdConnectUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: openIdConnect): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
