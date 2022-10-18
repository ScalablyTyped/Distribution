package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `628` extends StObject {
  
  /** The unique identifier of the installation. */
  var installation_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['installation-id'] */ js.Any
  
  /** The unique identifier of the repository. */
  var repository_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['repository-id'] */ js.Any
}
object `628` {
  
  inline def apply(
    installation_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['installation-id'] */ js.Any,
    repository_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['repository-id'] */ js.Any
  ): `628` = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any], repository_id = repository_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[`628`]
  }
  
  extension [Self <: `628`](x: Self) {
    
    inline def setInstallation_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['installation-id'] */ js.Any
    ): Self = StObject.set(x, "installation_id", value.asInstanceOf[js.Any])
    
    inline def setRepository_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['repository-id'] */ js.Any
    ): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
  }
}
