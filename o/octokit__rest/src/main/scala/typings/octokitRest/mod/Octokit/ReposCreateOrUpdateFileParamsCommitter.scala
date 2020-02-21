package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateOrUpdateFileParamsCommitter extends js.Object {
  var email: String
  var name: String
}

object ReposCreateOrUpdateFileParamsCommitter {
  @scala.inline
  def apply(email: String, name: String): ReposCreateOrUpdateFileParamsCommitter = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposCreateOrUpdateFileParamsCommitter]
  }
}

