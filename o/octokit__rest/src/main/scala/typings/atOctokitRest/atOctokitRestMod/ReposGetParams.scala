package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetParams extends js.Object {
  var owner: String
  var repo: String
}

object ReposGetParams {
  @scala.inline
  def apply(owner: String, repo: String): ReposGetParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetParams]
  }
}

