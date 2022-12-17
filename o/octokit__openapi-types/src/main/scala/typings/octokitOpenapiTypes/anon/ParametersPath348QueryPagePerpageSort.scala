package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath348QueryPagePerpageSort extends StObject {
  
  var parameters: Path348QueryPagePerpageSort
  
  var responses: `200Content386`
}
object ParametersPath348QueryPagePerpageSort {
  
  inline def apply(parameters: Path348QueryPagePerpageSort, responses: `200Content386`): ParametersPath348QueryPagePerpageSort = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath348QueryPagePerpageSort]
  }
  
  extension [Self <: ParametersPath348QueryPagePerpageSort](x: Self) {
    
    inline def setParameters(value: Path348QueryPagePerpageSort): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content386`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
