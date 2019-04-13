package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsUpdateResponsePlan extends js.Object {
  var name: java.lang.String
  var private_repos: scala.Double
  var space: scala.Double
}

object OrgsUpdateResponsePlan {
  @scala.inline
  def apply(name: java.lang.String, private_repos: scala.Double, space: scala.Double): OrgsUpdateResponsePlan = {
    val __obj = js.Dynamic.literal(name = name, private_repos = private_repos, space = space)
  
    __obj.asInstanceOf[OrgsUpdateResponsePlan]
  }
}

