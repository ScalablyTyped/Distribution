package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`15`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner :string,   repo :string,   source :@octokit/types.@octokit/types/dist-types/generated/Endpoints.ReposCreatePagesSiteParamsSource | undefined} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'switcheroo'> */
@js.native
trait ReposCreatePagesSiteEndpoint extends js.Object {
  var mediaType: `15` = js.native
  var owner: String = js.native
  var repo: String = js.native
  var source: js.UndefOr[ReposCreatePagesSiteParamsSource] = js.native
}

object ReposCreatePagesSiteEndpoint {
  @scala.inline
  def apply(mediaType: `15`, owner: String, repo: String): ReposCreatePagesSiteEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreatePagesSiteEndpoint]
  }
  @scala.inline
  implicit class ReposCreatePagesSiteEndpointOps[Self <: ReposCreatePagesSiteEndpoint] (val x: Self) extends AnyVal {
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
    def setMediaType(value: `15`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: ReposCreatePagesSiteParamsSource): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

