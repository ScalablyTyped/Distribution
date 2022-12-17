package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgReponame extends StObject {
  
  var parameters: PathOrgReponame
  
  var responses: `404Content48`
}
object ParametersPathOrgReponame {
  
  inline def apply(parameters: PathOrgReponame, responses: `404Content48`): ParametersPathOrgReponame = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgReponame]
  }
  
  extension [Self <: ParametersPathOrgReponame](x: Self) {
    
    inline def setParameters(value: PathOrgReponame): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
