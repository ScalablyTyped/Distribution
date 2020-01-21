package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetLatestPagesBuildParams extends js.Object {
  var owner: String
  var repo: String
}

object ReposGetLatestPagesBuildParams {
  @scala.inline
  def apply(owner: String, repo: String): ReposGetLatestPagesBuildParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetLatestPagesBuildParams]
  }
}

