package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsListCommitsResponseItemCommitAuthor extends js.Object {
  var date: String
  var email: String
  var name: String
}

object PullsListCommitsResponseItemCommitAuthor {
  @scala.inline
  def apply(date: String, email: String, name: String): PullsListCommitsResponseItemCommitAuthor = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsListCommitsResponseItemCommitAuthor]
  }
}

