package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersTogglePrimaryEmailVisibilityEndpoint extends js.Object {
  var email: String
  var visibility: String
}

object UsersTogglePrimaryEmailVisibilityEndpoint {
  @scala.inline
  def apply(email: String, visibility: String): UsersTogglePrimaryEmailVisibilityEndpoint = {
    val __obj = js.Dynamic.literal(email = email, visibility = visibility)
  
    __obj.asInstanceOf[UsersTogglePrimaryEmailVisibilityEndpoint]
  }
}

