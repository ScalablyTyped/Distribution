package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content488422Content397 extends StObject {
  
  var parameters: PathBranchOwner
  
  var requestBody: ContentApplicationjsonAppsArray
  
  var responses: `200Content488422Content397`
}
object Responses200Content488422Content397 {
  
  inline def apply(
    parameters: PathBranchOwner,
    requestBody: ContentApplicationjsonAppsArray,
    responses: `200Content488422Content397`
  ): Responses200Content488422Content397 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content488422Content397]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content488422Content397] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAppsArray): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content488422Content397`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
