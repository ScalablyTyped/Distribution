package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryAuthor extends StObject {
  
  var parameters: QueryAuthor
  
  var responses: `404409`
}
object ParametersQueryAuthor {
  
  inline def apply(parameters: QueryAuthor, responses: `404409`): ParametersQueryAuthor = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryAuthor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryAuthor] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryAuthor): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
