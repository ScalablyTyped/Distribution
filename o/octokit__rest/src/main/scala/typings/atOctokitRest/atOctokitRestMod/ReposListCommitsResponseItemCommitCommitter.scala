package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListCommitsResponseItemCommitCommitter extends js.Object {
  var date: String
  var email: String
  var name: String
}

object ReposListCommitsResponseItemCommitCommitter {
  @scala.inline
  def apply(date: String, email: String, name: String): ReposListCommitsResponseItemCommitCommitter = {
    val __obj = js.Dynamic.literal(date = date, email = email, name = name)
  
    __obj.asInstanceOf[ReposListCommitsResponseItemCommitCommitter]
  }
}

