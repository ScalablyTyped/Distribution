package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommitshaOwner extends StObject {
  
  var parameters: PathCommitshaOwner
  
  var responses: `200Content569`
}
object ParametersPathCommitshaOwner {
  
  inline def apply(parameters: PathCommitshaOwner, responses: `200Content569`): ParametersPathCommitshaOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommitshaOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCommitshaOwner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommitshaOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content569`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
