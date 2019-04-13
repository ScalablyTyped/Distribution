package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetRefParams extends js.Object {
  var owner: java.lang.String
  /**
    * Must be formatted as `heads/branch`, not just `branch`
    */
  var ref: java.lang.String
  var repo: java.lang.String
}

object GitGetRefParams {
  @scala.inline
  def apply(owner: java.lang.String, ref: java.lang.String, repo: java.lang.String): GitGetRefParams = {
    val __obj = js.Dynamic.literal(owner = owner, ref = ref, repo = repo)
  
    __obj.asInstanceOf[GitGetRefParams]
  }
}

