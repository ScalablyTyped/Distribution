package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMigrationidOrgQuery407 extends StObject {
  
  var parameters: PathMigrationidOrgQuery407
  
  var responses: `200Content451`
}
object ParametersPathMigrationidOrgQuery407 {
  
  inline def apply(parameters: PathMigrationidOrgQuery407, responses: `200Content451`): ParametersPathMigrationidOrgQuery407 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMigrationidOrgQuery407]
  }
  
  extension [Self <: ParametersPathMigrationidOrgQuery407](x: Self) {
    
    inline def setParameters(value: PathMigrationidOrgQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content451`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
