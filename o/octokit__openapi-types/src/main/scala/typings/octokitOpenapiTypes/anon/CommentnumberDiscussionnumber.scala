package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentnumberDiscussionnumber extends StObject {
  
  var comment_number: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['comment-number'] */ js.Any
  
  var discussion_number: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['discussion-number'] */ js.Any
  
  var team_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['team-id'] */ js.Any
}
object CommentnumberDiscussionnumber {
  
  inline def apply(
    comment_number: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['comment-number'] */ js.Any,
    discussion_number: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['discussion-number'] */ js.Any,
    team_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['team-id'] */ js.Any
  ): CommentnumberDiscussionnumber = {
    val __obj = js.Dynamic.literal(comment_number = comment_number.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentnumberDiscussionnumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentnumberDiscussionnumber] (val x: Self) extends AnyVal {
    
    inline def setComment_number(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['comment-number'] */ js.Any
    ): Self = StObject.set(x, "comment_number", value.asInstanceOf[js.Any])
    
    inline def setDiscussion_number(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['discussion-number'] */ js.Any
    ): Self = StObject.set(x, "discussion_number", value.asInstanceOf[js.Any])
    
    inline def setTeam_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['team-id'] */ js.Any
    ): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
  }
}
