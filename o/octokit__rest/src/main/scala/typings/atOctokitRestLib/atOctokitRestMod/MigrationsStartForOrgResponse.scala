package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsStartForOrgResponse extends js.Object {
  var created_at: java.lang.String
  var exclude_attachments: scala.Boolean
  var guid: java.lang.String
  var id: scala.Double
  var lock_repositories: scala.Boolean
  var owner: MigrationsStartForOrgResponseOwner
  var repositories: js.Array[MigrationsStartForOrgResponseRepositoriesItem]
  var state: java.lang.String
  var updated_at: java.lang.String
  var url: java.lang.String
}

object MigrationsStartForOrgResponse {
  @scala.inline
  def apply(
    created_at: java.lang.String,
    exclude_attachments: scala.Boolean,
    guid: java.lang.String,
    id: scala.Double,
    lock_repositories: scala.Boolean,
    owner: MigrationsStartForOrgResponseOwner,
    repositories: js.Array[MigrationsStartForOrgResponseRepositoriesItem],
    state: java.lang.String,
    updated_at: java.lang.String,
    url: java.lang.String
  ): MigrationsStartForOrgResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at, exclude_attachments = exclude_attachments, guid = guid, id = id, lock_repositories = lock_repositories, owner = owner, repositories = repositories, state = state, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[MigrationsStartForOrgResponse]
  }
}

