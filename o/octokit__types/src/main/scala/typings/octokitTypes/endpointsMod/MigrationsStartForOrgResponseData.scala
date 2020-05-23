package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Allowmergecommit
import typings.octokitTypes.anon.Avatarurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsStartForOrgResponseData extends js.Object {
  var created_at: String
  var exclude_attachments: Boolean
  var guid: String
  var id: Double
  var lock_repositories: Boolean
  var owner: Avatarurl
  var repositories: js.Array[Allowmergecommit]
  var state: String
  var updated_at: String
  var url: String
}

object MigrationsStartForOrgResponseData {
  @scala.inline
  def apply(
    created_at: String,
    exclude_attachments: Boolean,
    guid: String,
    id: Double,
    lock_repositories: Boolean,
    owner: Avatarurl,
    repositories: js.Array[Allowmergecommit],
    state: String,
    updated_at: String,
    url: String
  ): MigrationsStartForOrgResponseData = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], exclude_attachments = exclude_attachments.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lock_repositories = lock_repositories.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repositories = repositories.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsStartForOrgResponseData]
  }
}

