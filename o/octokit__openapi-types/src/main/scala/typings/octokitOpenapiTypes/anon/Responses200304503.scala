package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200304503 extends StObject {
  
  var parameters: PathAlertnumberOwnerRepo
  
  var responses: `200304503`
}
object Responses200304503 {
  
  inline def apply(parameters: PathAlertnumberOwnerRepo, responses: `200304503`): Responses200304503 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200304503]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200304503] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAlertnumberOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
