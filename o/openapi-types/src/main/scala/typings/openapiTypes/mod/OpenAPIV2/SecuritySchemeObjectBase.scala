package typings.openapiTypes.mod.OpenAPIV2

import typings.openapiTypes.openapiTypesStrings.apiKey
import typings.openapiTypes.openapiTypesStrings.basic
import typings.openapiTypes.openapiTypesStrings.oauth2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecuritySchemeObjectBase extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var `type`: basic | apiKey | oauth2
}
object SecuritySchemeObjectBase {
  
  inline def apply(`type`: basic | apiKey | oauth2): SecuritySchemeObjectBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeObjectBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecuritySchemeObjectBase] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setType(value: basic | apiKey | oauth2): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
