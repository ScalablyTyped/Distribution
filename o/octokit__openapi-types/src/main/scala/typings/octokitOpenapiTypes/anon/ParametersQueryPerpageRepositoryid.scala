package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPerpageRepositoryid extends StObject {
  
  var parameters: QueryPerpageRepositoryid
  
  var responses: `401403404`
}
object ParametersQueryPerpageRepositoryid {
  
  inline def apply(parameters: QueryPerpageRepositoryid, responses: `401403404`): ParametersQueryPerpageRepositoryid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPerpageRepositoryid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryPerpageRepositoryid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryPerpageRepositoryid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
