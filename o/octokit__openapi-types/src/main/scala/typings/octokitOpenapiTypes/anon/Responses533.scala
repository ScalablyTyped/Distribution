package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses533 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepo
  
  var responses: `533`
}
object Responses533 {
  
  inline def apply(parameters: PathIssuenumberOwnerRepo, responses: `533`): Responses533 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses533]
  }
  
  extension [Self <: Responses533](x: Self) {
    
    inline def setParameters(value: PathIssuenumberOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `533`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
