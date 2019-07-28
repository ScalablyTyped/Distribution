package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetArchiveLinkParams extends js.Object {
  var archive_format: String
  var owner: String
  var ref: String
  var repo: String
}

object ReposGetArchiveLinkParams {
  @scala.inline
  def apply(archive_format: String, owner: String, ref: String, repo: String): ReposGetArchiveLinkParams = {
    val __obj = js.Dynamic.literal(archive_format = archive_format, owner = owner, ref = ref, repo = repo)
  
    __obj.asInstanceOf[ReposGetArchiveLinkParams]
  }
}

