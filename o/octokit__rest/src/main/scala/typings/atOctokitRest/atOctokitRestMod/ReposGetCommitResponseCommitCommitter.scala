package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitResponseCommitCommitter extends js.Object {
  var date: String
  var email: String
  var name: String
}

object ReposGetCommitResponseCommitCommitter {
  @scala.inline
  def apply(date: String, email: String, name: String): ReposGetCommitResponseCommitCommitter = {
    val __obj = js.Dynamic.literal(date = date, email = email, name = name)
  
    __obj.asInstanceOf[ReposGetCommitResponseCommitCommitter]
  }
}

