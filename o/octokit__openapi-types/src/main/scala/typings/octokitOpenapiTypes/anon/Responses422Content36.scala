package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses422Content36 extends StObject {
  
  var parameters: PathEnvironmentname
  
  var requestBody: js.UndefOr[Content239] = js.undefined
  
  var responses: `422Content36`
}
object Responses422Content36 {
  
  inline def apply(parameters: PathEnvironmentname, responses: `422Content36`): Responses422Content36 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses422Content36]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses422Content36] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnvironmentname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content239): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `422Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
