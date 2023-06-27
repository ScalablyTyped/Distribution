package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content592 extends StObject {
  
  var parameters: PathOrgStringQuery
  
  var responses: `200Content592`
}
object Responses200Content592 {
  
  inline def apply(parameters: PathOrgStringQuery, responses: `200Content592`): Responses200Content592 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content592]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content592] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgStringQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content592`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
