package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEventid extends StObject {
  
  var parameters: PathEventid
  
  var responses: `403404410`
}
object ParametersPathEventid {
  
  inline def apply(parameters: PathEventid, responses: `403404410`): ParametersPathEventid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEventid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEventid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEventid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403404410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
