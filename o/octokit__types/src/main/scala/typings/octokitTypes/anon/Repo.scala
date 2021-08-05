package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Repo extends StObject {
  
  var repo: Allowmergecommit
  
  var starred_at: String
}
object Repo {
  
  inline def apply(repo: Allowmergecommit, starred_at: String): Repo = {
    val __obj = js.Dynamic.literal(repo = repo.asInstanceOf[js.Any], starred_at = starred_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Repo]
  }
  
  extension [Self <: Repo](x: Self) {
    
    inline def setRepo(value: Allowmergecommit): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setStarred_at(value: String): Self = StObject.set(x, "starred_at", value.asInstanceOf[js.Any])
  }
}
