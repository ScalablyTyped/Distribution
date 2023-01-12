package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepoStarredat extends StObject {
  
  var repo: Allowupdatebranch
  
  /** Format: date-time */
  var starred_at: String
}
object RepoStarredat {
  
  inline def apply(repo: Allowupdatebranch, starred_at: String): RepoStarredat = {
    val __obj = js.Dynamic.literal(repo = repo.asInstanceOf[js.Any], starred_at = starred_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoStarredat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepoStarredat] (val x: Self) extends AnyVal {
    
    inline def setRepo(value: Allowupdatebranch): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setStarred_at(value: String): Self = StObject.set(x, "starred_at", value.asInstanceOf[js.Any])
  }
}
