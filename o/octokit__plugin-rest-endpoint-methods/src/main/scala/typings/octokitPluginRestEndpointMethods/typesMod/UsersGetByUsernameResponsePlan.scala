package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersGetByUsernameResponsePlan extends js.Object {
  var collaborators: Double
  var name: String
  var private_repos: Double
  var space: Double
}

object UsersGetByUsernameResponsePlan {
  @scala.inline
  def apply(collaborators: Double, name: String, private_repos: Double, space: Double): UsersGetByUsernameResponsePlan = {
    val __obj = js.Dynamic.literal(collaborators = collaborators.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], private_repos = private_repos.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UsersGetByUsernameResponsePlan]
  }
}

