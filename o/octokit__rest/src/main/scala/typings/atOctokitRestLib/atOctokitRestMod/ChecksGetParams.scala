package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksGetParams extends js.Object {
  var check_run_id: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object ChecksGetParams {
  @scala.inline
  def apply(check_run_id: scala.Double, owner: java.lang.String, repo: java.lang.String): ChecksGetParams = {
    val __obj = js.Dynamic.literal(check_run_id = check_run_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ChecksGetParams]
  }
}

