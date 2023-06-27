package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMigrationidReponame extends StObject {
  
  var parameters: PathMigrationidReponame
  
  var responses: `445`
}
object ParametersPathMigrationidReponame {
  
  inline def apply(parameters: PathMigrationidReponame, responses: `445`): ParametersPathMigrationidReponame = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMigrationidReponame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathMigrationidReponame] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathMigrationidReponame): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `445`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
