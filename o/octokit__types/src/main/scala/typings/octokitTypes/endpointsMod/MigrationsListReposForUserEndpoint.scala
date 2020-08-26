package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  migration_id :number,   per_page :number | undefined,   page :number | undefined} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'wyandotte'> */
@js.native
trait MigrationsListReposForUserEndpoint extends js.Object {
  var mediaType: `9` = js.native
  var migration_id: Double = js.native
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[Double] = js.native
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[Double] = js.native
}

object MigrationsListReposForUserEndpoint {
  @scala.inline
  def apply(mediaType: `9`, migration_id: Double): MigrationsListReposForUserEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], migration_id = migration_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsListReposForUserEndpoint]
  }
  @scala.inline
  implicit class MigrationsListReposForUserEndpointOps[Self <: MigrationsListReposForUserEndpoint] (val x: Self) extends AnyVal {
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
    def setMediaType(value: `9`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMigration_id(value: Double): Self = this.set("migration_id", value.asInstanceOf[js.Any])
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

