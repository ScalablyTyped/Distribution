package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMigrationidOrg extends StObject {
  
  var parameters: PathMigrationidOrg
  
  var responses: `200Content347`
}
object ParametersPathMigrationidOrg {
  
  inline def apply(parameters: PathMigrationidOrg, responses: `200Content347`): ParametersPathMigrationidOrg = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMigrationidOrg]
  }
  
  extension [Self <: ParametersPathMigrationidOrg](x: Self) {
    
    inline def setParameters(value: PathMigrationidOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content347`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
