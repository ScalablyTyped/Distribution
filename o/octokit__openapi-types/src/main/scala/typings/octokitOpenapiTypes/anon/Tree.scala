package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tree extends StObject {
  
  var author: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-git-user'] */ js.Any
  
  /** @example 0 */
  var comment_count: Double
  
  var committer: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-git-user'] */ js.Any
  
  /** @example Fix all the bugs */
  var message: String
  
  var tree: ShaUrl
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/Hello-World/commits/6dcb09b5b57875f334f61aebed695e2e4193db5e
    */
  var url: String
  
  var verification: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['verification'] */ js.Any
  ] = js.undefined
}
object Tree {
  
  inline def apply(
    author: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-git-user'] */ js.Any,
    comment_count: Double,
    committer: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-git-user'] */ js.Any,
    message: String,
    tree: ShaUrl,
    url: String
  ): Tree = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tree]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tree] (val x: Self) extends AnyVal {
    
    inline def setAuthor(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-git-user'] */ js.Any
    ): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
    
    inline def setCommitter(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-git-user'] */ js.Any
    ): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTree(value: ShaUrl): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVerification(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['verification'] */ js.Any
    ): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
    
    inline def setVerificationUndefined: Self = StObject.set(x, "verification", js.undefined)
  }
}
