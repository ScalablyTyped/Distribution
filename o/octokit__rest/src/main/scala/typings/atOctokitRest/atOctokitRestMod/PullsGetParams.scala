package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsGetParams extends js.Object {
  var owner: String
  var pull_number: Double
  var repo: String
}

object PullsGetParams {
  @scala.inline
  def apply(owner: String, pull_number: Double, repo: String): PullsGetParams = {
    val __obj = js.Dynamic.literal(owner = owner, pull_number = pull_number, repo = repo)
  
    __obj.asInstanceOf[PullsGetParams]
  }
}

