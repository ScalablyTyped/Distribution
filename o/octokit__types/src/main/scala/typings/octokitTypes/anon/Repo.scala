package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Repo extends StObject {
  
  var repo: Allowmergecommit
  
  var starred_at: String
}
object Repo {
  
  @scala.inline
  def apply(repo: Allowmergecommit, starred_at: String): Repo = {
    val __obj = js.Dynamic.literal(repo = repo.asInstanceOf[js.Any], starred_at = starred_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Repo]
  }
  
  @scala.inline
  implicit class RepoMutableBuilder[Self <: Repo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepo(value: Allowmergecommit): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarred_at(value: String): Self = StObject.set(x, "starred_at", value.asInstanceOf[js.Any])
  }
}
