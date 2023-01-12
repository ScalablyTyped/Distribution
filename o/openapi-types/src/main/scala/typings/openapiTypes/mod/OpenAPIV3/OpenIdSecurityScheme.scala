package typings.openapiTypes.mod.OpenAPIV3

import typings.openapiTypes.openapiTypesStrings.openIdConnect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenIdSecurityScheme
  extends StObject
     with SecuritySchemeObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var openIdConnectUrl: String
  
  var `type`: openIdConnect
}
object OpenIdSecurityScheme {
  
  inline def apply(openIdConnectUrl: String): OpenIdSecurityScheme = {
    val __obj = js.Dynamic.literal(openIdConnectUrl = openIdConnectUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("openIdConnect")
    __obj.asInstanceOf[OpenIdSecurityScheme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenIdSecurityScheme] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setOpenIdConnectUrl(value: String): Self = StObject.set(x, "openIdConnectUrl", value.asInstanceOf[js.Any])
    
    inline def setType(value: openIdConnect): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
