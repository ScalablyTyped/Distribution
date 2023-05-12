package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAutolinkid extends StObject {
  
  var parameters: PathAutolinkid
  
  var responses: `200171`
}
object ParametersPathAutolinkid {
  
  inline def apply(parameters: PathAutolinkid, responses: `200171`): ParametersPathAutolinkid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAutolinkid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAutolinkid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAutolinkid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200171`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
