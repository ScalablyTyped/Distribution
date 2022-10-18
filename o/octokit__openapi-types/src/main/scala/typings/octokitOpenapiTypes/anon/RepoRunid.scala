package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepoRunid extends StObject {
  
  /** The account owner of the repository. The name is not case sensitive. */
  var owner: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['owner'] */ js.Any
  
  /** The name of the repository. The name is not case sensitive. */
  var repo: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['repo'] */ js.Any
  
  /** The unique identifier of the workflow run. */
  var run_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['run-id'] */ js.Any
}
object RepoRunid {
  
  inline def apply(
    owner: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['owner'] */ js.Any,
    repo: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['repo'] */ js.Any,
    run_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['run-id'] */ js.Any
  ): RepoRunid = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], run_id = run_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoRunid]
  }
  
  extension [Self <: RepoRunid](x: Self) {
    
    inline def setOwner(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['owner'] */ js.Any
    ): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['repo'] */ js.Any
    ): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setRun_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['run-id'] */ js.Any
    ): Self = StObject.set(x, "run_id", value.asInstanceOf[js.Any])
  }
}
