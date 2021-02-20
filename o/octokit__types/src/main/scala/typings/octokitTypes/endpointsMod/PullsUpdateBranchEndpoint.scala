package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  owner :string,   repo :string,   pull_number :number,   expected_head_sha :string | undefined} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'lydian'> */
@js.native
trait PullsUpdateBranchEndpoint extends StObject {
  
  /**
    * The expected SHA of the pull request's HEAD ref. This is the most recent commit on the pull request's branch. If the expected SHA does not match the pull request's HEAD, you will receive a `422 Unprocessable Entity` status. You can use the "[List commits](https://developer.github.com/v3/repos/commits/#list-commits)" endpoint to find the most recent commit SHA. Default: SHA of the pull request's current HEAD ref.
    */
  var expected_head_sha: js.UndefOr[String] = js.native
  
  var mediaType: `8` = js.native
  
  var owner: String = js.native
  
  var pull_number: Double = js.native
  
  var repo: String = js.native
}
object PullsUpdateBranchEndpoint {
  
  @scala.inline
  def apply(mediaType: `8`, owner: String, pull_number: Double, repo: String): PullsUpdateBranchEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsUpdateBranchEndpoint]
  }
  
  @scala.inline
  implicit class PullsUpdateBranchEndpointMutableBuilder[Self <: PullsUpdateBranchEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpected_head_sha(value: String): Self = StObject.set(x, "expected_head_sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpected_head_shaUndefined: Self = StObject.set(x, "expected_head_sha", js.undefined)
    
    @scala.inline
    def setMediaType(value: `8`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPull_number(value: Double): Self = StObject.set(x, "pull_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
