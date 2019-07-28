package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsGetRepoInstallationParams extends js.Object {
  var owner: String
  var repo: String
}

object AppsGetRepoInstallationParams {
  @scala.inline
  def apply(owner: String, repo: String): AppsGetRepoInstallationParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[AppsGetRepoInstallationParams]
  }
}

