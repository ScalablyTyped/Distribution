package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCompareCommitsResponseBaseCommitCommitCommitter extends js.Object {
  var date: String
  var email: String
  var name: String
}

object ReposCompareCommitsResponseBaseCommitCommitCommitter {
  @scala.inline
  def apply(date: String, email: String, name: String): ReposCompareCommitsResponseBaseCommitCommitCommitter = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposCompareCommitsResponseBaseCommitCommitCommitter]
  }
}

