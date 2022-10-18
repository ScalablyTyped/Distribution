package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `601` extends StObject {
  
  /** The name of the environment. */
  var environment_name: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['environment-name'] */ js.Any
  
  /** The unique identifier of the repository. */
  var repository_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['repository-id'] */ js.Any
}
object `601` {
  
  inline def apply(
    environment_name: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['environment-name'] */ js.Any,
    repository_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['repository-id'] */ js.Any
  ): `601` = {
    val __obj = js.Dynamic.literal(environment_name = environment_name.asInstanceOf[js.Any], repository_id = repository_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[`601`]
  }
  
  extension [Self <: `601`](x: Self) {
    
    inline def setEnvironment_name(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['environment-name'] */ js.Any
    ): Self = StObject.set(x, "environment_name", value.asInstanceOf[js.Any])
    
    inline def setRepository_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['repository-id'] */ js.Any
    ): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
  }
}
