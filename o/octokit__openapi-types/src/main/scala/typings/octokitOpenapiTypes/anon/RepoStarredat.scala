package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepoStarredat extends StObject {
  
  var repo: Allowmergecommit
  
  /** Format: date-time */
  var starred_at: String
}
object RepoStarredat {
  
  inline def apply(repo: Allowmergecommit, starred_at: String): RepoStarredat = {
    val __obj = js.Dynamic.literal(repo = repo.asInstanceOf[js.Any], starred_at = starred_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoStarredat]
  }
  
  extension [Self <: RepoStarredat](x: Self) {
    
    inline def setRepo(value: Allowmergecommit): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setStarred_at(value: String): Self = StObject.set(x, "starred_at", value.asInstanceOf[js.Any])
  }
}
