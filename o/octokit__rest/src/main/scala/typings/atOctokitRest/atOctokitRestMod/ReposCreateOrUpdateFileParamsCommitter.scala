package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(email = email, name = name)
  
    __obj.asInstanceOf[ReposCreateOrUpdateFileParamsCommitter]
  }
}

