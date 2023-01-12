package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathInstallationid extends StObject {
  
  var parameters: PathInstallationid
  
  var responses: `404`
}
object ParametersPathInstallationid {
  
  inline def apply(parameters: PathInstallationid, responses: `404`): ParametersPathInstallationid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathInstallationid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathInstallationid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathInstallationid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
