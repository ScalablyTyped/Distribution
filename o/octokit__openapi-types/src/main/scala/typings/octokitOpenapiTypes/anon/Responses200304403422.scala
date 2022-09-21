package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200304403422 extends StObject {
  
  var parameters: QueryPagePerpageSince
  
  var responses: `200304403422`
}
object Responses200304403422 {
  
  inline def apply(parameters: QueryPagePerpageSince, responses: `200304403422`): Responses200304403422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200304403422]
  }
  
  extension [Self <: Responses200304403422](x: Self) {
    
    inline def setParameters(value: QueryPagePerpageSince): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304403422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
