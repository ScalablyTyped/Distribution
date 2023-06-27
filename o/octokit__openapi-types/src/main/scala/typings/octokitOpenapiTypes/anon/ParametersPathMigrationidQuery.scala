package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMigrationidQuery extends StObject {
  
  var parameters: PathMigrationidQuery
  
  var responses: `200Content56`
}
object ParametersPathMigrationidQuery {
  
  inline def apply(parameters: PathMigrationidQuery, responses: `200Content56`): ParametersPathMigrationidQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMigrationidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathMigrationidQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathMigrationidQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content56`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
