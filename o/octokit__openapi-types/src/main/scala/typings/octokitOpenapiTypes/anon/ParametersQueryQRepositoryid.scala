package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryQRepositoryid extends StObject {
  
  var parameters: QueryQRepositoryid
  
  var responses: `200ContentApplicationjson777`
}
object ParametersQueryQRepositoryid {
  
  inline def apply(parameters: QueryQRepositoryid, responses: `200ContentApplicationjson777`): ParametersQueryQRepositoryid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryQRepositoryid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryQRepositoryid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryQRepositoryid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjson777`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
