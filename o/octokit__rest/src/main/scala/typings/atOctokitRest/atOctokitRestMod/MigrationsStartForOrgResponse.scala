package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsStartForOrgResponse extends js.Object {
  var created_at: String
  var exclude_attachments: Boolean
  var guid: String
  var id: Double
  var lock_repositories: Boolean
  var owner: MigrationsStartForOrgResponseOwner
  var repositories: js.Array[MigrationsStartForOrgResponseRepositoriesItem]
  var state: String
  var updated_at: String
  var url: String
}

object MigrationsStartForOrgResponse {
  @scala.inline
  def apply(
    created_at: String,
    exclude_attachments: Boolean,
    guid: String,
    id: Double,
    lock_repositories: Boolean,
    owner: MigrationsStartForOrgResponseOwner,
    repositories: js.Array[MigrationsStartForOrgResponseRepositoriesItem],
    state: String,
    updated_at: String,
    url: String
  ): MigrationsStartForOrgResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at, exclude_attachments = exclude_attachments, guid = guid, id = id, lock_repositories = lock_repositories, owner = owner, repositories = repositories, state = state, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[MigrationsStartForOrgResponse]
  }
}

