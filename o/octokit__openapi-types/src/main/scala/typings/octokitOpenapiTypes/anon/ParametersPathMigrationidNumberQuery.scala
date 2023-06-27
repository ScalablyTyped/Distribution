package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMigrationidNumberQuery extends StObject {
  
  var parameters: PathMigrationidNumberQuery
  
  var responses: `200Content583`
}
object ParametersPathMigrationidNumberQuery {
  
  inline def apply(parameters: PathMigrationidNumberQuery, responses: `200Content583`): ParametersPathMigrationidNumberQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMigrationidNumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathMigrationidNumberQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathMigrationidNumberQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content583`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
