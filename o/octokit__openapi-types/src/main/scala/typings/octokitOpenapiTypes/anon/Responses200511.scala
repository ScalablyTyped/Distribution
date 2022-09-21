package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200511 extends StObject {
  
  var parameters: PathBranchOwner
  
  var responses: `200511`
}
object Responses200511 {
  
  inline def apply(parameters: PathBranchOwner, responses: `200511`): Responses200511 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200511]
  }
  
  extension [Self <: Responses200511](x: Self) {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200511`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
