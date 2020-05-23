package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetArchiveLinkEndpoint extends js.Object {
  var archive_format: String
  var owner: String
  var ref: String
  var repo: String
}

object ReposGetArchiveLinkEndpoint {
  @scala.inline
  def apply(archive_format: String, owner: String, ref: String, repo: String): ReposGetArchiveLinkEndpoint = {
    val __obj = js.Dynamic.literal(archive_format = archive_format.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetArchiveLinkEndpoint]
  }
}

