package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  org :string,   migration_id :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'wyandotte'> */
@js.native
trait MigrationsGetStatusForOrgEndpoint extends js.Object {
  var mediaType: `9` = js.native
  var migration_id: Double = js.native
  @JSName("org")
  var org_ : String = js.native
}

object MigrationsGetStatusForOrgEndpoint {
  @scala.inline
  def apply(mediaType: `9`, migration_id: Double, org_ : String): MigrationsGetStatusForOrgEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], migration_id = migration_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsGetStatusForOrgEndpoint]
  }
  @scala.inline
  implicit class MigrationsGetStatusForOrgEndpointOps[Self <: MigrationsGetStatusForOrgEndpoint] (val x: Self) extends AnyVal {
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
    def setOrg_(value: String): Self = this.set("org", value.asInstanceOf[js.Any])
  }
  
}

