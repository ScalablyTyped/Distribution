package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMigrationidOrgQuery426 extends StObject {
  
  var parameters: PathMigrationidOrgQuery426
  
  var responses: `200Content467`
}
object ParametersPathMigrationidOrgQuery426 {
  
  inline def apply(parameters: PathMigrationidOrgQuery426, responses: `200Content467`): ParametersPathMigrationidOrgQuery426 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMigrationidOrgQuery426]
  }
  
  extension [Self <: ParametersPathMigrationidOrgQuery426](x: Self) {
    
    inline def setParameters(value: PathMigrationidOrgQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content467`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
