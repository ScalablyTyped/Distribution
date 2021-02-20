package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposGetCombinedStatusForRefEndpoint extends StObject {
  
  var owner: String = js.native
  
  var ref: String = js.native
  
  var repo: String = js.native
}
object ReposGetCombinedStatusForRefEndpoint {
  
  @scala.inline
  def apply(owner: String, ref: String, repo: String): ReposGetCombinedStatusForRefEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetCombinedStatusForRefEndpoint]
  }
  
  @scala.inline
  implicit class ReposGetCombinedStatusForRefEndpointMutableBuilder[Self <: ReposGetCombinedStatusForRefEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
