package typings.openapiTypes.mod.OpenAPIV2

import typings.openapiTypes.openapiTypesStrings.apiKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecuritySchemeApiKey
  extends SecuritySchemeObjectBase
     with SecuritySchemeObject {
  
  var in: String = js.native
  
  var name: String = js.native
  
  @JSName("type")
  var type_SecuritySchemeApiKey: apiKey = js.native
}
object SecuritySchemeApiKey {
  
  @scala.inline
  def apply(in: String, name: String, `type`: apiKey): SecuritySchemeApiKey = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
