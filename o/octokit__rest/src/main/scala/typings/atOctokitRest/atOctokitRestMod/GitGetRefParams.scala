package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetRefParams extends js.Object {
  var owner: String
  /**
    * Must be formatted as `heads/branch`, not just `branch`
    */
  var ref: String
  var repo: String
}

object GitGetRefParams {
  @scala.inline
  def apply(owner: String, ref: String, repo: String): GitGetRefParams = {
    val __obj = js.Dynamic.literal(owner = owner, ref = ref, repo = repo)
  
    __obj.asInstanceOf[GitGetRefParams]
  }
}

