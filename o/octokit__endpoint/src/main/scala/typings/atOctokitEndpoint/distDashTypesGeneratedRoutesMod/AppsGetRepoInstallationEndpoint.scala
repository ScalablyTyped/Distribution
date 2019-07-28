package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsGetRepoInstallationEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object AppsGetRepoInstallationEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): AppsGetRepoInstallationEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[AppsGetRepoInstallationEndpoint]
  }
}

