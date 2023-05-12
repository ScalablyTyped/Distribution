package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepoDownloadsurl extends StObject {
  
  var label: String
  
  var ref: String
  
  /**
    * Repository
    * @description A git repository
    */
  var repo: Downloadsurl
  
  var sha: String
  
  /** User */
  var user: Deleted | Null
}
object RepoDownloadsurl {
  
  inline def apply(label: String, ref: String, repo: Downloadsurl, sha: String): RepoDownloadsurl = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = null)
    __obj.asInstanceOf[RepoDownloadsurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepoDownloadsurl] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: Downloadsurl): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Deleted): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
  }
}
