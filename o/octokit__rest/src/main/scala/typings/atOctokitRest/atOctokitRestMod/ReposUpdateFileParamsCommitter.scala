package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateFileParamsCommitter extends js.Object {
  var email: String
  var name: String
}

object ReposUpdateFileParamsCommitter {
  @scala.inline
  def apply(email: String, name: String): ReposUpdateFileParamsCommitter = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposUpdateFileParamsCommitter]
  }
}

