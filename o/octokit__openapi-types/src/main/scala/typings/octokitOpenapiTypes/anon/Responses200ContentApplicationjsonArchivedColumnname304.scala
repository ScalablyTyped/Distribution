package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonArchivedColumnname304 extends StObject {
  
  var parameters: PathCardidNumber
  
  var requestBody: js.UndefOr[ContentApplicationjsonArchived] = js.undefined
  
  var responses: `200ContentApplicationjsonArchivedColumnname304`
}
object Responses200ContentApplicationjsonArchivedColumnname304 {
  
  inline def apply(parameters: PathCardidNumber, responses: `200ContentApplicationjsonArchivedColumnname304`): Responses200ContentApplicationjsonArchivedColumnname304 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonArchivedColumnname304]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonArchivedColumnname304] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCardidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonArchived): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200ContentApplicationjsonArchivedColumnname304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
