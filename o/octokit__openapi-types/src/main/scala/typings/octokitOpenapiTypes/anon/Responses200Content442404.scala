package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content442404 extends StObject {
  
  var parameters: Path444
  
  var responses: `200Content442404`
}
object Responses200Content442404 {
  
  inline def apply(parameters: Path444, responses: `200Content442404`): Responses200Content442404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content442404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content442404] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path444): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content442404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
