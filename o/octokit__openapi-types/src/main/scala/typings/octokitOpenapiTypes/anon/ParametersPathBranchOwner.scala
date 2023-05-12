package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBranchOwner extends StObject {
  
  var parameters: PathBranchOwner
  
  var responses: `200ContentApplicationjsonRequiredapprovingreviewcount`
}
object ParametersPathBranchOwner {
  
  inline def apply(parameters: PathBranchOwner, responses: `200ContentApplicationjsonRequiredapprovingreviewcount`): ParametersPathBranchOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBranchOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathBranchOwner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRequiredapprovingreviewcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
