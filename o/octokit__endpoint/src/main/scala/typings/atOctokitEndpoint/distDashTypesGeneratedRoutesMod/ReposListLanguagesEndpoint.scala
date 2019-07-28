package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListLanguagesEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object ReposListLanguagesEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ReposListLanguagesEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposListLanguagesEndpoint]
  }
}

