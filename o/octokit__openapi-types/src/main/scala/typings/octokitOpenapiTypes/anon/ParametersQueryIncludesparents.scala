package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryIncludesparents extends StObject {
  
  var parameters: QueryIncludesparents
  
  var responses: `200404500`
}
object ParametersQueryIncludesparents {
  
  inline def apply(parameters: QueryIncludesparents, responses: `200404500`): ParametersQueryIncludesparents = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryIncludesparents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryIncludesparents] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryIncludesparents): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
