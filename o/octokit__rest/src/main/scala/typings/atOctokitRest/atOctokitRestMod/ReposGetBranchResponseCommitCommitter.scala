package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchResponseCommitCommitter extends js.Object {
  var avatar_url: String
  var gravatar_id: String
  var id: Double
  var login: String
  var url: String
}

object ReposGetBranchResponseCommitCommitter {
  @scala.inline
  def apply(avatar_url: String, gravatar_id: String, id: Double, login: String, url: String): ReposGetBranchResponseCommitCommitter = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url, gravatar_id = gravatar_id, id = id, login = login, url = url)
  
    __obj.asInstanceOf[ReposGetBranchResponseCommitCommitter]
  }
}

