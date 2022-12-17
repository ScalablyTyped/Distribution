package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMigrationidNumberQuery407 extends StObject {
  
  var parameters: PathMigrationidNumberQuery407
  
  var responses: `200Content451`
}
object ParametersPathMigrationidNumberQuery407 {
  
  inline def apply(parameters: PathMigrationidNumberQuery407, responses: `200Content451`): ParametersPathMigrationidNumberQuery407 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMigrationidNumberQuery407]
  }
  
  extension [Self <: ParametersPathMigrationidNumberQuery407](x: Self) {
    
    inline def setParameters(value: PathMigrationidNumberQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content451`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
