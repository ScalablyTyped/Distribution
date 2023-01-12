package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuerySort extends StObject {
  
  var parameters: QuerySort
  
  var responses: `101`
}
object ParametersQuerySort {
  
  inline def apply(parameters: QuerySort, responses: `101`): ParametersQuerySort = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuerySort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuerySort] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QuerySort): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `101`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
