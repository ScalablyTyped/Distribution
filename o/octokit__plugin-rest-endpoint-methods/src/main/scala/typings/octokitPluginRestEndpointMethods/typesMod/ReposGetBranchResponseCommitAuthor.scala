package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchResponseCommitAuthor extends js.Object {
  var avatar_url: String
  var gravatar_id: String
  var id: Double
  var login: String
  var url: String
}

object ReposGetBranchResponseCommitAuthor {
  @scala.inline
  def apply(avatar_url: String, gravatar_id: String, id: Double, login: String, url: String): ReposGetBranchResponseCommitAuthor = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], gravatar_id = gravatar_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], login = login.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetBranchResponseCommitAuthor]
  }
}

