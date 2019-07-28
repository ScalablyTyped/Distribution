package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateOrUpdateFileParamsAuthor extends js.Object {
  var email: String
  var name: String
}

object ReposCreateOrUpdateFileParamsAuthor {
  @scala.inline
  def apply(email: String, name: String): ReposCreateOrUpdateFileParamsAuthor = {
    val __obj = js.Dynamic.literal(email = email, name = name)
  
    __obj.asInstanceOf[ReposCreateOrUpdateFileParamsAuthor]
  }
}

