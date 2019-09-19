package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// response types
trait UsersUpdateAuthenticatedResponsePlan extends js.Object {
  var collaborators: Double
  var name: String
  var private_repos: Double
  var space: Double
}

object UsersUpdateAuthenticatedResponsePlan {
  @scala.inline
  def apply(collaborators: Double, name: String, private_repos: Double, space: Double): UsersUpdateAuthenticatedResponsePlan = {
    val __obj = js.Dynamic.literal(collaborators = collaborators, name = name, private_repos = private_repos, space = space)
  
    __obj.asInstanceOf[UsersUpdateAuthenticatedResponsePlan]
  }
}

