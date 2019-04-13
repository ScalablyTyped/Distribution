package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsGetResponsePlan extends js.Object {
  var name: java.lang.String
  var private_repos: scala.Double
  var space: scala.Double
}

object OrgsGetResponsePlan {
  @scala.inline
  def apply(name: java.lang.String, private_repos: scala.Double, space: scala.Double): OrgsGetResponsePlan = {
    val __obj = js.Dynamic.literal(name = name, private_repos = private_repos, space = space)
  
    __obj.asInstanceOf[OrgsGetResponsePlan]
  }
}

