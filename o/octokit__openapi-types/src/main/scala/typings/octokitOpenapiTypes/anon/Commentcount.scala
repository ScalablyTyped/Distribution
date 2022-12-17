package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commentcount extends StObject {
  
  var author: DateEmail | Null
  
  /** @example 0 */
  var comment_count: Double
  
  var committer: DateEmail | Null
  
  /** @example Fix all the bugs */
  var message: String
  
  var tree: ShaUrl
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/Hello-World/commits/6dcb09b5b57875f334f61aebed695e2e4193db5e
    */
  var url: String
  
  var verification: js.UndefOr[Signature] = js.undefined
}
object Commentcount {
  
  inline def apply(comment_count: Double, message: String, tree: ShaUrl, url: String): Commentcount = {
    val __obj = js.Dynamic.literal(comment_count = comment_count.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], author = null, committer = null)
    __obj.asInstanceOf[Commentcount]
  }
  
  extension [Self <: Commentcount](x: Self) {
    
    inline def setAuthor(value: DateEmail): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorNull: Self = StObject.set(x, "author", null)
    
    inline def setComment_count(value: Double): Self = StObject.set(x, "comment_count", value.asInstanceOf[js.Any])
    
    inline def setCommitter(value: DateEmail): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    inline def setCommitterNull: Self = StObject.set(x, "committer", null)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTree(value: ShaUrl): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVerification(value: Signature): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
    
    inline def setVerificationUndefined: Self = StObject.set(x, "verification", js.undefined)
  }
}
