package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMigrationidNumberQuery426 extends StObject {
  
  var parameters: PathMigrationidNumberQuery426
  
  var responses: `200Content467`
}
object ParametersPathMigrationidNumberQuery426 {
  
  inline def apply(parameters: PathMigrationidNumberQuery426, responses: `200Content467`): ParametersPathMigrationidNumberQuery426 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMigrationidNumberQuery426]
  }
  
  extension [Self <: ParametersPathMigrationidNumberQuery426](x: Self) {
    
    inline def setParameters(value: PathMigrationidNumberQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content467`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
