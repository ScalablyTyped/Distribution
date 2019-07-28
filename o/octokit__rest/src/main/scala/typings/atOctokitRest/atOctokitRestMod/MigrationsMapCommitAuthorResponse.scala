package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsMapCommitAuthorResponse extends js.Object {
  var email: String
  var id: Double
  var import_url: String
  var name: String
  var remote_id: String
  var remote_name: String
  var url: String
}

object MigrationsMapCommitAuthorResponse {
  @scala.inline
  def apply(
    email: String,
    id: Double,
    import_url: String,
    name: String,
    remote_id: String,
    remote_name: String,
    url: String
  ): MigrationsMapCommitAuthorResponse = {
    val __obj = js.Dynamic.literal(email = email, id = id, import_url = import_url, name = name, remote_id = remote_id, remote_name = remote_name, url = url)
  
    __obj.asInstanceOf[MigrationsMapCommitAuthorResponse]
  }
}

