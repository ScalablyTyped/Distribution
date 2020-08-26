package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner :string,   repo :string,   check_suite_id :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'antiope'> */
@js.native
trait ChecksGetSuiteEndpoint extends js.Object {
  var check_suite_id: Double = js.native
  var mediaType: `4` = js.native
  var owner: String = js.native
  var repo: String = js.native
}

object ChecksGetSuiteEndpoint {
  @scala.inline
  def apply(check_suite_id: Double, mediaType: `4`, owner: String, repo: String): ChecksGetSuiteEndpoint = {
    val __obj = js.Dynamic.literal(check_suite_id = check_suite_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksGetSuiteEndpoint]
  }
  @scala.inline
  implicit class ChecksGetSuiteEndpointOps[Self <: ChecksGetSuiteEndpoint] (val x: Self) extends AnyVal {
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
    def setCheck_suite_id(value: Double): Self = this.set("check_suite_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaType(value: `4`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
  }
  
}

