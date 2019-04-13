package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetArchiveLinkParams extends js.Object {
  var archive_format: java.lang.String
  var owner: java.lang.String
  var ref: java.lang.String
  var repo: java.lang.String
}

object ReposGetArchiveLinkParams {
  @scala.inline
  def apply(
    archive_format: java.lang.String,
    owner: java.lang.String,
    ref: java.lang.String,
    repo: java.lang.String
  ): ReposGetArchiveLinkParams = {
    val __obj = js.Dynamic.literal(archive_format = archive_format, owner = owner, ref = ref, repo = repo)
  
    __obj.asInstanceOf[ReposGetArchiveLinkParams]
  }
}

