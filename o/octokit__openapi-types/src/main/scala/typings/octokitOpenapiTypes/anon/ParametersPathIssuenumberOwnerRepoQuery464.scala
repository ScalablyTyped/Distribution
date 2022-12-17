package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberOwnerRepoQuery464 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepoQuery464
  
  var responses: `200Content465404Content48410Content48`
}
object ParametersPathIssuenumberOwnerRepoQuery464 {
  
  inline def apply(parameters: PathIssuenumberOwnerRepoQuery464, responses: `200Content465404Content48410Content48`): ParametersPathIssuenumberOwnerRepoQuery464 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberOwnerRepoQuery464]
  }
  
  extension [Self <: ParametersPathIssuenumberOwnerRepoQuery464](x: Self) {
    
    inline def setParameters(value: PathIssuenumberOwnerRepoQuery464): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content465404Content48410Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
