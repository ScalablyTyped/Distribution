package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepositoryid extends StObject {
  
  var parameters: PathRepositoryid
  
  var responses: `404409`
}
object ParametersPathRepositoryid {
  
  inline def apply(parameters: PathRepositoryid, responses: `404409`): ParametersPathRepositoryid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepositoryid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepositoryid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepositoryid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
