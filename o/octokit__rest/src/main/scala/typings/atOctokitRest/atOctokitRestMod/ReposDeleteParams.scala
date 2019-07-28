package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteParams extends js.Object {
  var owner: String
  var repo: String
}

object ReposDeleteParams {
  @scala.inline
  def apply(owner: String, repo: String): ReposDeleteParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposDeleteParams]
  }
}

