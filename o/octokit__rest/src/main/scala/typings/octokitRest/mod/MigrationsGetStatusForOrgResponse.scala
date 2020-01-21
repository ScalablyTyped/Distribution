package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsGetStatusForOrgResponse extends js.Object {
  var created_at: String
  var exclude_attachments: Boolean
  var guid: String
  var id: Double
  var lock_repositories: Boolean
  var owner: MigrationsGetStatusForOrgResponseOwner
  var repositories: js.Array[MigrationsGetStatusForOrgResponseRepositoriesItem]
  var state: String
  var updated_at: String
  var url: String
}

object MigrationsGetStatusForOrgResponse {
  @scala.inline
  def apply(
    created_at: String,
    exclude_attachments: Boolean,
    guid: String,
    id: Double,
    lock_repositories: Boolean,
    owner: MigrationsGetStatusForOrgResponseOwner,
    repositories: js.Array[MigrationsGetStatusForOrgResponseRepositoriesItem],
    state: String,
    updated_at: String,
    url: String
  ): MigrationsGetStatusForOrgResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], exclude_attachments = exclude_attachments.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lock_repositories = lock_repositories.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repositories = repositories.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MigrationsGetStatusForOrgResponse]
  }
}

