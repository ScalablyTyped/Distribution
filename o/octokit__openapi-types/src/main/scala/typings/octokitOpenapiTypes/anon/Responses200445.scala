package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200445 extends StObject {
  
  var parameters: PathBranchOwnerRepo
  
  var responses: `200445`
}
object Responses200445 {
  
  inline def apply(parameters: PathBranchOwnerRepo, responses: `200445`): Responses200445 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200445]
  }
  
  extension [Self <: Responses200445](x: Self) {
    
    inline def setParameters(value: PathBranchOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200445`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
