package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallationidRepositoryid extends StObject {
  
  var installation_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['installation-id'] */ js.Any
  
  var repository_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['repository-id'] */ js.Any
}
object InstallationidRepositoryid {
  
  inline def apply(
    installation_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['installation-id'] */ js.Any,
    repository_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['repository-id'] */ js.Any
  ): InstallationidRepositoryid = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any], repository_id = repository_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationidRepositoryid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstallationidRepositoryid] (val x: Self) extends AnyVal {
    
    inline def setInstallation_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['installation-id'] */ js.Any
    ): Self = StObject.set(x, "installation_id", value.asInstanceOf[js.Any])
    
    inline def setRepository_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['repository-id'] */ js.Any
    ): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
  }
}
