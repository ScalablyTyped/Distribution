package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMigrationidReponame extends StObject {
  
  var parameters: PathMigrationidReponame
  
  var responses: `349`
}
object ParametersPathMigrationidReponame {
  
  inline def apply(parameters: PathMigrationidReponame, responses: `349`): ParametersPathMigrationidReponame = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMigrationidReponame]
  }
  
  extension [Self <: ParametersPathMigrationidReponame](x: Self) {
    
    inline def setParameters(value: PathMigrationidReponame): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `349`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
