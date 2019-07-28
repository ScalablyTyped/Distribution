package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetLatestReleaseParams extends js.Object {
  var owner: String
  var repo: String
}

object ReposGetLatestReleaseParams {
  @scala.inline
  def apply(owner: String, repo: String): ReposGetLatestReleaseParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetLatestReleaseParams]
  }
}

