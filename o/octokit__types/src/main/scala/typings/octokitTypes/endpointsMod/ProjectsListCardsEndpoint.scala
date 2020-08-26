package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`10`
import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.archived
import typings.octokitTypes.octokitTypesStrings.not_archived
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  column_id :number,   archived_state :'all' | 'archived' | 'not_archived' | undefined,   per_page :number | undefined,   page :number | undefined} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
@js.native
trait ProjectsListCardsEndpoint extends js.Object {
  /**
    * Filters the project cards that are returned by the card's state. Can be one of `all`,`archived`, or `not_archived`.
    */
  var archived_state: js.UndefOr[all | archived | not_archived] = js.native
  var column_id: Double = js.native
  var mediaType: `10` = js.native
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.native
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.native
}

object ProjectsListCardsEndpoint {
  @scala.inline
  def apply(column_id: Double, mediaType: `10`): ProjectsListCardsEndpoint = {
    val __obj = js.Dynamic.literal(column_id = column_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsListCardsEndpoint]
  }
  @scala.inline
  implicit class ProjectsListCardsEndpointOps[Self <: ProjectsListCardsEndpoint] (val x: Self) extends AnyVal {
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
    def setColumn_id(value: Double): Self = this.set("column_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaType(value: `10`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setArchived_state(value: all | archived | not_archived): Self = this.set("archived_state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchived_state: Self = this.set("archived_state", js.undefined)
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

