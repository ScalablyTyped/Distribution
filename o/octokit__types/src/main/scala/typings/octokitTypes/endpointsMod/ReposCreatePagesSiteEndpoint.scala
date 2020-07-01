package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`15`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner  :string,   repo  :string,   source ? :@octokit/types.@octokit/types/dist-types/generated/Endpoints.ReposCreatePagesSiteParamsSource} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'switcheroo'> */
trait ReposCreatePagesSiteEndpoint extends js.Object {
  var mediaType: `15`
  var owner: String
  var repo: String
  var source: js.UndefOr[ReposCreatePagesSiteParamsSource] = js.undefined
}

object ReposCreatePagesSiteEndpoint {
  @scala.inline
  def apply(mediaType: `15`, owner: String, repo: String, source: ReposCreatePagesSiteParamsSource = null): ReposCreatePagesSiteEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreatePagesSiteEndpoint]
  }
}

