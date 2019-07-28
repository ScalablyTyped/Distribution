package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetPagesParams extends js.Object {
  var owner: String
  var repo: String
}

object ReposGetPagesParams {
  @scala.inline
  def apply(owner: String, repo: String): ReposGetPagesParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetPagesParams]
  }
}

