package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner :string,   repo :string,   ref :string,   app_id :number | undefined,   check_name :string | undefined,   per_page :number | undefined,   page :number | undefined} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'antiope'> */
@js.native
trait ChecksListSuitesForRefEndpoint extends js.Object {
  /**
    * Filters check suites by GitHub App `id`.
    */
  var app_id: js.UndefOr[Double] = js.native
  /**
    * Filters checks suites by the name of the [check run](https://developer.github.com/v3/checks/runs/).
    */
  var check_name: js.UndefOr[String] = js.native
  var mediaType: `4` = js.native
  var owner: String = js.native
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.native
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.native
  var ref: String = js.native
  var repo: String = js.native
}

object ChecksListSuitesForRefEndpoint {
  @scala.inline
  def apply(mediaType: `4`, owner: String, ref: String, repo: String): ChecksListSuitesForRefEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksListSuitesForRefEndpoint]
  }
  @scala.inline
  implicit class ChecksListSuitesForRefEndpointOps[Self <: ChecksListSuitesForRefEndpoint] (val x: Self) extends AnyVal {
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
    def setMediaType(value: `4`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setApp_id(value: Double): Self = this.set("app_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp_id: Self = this.set("app_id", js.undefined)
    @scala.inline
    def setCheck_name(value: String): Self = this.set("check_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheck_name: Self = this.set("check_name", js.undefined)
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setPer_page(value: Double): Self = this.set("per_page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePer_page: Self = this.set("per_page", js.undefined)
  }
  
}

