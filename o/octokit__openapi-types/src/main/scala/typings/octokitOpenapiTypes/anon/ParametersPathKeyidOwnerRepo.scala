package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathKeyidOwnerRepo extends StObject {
  
  var parameters: PathKeyidOwnerRepo
  
  var responses: `200724`
}
object ParametersPathKeyidOwnerRepo {
  
  inline def apply(parameters: PathKeyidOwnerRepo, responses: `200724`): ParametersPathKeyidOwnerRepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathKeyidOwnerRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathKeyidOwnerRepo] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathKeyidOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200724`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
