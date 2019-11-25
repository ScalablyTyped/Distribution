package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateFileParamsCommitter extends js.Object {
  var email: String
  var name: String
}

object ReposCreateFileParamsCommitter {
  @scala.inline
  def apply(email: String, name: String): ReposCreateFileParamsCommitter = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposCreateFileParamsCommitter]
  }
}

