package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposCompareCommitsEndpoint extends StObject {
  
  var base: String
  
  var head: String
  
  var owner: String
  
  var repo: String
}
object ReposCompareCommitsEndpoint {
  
  @scala.inline
  def apply(base: String, head: String, owner: String, repo: String): ReposCompareCommitsEndpoint = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCompareCommitsEndpoint]
  }
  
  @scala.inline
  implicit class ReposCompareCommitsEndpointMutableBuilder[Self <: ReposCompareCommitsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHead(value: String): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
