package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPagePerpageRepositoryid extends StObject {
  
  var parameters: QueryPagePerpageRepositoryid
  
  var responses: `304401403404500`
}
object ParametersQueryPagePerpageRepositoryid {
  
  inline def apply(parameters: QueryPagePerpageRepositoryid, responses: `304401403404500`): ParametersQueryPagePerpageRepositoryid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPagePerpageRepositoryid]
  }
  
  extension [Self <: ParametersQueryPagePerpageRepositoryid](x: Self) {
    
    inline def setParameters(value: QueryPagePerpageRepositoryid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304401403404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
