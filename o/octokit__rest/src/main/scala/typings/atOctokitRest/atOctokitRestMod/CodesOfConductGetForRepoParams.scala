package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodesOfConductGetForRepoParams extends js.Object {
  var owner: String
  var repo: String
}

object CodesOfConductGetForRepoParams {
  @scala.inline
  def apply(owner: String, repo: String): CodesOfConductGetForRepoParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[CodesOfConductGetForRepoParams]
  }
}

