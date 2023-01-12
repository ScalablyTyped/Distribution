package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonApi extends StObject {
  
  var responses: `200ContentApplicationjsonApi`
}
object Responses200ContentApplicationjsonApi {
  
  inline def apply(responses: `200ContentApplicationjsonApi`): Responses200ContentApplicationjsonApi = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonApi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonApi] (val x: Self) extends AnyVal {
    
    inline def setResponses(value: `200ContentApplicationjsonApi`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
