package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathGistid extends StObject {
  
  var parameters: PathGistid
  
  var responses: `403404`
}
object ParametersPathGistid {
  
  inline def apply(parameters: PathGistid, responses: `403404`): ParametersPathGistid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathGistid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathGistid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathGistid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
