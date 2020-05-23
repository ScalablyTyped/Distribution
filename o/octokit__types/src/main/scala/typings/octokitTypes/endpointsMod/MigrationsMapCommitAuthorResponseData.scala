package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsMapCommitAuthorResponseData extends js.Object {
  var email: String
  var id: Double
  var import_url: String
  var name: String
  var remote_id: String
  var remote_name: String
  var url: String
}

object MigrationsMapCommitAuthorResponseData {
  @scala.inline
  def apply(
    email: String,
    id: Double,
    import_url: String,
    name: String,
    remote_id: String,
    remote_name: String,
    url: String
  ): MigrationsMapCommitAuthorResponseData = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], import_url = import_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], remote_id = remote_id.asInstanceOf[js.Any], remote_name = remote_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsMapCommitAuthorResponseData]
  }
}

