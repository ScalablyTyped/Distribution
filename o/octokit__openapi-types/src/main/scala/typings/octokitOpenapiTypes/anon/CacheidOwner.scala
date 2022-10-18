package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheidOwner extends StObject {
  
  /** The unique identifier of the GitHub Actions cache. */
  var cache_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['cache-id'] */ js.Any
  
  /** The account owner of the repository. The name is not case sensitive. */
  var owner: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['owner'] */ js.Any
  
  /** The name of the repository. The name is not case sensitive. */
  var repo: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['repo'] */ js.Any
}
object CacheidOwner {
  
  inline def apply(
    cache_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['cache-id'] */ js.Any,
    owner: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['owner'] */ js.Any,
    repo: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['repo'] */ js.Any
  ): CacheidOwner = {
    val __obj = js.Dynamic.literal(cache_id = cache_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheidOwner]
  }
  
  extension [Self <: CacheidOwner](x: Self) {
    
    inline def setCache_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['cache-id'] */ js.Any
    ): Self = StObject.set(x, "cache_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['owner'] */ js.Any
    ): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['repo'] */ js.Any
    ): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
