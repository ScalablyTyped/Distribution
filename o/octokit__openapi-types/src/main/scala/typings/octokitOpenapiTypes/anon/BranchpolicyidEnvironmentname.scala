package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BranchpolicyidEnvironmentname extends StObject {
  
  /** The unique identifier of the branch policy. */
  var branch_policy_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['branch-policy-id'] */ js.Any
  
  /** The name of the environment. */
  var environment_name: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['environment-name'] */ js.Any
  
  /** The account owner of the repository. The name is not case sensitive. */
  var owner: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['owner'] */ js.Any
  
  /** The name of the repository. The name is not case sensitive. */
  var repo: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['repo'] */ js.Any
}
object BranchpolicyidEnvironmentname {
  
  inline def apply(
    branch_policy_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['branch-policy-id'] */ js.Any,
    environment_name: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['environment-name'] */ js.Any,
    owner: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['owner'] */ js.Any,
    repo: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['repo'] */ js.Any
  ): BranchpolicyidEnvironmentname = {
    val __obj = js.Dynamic.literal(branch_policy_id = branch_policy_id.asInstanceOf[js.Any], environment_name = environment_name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchpolicyidEnvironmentname]
  }
  
  extension [Self <: BranchpolicyidEnvironmentname](x: Self) {
    
    inline def setBranch_policy_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['branch-policy-id'] */ js.Any
    ): Self = StObject.set(x, "branch_policy_id", value.asInstanceOf[js.Any])
    
    inline def setEnvironment_name(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['environment-name'] */ js.Any
    ): Self = StObject.set(x, "environment_name", value.asInstanceOf[js.Any])
    
    inline def setOwner(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['owner'] */ js.Any
    ): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['repo'] */ js.Any
    ): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
