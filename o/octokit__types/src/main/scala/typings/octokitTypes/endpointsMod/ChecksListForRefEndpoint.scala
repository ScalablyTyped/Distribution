package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`4`
import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.completed
import typings.octokitTypes.octokitTypesStrings.in_progress
import typings.octokitTypes.octokitTypesStrings.latest
import typings.octokitTypes.octokitTypesStrings.queued
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  owner :string,   repo :string,   ref :string,   check_name :string | undefined,   status :'queued' | 'in_progress' | 'completed' | undefined,   filter :'latest' | 'all' | undefined,   per_page :number | undefined,   page :number | undefined} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'antiope'> */
@js.native
trait ChecksListForRefEndpoint extends js.Object {
  /**
    * Returns check runs with the specified `name`.
    */
  var check_name: js.UndefOr[String] = js.native
  /**
    * Filters check runs by their `completed_at` timestamp. Can be one of `latest` (returning the most recent check runs) or `all`.
    */
  var filter: js.UndefOr[latest | all] = js.native
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
  /**
    * Returns check runs with the specified `status`. Can be one of `queued`, `in_progress`, or `completed`.
    */
  var status: js.UndefOr[queued | in_progress | completed] = js.native
}

object ChecksListForRefEndpoint {
  @scala.inline
  def apply(mediaType: `4`, owner: String, ref: String, repo: String): ChecksListForRefEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksListForRefEndpoint]
  }
  @scala.inline
  implicit class ChecksListForRefEndpointOps[Self <: ChecksListForRefEndpoint] (val x: Self) extends AnyVal {
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
    def setCheck_name(value: String): Self = this.set("check_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheck_name: Self = this.set("check_name", js.undefined)
    @scala.inline
    def setFilter(value: latest | all): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setPer_page(value: Double): Self = this.set("per_page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePer_page: Self = this.set("per_page", js.undefined)
    @scala.inline
    def setStatus(value: queued | in_progress | completed): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

