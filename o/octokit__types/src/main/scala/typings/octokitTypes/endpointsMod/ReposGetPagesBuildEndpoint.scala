package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposGetPagesBuildEndpoint extends StObject {
  
  var build_id: Double = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object ReposGetPagesBuildEndpoint {
  
  @scala.inline
  def apply(build_id: Double, owner: String, repo: String): ReposGetPagesBuildEndpoint = {
    val __obj = js.Dynamic.literal(build_id = build_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetPagesBuildEndpoint]
  }
  
  @scala.inline
  implicit class ReposGetPagesBuildEndpointMutableBuilder[Self <: ReposGetPagesBuildEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild_id(value: Double): Self = StObject.set(x, "build_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
