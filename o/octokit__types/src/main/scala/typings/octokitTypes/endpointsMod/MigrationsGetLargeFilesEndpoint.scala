package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsGetLargeFilesEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object MigrationsGetLargeFilesEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): MigrationsGetLargeFilesEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsGetLargeFilesEndpoint]
  }
}

