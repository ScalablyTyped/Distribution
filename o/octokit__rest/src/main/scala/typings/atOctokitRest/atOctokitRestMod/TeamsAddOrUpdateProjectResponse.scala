package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddOrUpdateProjectResponse extends js.Object {
  var documentation_url: String
  var message: String
}

object TeamsAddOrUpdateProjectResponse {
  @scala.inline
  def apply(documentation_url: String, message: String): TeamsAddOrUpdateProjectResponse = {
    val __obj = js.Dynamic.literal(documentation_url = documentation_url, message = message)
  
    __obj.asInstanceOf[TeamsAddOrUpdateProjectResponse]
  }
}

