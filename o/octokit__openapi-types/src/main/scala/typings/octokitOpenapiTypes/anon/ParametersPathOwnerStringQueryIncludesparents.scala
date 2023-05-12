package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerStringQueryIncludesparents extends StObject {
  
  var parameters: PathOwnerStringQueryIncludesparents
  
  var responses: `200Content527`
}
object ParametersPathOwnerStringQueryIncludesparents {
  
  inline def apply(parameters: PathOwnerStringQueryIncludesparents, responses: `200Content527`): ParametersPathOwnerStringQueryIncludesparents = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerStringQueryIncludesparents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerStringQueryIncludesparents] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerStringQueryIncludesparents): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content527`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
