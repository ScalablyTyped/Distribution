package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses732 extends StObject {
  
  var parameters: PathMilestonenumberOwner
  
  var requestBody: js.UndefOr[ContentApplicationjsonDescriptionDueon] = js.undefined
  
  var responses: `732`
}
object Responses732 {
  
  inline def apply(parameters: PathMilestonenumberOwner, responses: `732`): Responses732 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses732]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses732] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathMilestonenumberOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDescriptionDueon): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `732`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
