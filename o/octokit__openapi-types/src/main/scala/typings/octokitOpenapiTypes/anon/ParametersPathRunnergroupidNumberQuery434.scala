package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRunnergroupidNumberQuery434 extends StObject {
  
  var parameters: PathRunnergroupidNumberQuery434
  
  var responses: `438`
}
object ParametersPathRunnergroupidNumberQuery434 {
  
  inline def apply(parameters: PathRunnergroupidNumberQuery434, responses: `438`): ParametersPathRunnergroupidNumberQuery434 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRunnergroupidNumberQuery434]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRunnergroupidNumberQuery434] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRunnergroupidNumberQuery434): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `438`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
