package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner :string,   repo :string,   head_sha :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'antiope'> */
@js.native
trait ChecksCreateSuiteEndpoint extends js.Object {
  /**
    * The sha of the head commit.
    */
  var head_sha: String = js.native
  var mediaType: `4` = js.native
  var owner: String = js.native
  var repo: String = js.native
}

object ChecksCreateSuiteEndpoint {
  @scala.inline
  def apply(head_sha: String, mediaType: `4`, owner: String, repo: String): ChecksCreateSuiteEndpoint = {
    val __obj = js.Dynamic.literal(head_sha = head_sha.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksCreateSuiteEndpoint]
  }
  @scala.inline
  implicit class ChecksCreateSuiteEndpointOps[Self <: ChecksCreateSuiteEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHead_sha(value: String): Self = this.set("head_sha", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaType(value: `4`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
  }
  
}

