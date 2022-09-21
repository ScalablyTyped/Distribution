package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerReleaseid extends StObject {
  
  var parameters: PathOwnerReleaseid
  
  var responses: `200572404Content55`
}
object ParametersPathOwnerReleaseid {
  
  inline def apply(parameters: PathOwnerReleaseid, responses: `200572404Content55`): ParametersPathOwnerReleaseid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerReleaseid]
  }
  
  extension [Self <: ParametersPathOwnerReleaseid](x: Self) {
    
    inline def setParameters(value: PathOwnerReleaseid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200572404Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
