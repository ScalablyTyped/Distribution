package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersUpdateAuthenticatedResponsePlan extends js.Object {
  var collaborators: scala.Double
  var name: java.lang.String
  var private_repos: scala.Double
  var space: scala.Double
}

object UsersUpdateAuthenticatedResponsePlan {
  @scala.inline
  def apply(
    collaborators: scala.Double,
    name: java.lang.String,
    private_repos: scala.Double,
    space: scala.Double
  ): UsersUpdateAuthenticatedResponsePlan = {
    val __obj = js.Dynamic.literal(collaborators = collaborators, name = name, private_repos = private_repos, space = space)
  
    __obj.asInstanceOf[UsersUpdateAuthenticatedResponsePlan]
  }
}

