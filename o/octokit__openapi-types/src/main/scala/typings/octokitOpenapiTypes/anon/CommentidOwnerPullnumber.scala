package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentidOwnerPullnumber extends StObject {
  
  /** The unique identifier of the comment. */
  var comment_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['comment-id'] */ js.Any
  
  /** The account owner of the repository. The name is not case sensitive. */
  var owner: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['owner'] */ js.Any
  
  /** The number that identifies the pull request. */
  var pull_number: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['pull-number'] */ js.Any
  
  /** The name of the repository. The name is not case sensitive. */
  var repo: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['repo'] */ js.Any
}
object CommentidOwnerPullnumber {
  
  inline def apply(
    comment_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['comment-id'] */ js.Any,
    owner: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['owner'] */ js.Any,
    pull_number: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['pull-number'] */ js.Any,
    repo: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['repo'] */ js.Any
  ): CommentidOwnerPullnumber = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentidOwnerPullnumber]
  }
  
  extension [Self <: CommentidOwnerPullnumber](x: Self) {
    
    inline def setComment_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['comment-id'] */ js.Any
    ): Self = StObject.set(x, "comment_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['owner'] */ js.Any
    ): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setPull_number(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['pull-number'] */ js.Any
    ): Self = StObject.set(x, "pull_number", value.asInstanceOf[js.Any])
    
    inline def setRepo(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['repo'] */ js.Any
    ): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
