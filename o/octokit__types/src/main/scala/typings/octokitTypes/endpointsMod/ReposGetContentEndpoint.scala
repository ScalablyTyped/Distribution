package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposGetContentEndpoint extends StObject {
  
  var owner: String
  
  var path: String
  
  /**
    * The name of the commit/branch/tag. Default: the repository’s default branch (usually `master`)
    */
  var ref: js.UndefOr[String] = js.undefined
  
  var repo: String
}
object ReposGetContentEndpoint {
  
  @scala.inline
  def apply(owner: String, path: String, repo: String): ReposGetContentEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetContentEndpoint]
  }
  
  @scala.inline
  implicit class ReposGetContentEndpointMutableBuilder[Self <: ReposGetContentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
