package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonResources extends StObject {
  
  var responses: `200ContentApplicationjsonResources`
}
object Responses200ContentApplicationjsonResources {
  
  inline def apply(responses: `200ContentApplicationjsonResources`): Responses200ContentApplicationjsonResources = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonResources]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonResources] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200ContentApplicationjsonResources`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
