package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetPagesBuildParams extends js.Object {
  var build_id: Double
  var owner: String
  var repo: String
}

object ReposGetPagesBuildParams {
  @scala.inline
  def apply(build_id: Double, owner: String, repo: String): ReposGetPagesBuildParams = {
    val __obj = js.Dynamic.literal(build_id = build_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetPagesBuildParams]
  }
}

