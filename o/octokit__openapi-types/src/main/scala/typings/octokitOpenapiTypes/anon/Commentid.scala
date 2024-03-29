package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commentid extends StObject {
  
  var comment_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['comment-id'] */ js.Any
  
  var gist_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['gist-id'] */ js.Any
}
object Commentid {
  
  inline def apply(
    comment_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['comment-id'] */ js.Any,
    gist_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['gist-id'] */ js.Any
  ): Commentid = {
    val __obj = js.Dynamic.literal(comment_id = comment_id.asInstanceOf[js.Any], gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commentid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Commentid] (val x: Self) extends AnyVal {
    
    inline def setComment_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['comment-id'] */ js.Any
    ): Self = StObject.set(x, "comment_id", value.asInstanceOf[js.Any])
    
    inline def setGist_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['gist-id'] */ js.Any
    ): Self = StObject.set(x, "gist_id", value.asInstanceOf[js.Any])
  }
}
