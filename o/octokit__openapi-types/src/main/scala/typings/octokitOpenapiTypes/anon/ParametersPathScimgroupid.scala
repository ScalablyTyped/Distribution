package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathScimgroupid extends StObject {
  
  var parameters: PathScimgroupid
  
  var responses: `200Content350`
}
object ParametersPathScimgroupid {
  
  inline def apply(parameters: PathScimgroupid, responses: `200Content350`): ParametersPathScimgroupid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathScimgroupid]
  }
  
  extension [Self <: ParametersPathScimgroupid](x: Self) {
    
    inline def setParameters(value: PathScimgroupid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content350`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
