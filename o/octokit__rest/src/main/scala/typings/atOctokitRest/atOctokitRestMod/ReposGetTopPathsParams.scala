package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetTopPathsParams extends js.Object {
  var owner: String
  var repo: String
}

object ReposGetTopPathsParams {
  @scala.inline
  def apply(owner: String, repo: String): ReposGetTopPathsParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetTopPathsParams]
  }
}

