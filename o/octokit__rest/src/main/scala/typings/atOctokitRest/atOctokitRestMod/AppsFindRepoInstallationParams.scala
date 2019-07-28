package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsFindRepoInstallationParams extends js.Object {
  var owner: String
  var repo: String
}

object AppsFindRepoInstallationParams {
  @scala.inline
  def apply(owner: String, repo: String): AppsFindRepoInstallationParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[AppsFindRepoInstallationParams]
  }
}

