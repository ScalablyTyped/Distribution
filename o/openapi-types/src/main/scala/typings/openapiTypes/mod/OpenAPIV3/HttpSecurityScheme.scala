package typings.openapiTypes.mod.OpenAPIV3

import typings.openapiTypes.openapiTypesStrings.http
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpSecurityScheme
  extends StObject
     with SecuritySchemeObject {
  
  var bearerFormat: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var scheme: String
  
  var `type`: http
}
object HttpSecurityScheme {
  
  @scala.inline
  def apply(scheme: String): HttpSecurityScheme = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("http")
    __obj.asInstanceOf[HttpSecurityScheme]
  }
  
  @scala.inline
  implicit class HttpSecuritySchemeMutableBuilder[Self <: HttpSecurityScheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBearerFormat(value: String): Self = StObject.set(x, "bearerFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBearerFormatUndefined: Self = StObject.set(x, "bearerFormat", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: http): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
