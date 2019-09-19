package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposMergeResponseCommitCommitter extends js.Object {
  var date: String
  var email: String
  var name: String
}

object ReposMergeResponseCommitCommitter {
  @scala.inline
  def apply(date: String, email: String, name: String): ReposMergeResponseCommitCommitter = {
    val __obj = js.Dynamic.literal(date = date, email = email, name = name)
  
    __obj.asInstanceOf[ReposMergeResponseCommitCommitter]
  }
}

