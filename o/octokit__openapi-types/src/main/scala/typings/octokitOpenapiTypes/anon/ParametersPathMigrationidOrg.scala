package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMigrationidOrg extends StObject {
  
  var parameters: PathMigrationidOrg
  
  var responses: `200ContentApplicationjsonExcludeownerprojects`
}
object ParametersPathMigrationidOrg {
  
  inline def apply(parameters: PathMigrationidOrg, responses: `200ContentApplicationjsonExcludeownerprojects`): ParametersPathMigrationidOrg = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMigrationidOrg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathMigrationidOrg] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathMigrationidOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonExcludeownerprojects`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
