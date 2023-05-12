package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberName extends StObject {
  
  var parameters: PathIssuenumberName
  
  var responses: `200282`
}
object ParametersPathIssuenumberName {
  
  inline def apply(parameters: PathIssuenumberName, responses: `200282`): ParametersPathIssuenumberName = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathIssuenumberName] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumberName): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200282`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
