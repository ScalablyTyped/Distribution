package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgPatid extends StObject {
  
  var parameters: PathOrgPatid
  
  var responses: `404500`
}
object ParametersPathOrgPatid {
  
  inline def apply(parameters: PathOrgPatid, responses: `404500`): ParametersPathOrgPatid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgPatid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgPatid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgPatid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
