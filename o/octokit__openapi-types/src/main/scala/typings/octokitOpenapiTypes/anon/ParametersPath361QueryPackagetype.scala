package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath361QueryPackagetype extends StObject {
  
  var parameters: Path361QueryPackagetype
  
  var responses: `200401403`
}
object ParametersPath361QueryPackagetype {
  
  inline def apply(parameters: Path361QueryPackagetype, responses: `200401403`): ParametersPath361QueryPackagetype = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath361QueryPackagetype]
  }
  
  extension [Self <: ParametersPath361QueryPackagetype](x: Self) {
    
    inline def setParameters(value: Path361QueryPackagetype): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200401403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
