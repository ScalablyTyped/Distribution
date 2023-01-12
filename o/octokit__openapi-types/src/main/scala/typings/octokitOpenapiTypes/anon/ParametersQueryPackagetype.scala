package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPackagetype extends StObject {
  
  var parameters: QueryPackagetype
  
  var responses: `200401403`
}
object ParametersQueryPackagetype {
  
  inline def apply(parameters: QueryPackagetype, responses: `200401403`): ParametersQueryPackagetype = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPackagetype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryPackagetype] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryPackagetype): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200401403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
