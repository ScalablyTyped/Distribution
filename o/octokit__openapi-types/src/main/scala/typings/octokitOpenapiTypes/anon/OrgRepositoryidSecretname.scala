package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgRepositoryidSecretname extends StObject {
  
  /** The organization name. The name is not case sensitive. */
  @JSName("org")
  var org_ : /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org'] */ js.Any
  
  var repository_id: Double
  
  /** The name of the secret. */
  var secret_name: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['secret-name'] */ js.Any
}
object OrgRepositoryidSecretname {
  
  inline def apply(
    org_ : /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org'] */ js.Any,
    repository_id: Double,
    secret_name: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['secret-name'] */ js.Any
  ): OrgRepositoryidSecretname = {
    val __obj = js.Dynamic.literal(repository_id = repository_id.asInstanceOf[js.Any], secret_name = secret_name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgRepositoryidSecretname]
  }
  
  extension [Self <: OrgRepositoryidSecretname](x: Self) {
    
    inline def setOrg_(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org'] */ js.Any
    ): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setRepository_id(value: Double): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
    
    inline def setSecret_name(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['secret-name'] */ js.Any
    ): Self = StObject.set(x, "secret_name", value.asInstanceOf[js.Any])
  }
}
