package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchResponseCommitAuthor extends js.Object {
  var avatar_url: java.lang.String
  var gravatar_id: java.lang.String
  var id: scala.Double
  var login: java.lang.String
  var url: java.lang.String
}

object ReposGetBranchResponseCommitAuthor {
  @scala.inline
  def apply(
    avatar_url: java.lang.String,
    gravatar_id: java.lang.String,
    id: scala.Double,
    login: java.lang.String,
    url: java.lang.String
  ): ReposGetBranchResponseCommitAuthor = {
    val __obj = js.Dynamic.literal(avatar_url = avatar_url, gravatar_id = gravatar_id, id = id, login = login, url = url)
  
    __obj.asInstanceOf[ReposGetBranchResponseCommitAuthor]
  }
}

