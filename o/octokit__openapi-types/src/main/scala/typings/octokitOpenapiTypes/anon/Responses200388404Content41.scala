package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200388404Content41 extends StObject {
  
  var parameters: PathReleaseid
  
  var requestBody: js.UndefOr[ContentApplicationjsonMakelatest] = js.undefined
  
  var responses: `200388404Content41`
}
object Responses200388404Content41 {
  
  inline def apply(parameters: PathReleaseid, responses: `200388404Content41`): Responses200388404Content41 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200388404Content41]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200388404Content41] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathReleaseid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonMakelatest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200388404Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
