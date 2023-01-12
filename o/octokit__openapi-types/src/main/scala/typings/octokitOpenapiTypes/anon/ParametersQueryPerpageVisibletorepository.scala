package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPerpageVisibletorepository extends StObject {
  
  var parameters: QueryPerpageVisibletorepository
  
  var responses: `200ContentApplicationjsonRunnergroupsArrayTotalcountNumber`
}
object ParametersQueryPerpageVisibletorepository {
  
  inline def apply(
    parameters: QueryPerpageVisibletorepository,
    responses: `200ContentApplicationjsonRunnergroupsArrayTotalcountNumber`
  ): ParametersQueryPerpageVisibletorepository = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPerpageVisibletorepository]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryPerpageVisibletorepository] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryPerpageVisibletorepository): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRunnergroupsArrayTotalcountNumber`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
