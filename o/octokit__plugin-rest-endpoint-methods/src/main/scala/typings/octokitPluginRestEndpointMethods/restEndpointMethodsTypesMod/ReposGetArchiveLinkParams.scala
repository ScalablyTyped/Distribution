package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

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
    val __obj = js.Dynamic.literal(archive_format = archive_format.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetArchiveLinkParams]
  }
}

