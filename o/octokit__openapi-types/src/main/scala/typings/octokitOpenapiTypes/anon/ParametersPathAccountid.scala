package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAccountid extends StObject {
  
  var parameters: PathAccountid
  
  var responses: `200401`
}
object ParametersPathAccountid {
  
  inline def apply(parameters: PathAccountid, responses: `200401`): ParametersPathAccountid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAccountid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAccountid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAccountid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
