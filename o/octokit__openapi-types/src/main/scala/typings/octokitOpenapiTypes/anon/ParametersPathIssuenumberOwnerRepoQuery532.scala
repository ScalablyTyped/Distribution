package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberOwnerRepoQuery532 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepoQuery532
  
  var responses: `200Content533404Content36410Content36`
}
object ParametersPathIssuenumberOwnerRepoQuery532 {
  
  inline def apply(parameters: PathIssuenumberOwnerRepoQuery532, responses: `200Content533404Content36410Content36`): ParametersPathIssuenumberOwnerRepoQuery532 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberOwnerRepoQuery532]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathIssuenumberOwnerRepoQuery532] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumberOwnerRepoQuery532): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content533404Content36410Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
