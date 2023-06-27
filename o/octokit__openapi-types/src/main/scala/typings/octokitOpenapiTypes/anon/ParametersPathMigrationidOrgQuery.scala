package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMigrationidOrgQuery extends StObject {
  
  var parameters: PathMigrationidOrgQuery
  
  var responses: `200Content583`
}
object ParametersPathMigrationidOrgQuery {
  
  inline def apply(parameters: PathMigrationidOrgQuery, responses: `200Content583`): ParametersPathMigrationidOrgQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMigrationidOrgQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathMigrationidOrgQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathMigrationidOrgQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content583`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
