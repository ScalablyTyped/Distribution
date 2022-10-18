package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses404Content6422Content7 extends StObject {
  
  var parameters: PathReviewid
  
  var responses: `404Content6422Content7`
}
object Responses404Content6422Content7 {
  
  inline def apply(parameters: PathReviewid, responses: `404Content6422Content7`): Responses404Content6422Content7 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses404Content6422Content7]
  }
  
  extension [Self <: Responses404Content6422Content7](x: Self) {
    
    inline def setParameters(value: PathReviewid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content6422Content7`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
