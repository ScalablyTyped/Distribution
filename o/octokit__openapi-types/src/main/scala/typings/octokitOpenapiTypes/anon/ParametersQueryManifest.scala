package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryManifest extends StObject {
  
  var parameters: QueryManifest
  
  var responses: `304403404422`
}
object ParametersQueryManifest {
  
  inline def apply(parameters: QueryManifest, responses: `304403404422`): ParametersQueryManifest = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryManifest]
  }
  
  extension [Self <: ParametersQueryManifest](x: Self) {
    
    inline def setParameters(value: QueryManifest): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304403404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
