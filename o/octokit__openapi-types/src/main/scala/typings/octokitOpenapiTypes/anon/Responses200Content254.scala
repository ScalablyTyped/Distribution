package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content254 extends StObject {
  
  var parameters: PathCommitshaQuery
  
  var responses: `200Content254`
}
object Responses200Content254 {
  
  inline def apply(parameters: PathCommitshaQuery, responses: `200Content254`): Responses200Content254 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content254]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content254] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommitshaQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content254`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
