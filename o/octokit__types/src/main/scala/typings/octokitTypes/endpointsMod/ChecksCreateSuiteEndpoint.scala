package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  owner :string,   repo :string,   head_sha :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'antiope'> */
@js.native
trait ChecksCreateSuiteEndpoint extends StObject {
  
  /**
    * The sha of the head commit.
    */
  var head_sha: String = js.native
  
  var mediaType: `2` = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object ChecksCreateSuiteEndpoint {
  
  @scala.inline
  def apply(head_sha: String, mediaType: `2`, owner: String, repo: String): ChecksCreateSuiteEndpoint = {
    val __obj = js.Dynamic.literal(head_sha = head_sha.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksCreateSuiteEndpoint]
  }
  
  @scala.inline
  implicit class ChecksCreateSuiteEndpointMutableBuilder[Self <: ChecksCreateSuiteEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHead_sha(value: String): Self = StObject.set(x, "head_sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: `2`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
