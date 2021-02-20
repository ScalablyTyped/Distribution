package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  owner :string,   repo :string,   check_run_id :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'antiope'> */
@js.native
trait ChecksGetEndpoint extends StObject {
  
  var check_run_id: Double = js.native
  
  var mediaType: `2` = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object ChecksGetEndpoint {
  
  @scala.inline
  def apply(check_run_id: Double, mediaType: `2`, owner: String, repo: String): ChecksGetEndpoint = {
    val __obj = js.Dynamic.literal(check_run_id = check_run_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksGetEndpoint]
  }
  
  @scala.inline
  implicit class ChecksGetEndpointMutableBuilder[Self <: ChecksGetEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheck_run_id(value: Double): Self = StObject.set(x, "check_run_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: `2`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
