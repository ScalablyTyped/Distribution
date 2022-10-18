package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses320 extends StObject {
  
  var parameters: Path319
  
  var responses: `320`
}
object Responses320 {
  
  inline def apply(parameters: Path319, responses: `320`): Responses320 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses320]
  }
  
  extension [Self <: Responses320](x: Self) {
    
    inline def setParameters(value: Path319): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `320`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
