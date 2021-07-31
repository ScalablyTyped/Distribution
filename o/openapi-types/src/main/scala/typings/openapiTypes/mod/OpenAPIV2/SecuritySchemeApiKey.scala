package typings.openapiTypes.mod.OpenAPIV2

import typings.openapiTypes.openapiTypesStrings.apiKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySchemeApiKey
  extends StObject
     with SecuritySchemeObjectBase
     with SecuritySchemeObject {
  
  var in: String
  
  var name: String
  
  @JSName("type")
  var type_SecuritySchemeApiKey: apiKey
}
object SecuritySchemeApiKey {
  
  @scala.inline
  def apply(in: String, name: String): SecuritySchemeApiKey = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("apiKey")
    __obj.asInstanceOf[SecuritySchemeApiKey]
  }
  
  @scala.inline
  implicit class SecuritySchemeApiKeyMutableBuilder[Self <: SecuritySchemeApiKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIn(value: String): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: apiKey): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
