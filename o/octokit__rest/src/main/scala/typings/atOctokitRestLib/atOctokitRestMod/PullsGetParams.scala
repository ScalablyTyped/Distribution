package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsGetParams extends js.Object {
  var owner: java.lang.String
  var pull_number: scala.Double
  var repo: java.lang.String
}

object PullsGetParams {
  @scala.inline
  def apply(owner: java.lang.String, pull_number: scala.Double, repo: java.lang.String): PullsGetParams = {
    val __obj = js.Dynamic.literal(owner = owner, pull_number = pull_number, repo = repo)
  
    __obj.asInstanceOf[PullsGetParams]
  }
}

