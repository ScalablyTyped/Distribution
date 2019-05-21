package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListLanguagesEndpoint extends js.Object {
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposListLanguagesEndpoint {
  @scala.inline
  def apply(owner: java.lang.String, repo: java.lang.String): ReposListLanguagesEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposListLanguagesEndpoint]
  }
}

