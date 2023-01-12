package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath348QueryPackagetype extends StObject {
  
  var parameters: Path348QueryPackagetype
  
  var responses: `200401403`
}
object ParametersPath348QueryPackagetype {
  
  inline def apply(parameters: Path348QueryPackagetype, responses: `200401403`): ParametersPath348QueryPackagetype = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath348QueryPackagetype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPath348QueryPackagetype] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path348QueryPackagetype): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200401403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
