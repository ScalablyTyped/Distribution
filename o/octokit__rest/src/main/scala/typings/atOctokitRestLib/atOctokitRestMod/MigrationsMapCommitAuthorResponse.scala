package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsMapCommitAuthorResponse extends js.Object {
  var email: java.lang.String
  var id: scala.Double
  var import_url: java.lang.String
  var name: java.lang.String
  var remote_id: java.lang.String
  var remote_name: java.lang.String
  var url: java.lang.String
}

object MigrationsMapCommitAuthorResponse {
  @scala.inline
  def apply(
    email: java.lang.String,
    id: scala.Double,
    import_url: java.lang.String,
    name: java.lang.String,
    remote_id: java.lang.String,
    remote_name: java.lang.String,
    url: java.lang.String
  ): MigrationsMapCommitAuthorResponse = {
    val __obj = js.Dynamic.literal(email = email, id = id, import_url = import_url, name = name, remote_id = remote_id, remote_name = remote_name, url = url)
  
    __obj.asInstanceOf[MigrationsMapCommitAuthorResponse]
  }
}

