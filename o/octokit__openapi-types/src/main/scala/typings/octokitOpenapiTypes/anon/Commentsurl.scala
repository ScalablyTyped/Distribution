package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commentsurl extends StObject {
  
  var comments: Double
  
  /** Format: uri */
  var comments_url: String
  
  /** Format: uri */
  var commits_url: String
  
  /** Format: date-time */
  var created_at: String
  
  var description: String | Null
  
  var files: StringDictionary[Filename]
  
  var forks: js.UndefOr[js.Array[Any]] = js.undefined
  
  /** Format: uri */
  var forks_url: String
  
  /** Format: uri */
  var git_pull_url: String
  
  /** Format: uri */
  var git_push_url: String
  
  var history: js.UndefOr[js.Array[Any]] = js.undefined
  
  /** Format: uri */
  var html_url: String
  
  var id: String
  
  var node_id: String
  
  var owner: js.UndefOr[Avatarurl] = js.undefined
  
  var public: Boolean
  
  var truncated: js.UndefOr[Boolean] = js.undefined
  
  /** Format: date-time */
  var updated_at: String
  
  /** Format: uri */
  var url: String
  
  var user: Avatarurl | Null
}
object Commentsurl {
  
  inline def apply(
    comments: Double,
    comments_url: String,
    commits_url: String,
    created_at: String,
    files: StringDictionary[Filename],
    forks_url: String,
    git_pull_url: String,
    git_push_url: String,
    html_url: String,
    id: String,
    node_id: String,
    public: Boolean,
    updated_at: String,
    url: String
  ): Commentsurl = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commits_url = commits_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], forks_url = forks_url.asInstanceOf[js.Any], git_pull_url = git_pull_url.asInstanceOf[js.Any], git_push_url = git_push_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], description = null, user = null)
    __obj.asInstanceOf[Commentsurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Commentsurl] (val x: Self) extends AnyVal {
    
    inline def setComments(value: Double): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setComments_url(value: String): Self = StObject.set(x, "comments_url", value.asInstanceOf[js.Any])
    
    inline def setCommits_url(value: String): Self = StObject.set(x, "commits_url", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setFiles(value: StringDictionary[Filename]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setForks(value: js.Array[Any]): Self = StObject.set(x, "forks", value.asInstanceOf[js.Any])
    
    inline def setForksUndefined: Self = StObject.set(x, "forks", js.undefined)
    
    inline def setForksVarargs(value: Any*): Self = StObject.set(x, "forks", js.Array(value*))
    
    inline def setForks_url(value: String): Self = StObject.set(x, "forks_url", value.asInstanceOf[js.Any])
    
    inline def setGit_pull_url(value: String): Self = StObject.set(x, "git_pull_url", value.asInstanceOf[js.Any])
    
    inline def setGit_push_url(value: String): Self = StObject.set(x, "git_push_url", value.asInstanceOf[js.Any])
    
    inline def setHistory(value: js.Array[Any]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setHistoryVarargs(value: Any*): Self = StObject.set(x, "history", js.Array(value*))
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: Avatarurl): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setTruncated(value: Boolean): Self = StObject.set(x, "truncated", value.asInstanceOf[js.Any])
    
    inline def setTruncatedUndefined: Self = StObject.set(x, "truncated", js.undefined)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Avatarurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
  }
}
