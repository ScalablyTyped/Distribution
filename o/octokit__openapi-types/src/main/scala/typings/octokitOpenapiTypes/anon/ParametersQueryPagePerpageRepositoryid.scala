package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPagePerpageRepositoryid extends StObject {
  
  var parameters: QueryPagePerpageRepositoryid
  
  var responses: `200304401403404500`
}
object ParametersQueryPagePerpageRepositoryid {
  
  inline def apply(parameters: QueryPagePerpageRepositoryid, responses: `200304401403404500`): ParametersQueryPagePerpageRepositoryid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPagePerpageRepositoryid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryPagePerpageRepositoryid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryPagePerpageRepositoryid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304401403404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
