package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Verification extends StObject {
  
  var author: js.UndefOr[DateEmailName] = js.undefined
  
  var committer: js.UndefOr[DateEmailName] = js.undefined
  
  var html_url: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var node_id: js.UndefOr[String] = js.undefined
  
  var parents: js.UndefOr[js.Array[HtmlurlShaUrl]] = js.undefined
  
  var sha: js.UndefOr[String] = js.undefined
  
  var tree: js.UndefOr[`389`] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var verification: js.UndefOr[Verified] = js.undefined
}
object Verification {
  
  inline def apply(): Verification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Verification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Verification] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: DateEmailName): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setCommitter(value: DateEmailName): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    inline def setCommitterUndefined: Self = StObject.set(x, "committer", js.undefined)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_urlUndefined: Self = StObject.set(x, "html_url", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    inline def setParents(value: js.Array[HtmlurlShaUrl]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
    
    inline def setParentsUndefined: Self = StObject.set(x, "parents", js.undefined)
    
    inline def setParentsVarargs(value: HtmlurlShaUrl*): Self = StObject.set(x, "parents", js.Array(value*))
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setShaUndefined: Self = StObject.set(x, "sha", js.undefined)
    
    inline def setTree(value: `389`): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    inline def setTreeUndefined: Self = StObject.set(x, "tree", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVerification(value: Verified): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
    
    inline def setVerificationUndefined: Self = StObject.set(x, "verification", js.undefined)
  }
}
