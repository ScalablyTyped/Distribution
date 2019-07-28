package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateFileParamsAuthor extends js.Object {
  var email: String
  var name: String
}

object ReposCreateFileParamsAuthor {
  @scala.inline
  def apply(email: String, name: String): ReposCreateFileParamsAuthor = {
    val __obj = js.Dynamic.literal(email = email, name = name)
  
    __obj.asInstanceOf[ReposCreateFileParamsAuthor]
  }
}

