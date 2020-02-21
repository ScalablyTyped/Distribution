package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsUpdateResponsePlan extends js.Object {
  var name: String
  var private_repos: Double
  var space: Double
}

object OrgsUpdateResponsePlan {
  @scala.inline
  def apply(name: String, private_repos: Double, space: Double): OrgsUpdateResponsePlan = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], private_repos = private_repos.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OrgsUpdateResponsePlan]
  }
}

