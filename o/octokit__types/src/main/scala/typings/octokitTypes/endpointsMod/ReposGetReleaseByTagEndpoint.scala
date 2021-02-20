package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposGetReleaseByTagEndpoint extends StObject {
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  var tag: String = js.native
}
object ReposGetReleaseByTagEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String, tag: String): ReposGetReleaseByTagEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetReleaseByTagEndpoint]
  }
  
  @scala.inline
  implicit class ReposGetReleaseByTagEndpointMutableBuilder[Self <: ReposGetReleaseByTagEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
