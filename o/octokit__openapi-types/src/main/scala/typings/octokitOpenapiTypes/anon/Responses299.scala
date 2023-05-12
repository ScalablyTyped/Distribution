package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses299 extends StObject {
  
  var parameters: PathMilestonenumber
  
  var requestBody: js.UndefOr[ContentApplicationjsonDescriptionDueon] = js.undefined
  
  var responses: `299`
}
object Responses299 {
  
  inline def apply(parameters: PathMilestonenumber, responses: `299`): Responses299 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses299]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses299] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathMilestonenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDescriptionDueon): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `299`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
