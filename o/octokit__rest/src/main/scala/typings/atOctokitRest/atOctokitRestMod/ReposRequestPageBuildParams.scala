package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposRequestPageBuildParams extends js.Object {
  var owner: String
  var repo: String
}

object ReposRequestPageBuildParams {
  @scala.inline
  def apply(owner: String, repo: String): ReposRequestPageBuildParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposRequestPageBuildParams]
  }
}

