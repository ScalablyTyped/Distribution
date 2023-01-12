package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgResponses200Content26 extends StObject {
  
  var parameters: PathOrg
  
  var responses: `200Content26`
}
object ParametersPathOrgResponses200Content26 {
  
  inline def apply(parameters: PathOrg, responses: `200Content26`): ParametersPathOrgResponses200Content26 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgResponses200Content26]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgResponses200Content26] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content26`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
