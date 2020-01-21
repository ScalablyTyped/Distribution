package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposEnableAutomatedSecurityFixesParams extends js.Object {
  var owner: String
  var repo: String
}

object ReposEnableAutomatedSecurityFixesParams {
  @scala.inline
  def apply(owner: String, repo: String): ReposEnableAutomatedSecurityFixesParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposEnableAutomatedSecurityFixesParams]
  }
}

