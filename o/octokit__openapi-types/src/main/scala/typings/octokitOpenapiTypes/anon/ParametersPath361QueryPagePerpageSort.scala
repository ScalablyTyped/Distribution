package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath361QueryPagePerpageSort extends StObject {
  
  var parameters: Path361QueryPagePerpageSort
  
  var responses: `200Content398`
}
object ParametersPath361QueryPagePerpageSort {
  
  inline def apply(parameters: Path361QueryPagePerpageSort, responses: `200Content398`): ParametersPath361QueryPagePerpageSort = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath361QueryPagePerpageSort]
  }
  
  extension [Self <: ParametersPath361QueryPagePerpageSort](x: Self) {
    
    inline def setParameters(value: Path361QueryPagePerpageSort): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content398`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
