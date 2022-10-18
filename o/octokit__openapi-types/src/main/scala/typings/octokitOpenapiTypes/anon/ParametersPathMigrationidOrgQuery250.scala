package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMigrationidOrgQuery250 extends StObject {
  
  var parameters: PathMigrationidOrgQuery250
  
  var responses: `200Content349`
}
object ParametersPathMigrationidOrgQuery250 {
  
  inline def apply(parameters: PathMigrationidOrgQuery250, responses: `200Content349`): ParametersPathMigrationidOrgQuery250 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMigrationidOrgQuery250]
  }
  
  extension [Self <: ParametersPathMigrationidOrgQuery250](x: Self) {
    
    inline def setParameters(value: PathMigrationidOrgQuery250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content349`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
