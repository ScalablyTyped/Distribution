package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoTag extends StObject {
  
  var parameters: PathOwnerRepoTag
  
  var responses: `200575404`
}
object ParametersPathOwnerRepoTag {
  
  inline def apply(parameters: PathOwnerRepoTag, responses: `200575404`): ParametersPathOwnerRepoTag = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoTag]
  }
  
  extension [Self <: ParametersPathOwnerRepoTag](x: Self) {
    
    inline def setParameters(value: PathOwnerRepoTag): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200575404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
