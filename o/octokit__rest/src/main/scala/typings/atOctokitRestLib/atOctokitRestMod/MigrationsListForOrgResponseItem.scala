package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsListForOrgResponseItem extends js.Object {
  var created_at: java.lang.String
  var exclude_attachments: scala.Boolean
  var guid: java.lang.String
  var id: scala.Double
  var lock_repositories: scala.Boolean
  var owner: MigrationsListForOrgResponseItemOwner
  var repositories: js.Array[MigrationsListForOrgResponseItemRepositoriesItem]
  var state: java.lang.String
  var updated_at: java.lang.String
  var url: java.lang.String
}

object MigrationsListForOrgResponseItem {
  @scala.inline
  def apply(
    created_at: java.lang.String,
    exclude_attachments: scala.Boolean,
    guid: java.lang.String,
    id: scala.Double,
    lock_repositories: scala.Boolean,
    owner: MigrationsListForOrgResponseItemOwner,
    repositories: js.Array[MigrationsListForOrgResponseItemRepositoriesItem],
    state: java.lang.String,
    updated_at: java.lang.String,
    url: java.lang.String
  ): MigrationsListForOrgResponseItem = {
    val __obj = js.Dynamic.literal(created_at = created_at, exclude_attachments = exclude_attachments, guid = guid, id = id, lock_repositories = lock_repositories, owner = owner, repositories = repositories, state = state, updated_at = updated_at, url = url)
  
    __obj.asInstanceOf[MigrationsListForOrgResponseItem]
  }
}

