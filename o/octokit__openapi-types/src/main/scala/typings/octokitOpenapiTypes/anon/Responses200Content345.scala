package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content345 extends StObject {
  
  var parameters: QueryPer
  
  var responses: `200Content345`
}
object Responses200Content345 {
  
  inline def apply(parameters: QueryPer, responses: `200Content345`): Responses200Content345 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content345]
  }
  
  extension [Self <: Responses200Content345](x: Self) {
    
    inline def setParameters(value: QueryPer): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content345`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
