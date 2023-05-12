package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath649QueryDirectionPagePerpageSort extends StObject {
  
  var parameters: Path649QueryDirectionPagePerpageSort
  
  var responses: `200Content673`
}
object ParametersPath649QueryDirectionPagePerpageSort {
  
  inline def apply(parameters: Path649QueryDirectionPagePerpageSort, responses: `200Content673`): ParametersPath649QueryDirectionPagePerpageSort = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath649QueryDirectionPagePerpageSort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath649QueryDirectionPagePerpageSort] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path649QueryDirectionPagePerpageSort): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content673`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
