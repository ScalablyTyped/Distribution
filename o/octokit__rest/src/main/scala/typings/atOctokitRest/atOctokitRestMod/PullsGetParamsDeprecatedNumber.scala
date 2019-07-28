package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsGetParamsDeprecatedNumber extends js.Object {
  /**
    * @deprecated "number" parameter renamed to "pull_number"
    */
  var number: Double
  var owner: String
  var repo: String
}

object PullsGetParamsDeprecatedNumber {
  @scala.inline
  def apply(number: Double, owner: String, repo: String): PullsGetParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(number = number, owner = owner, repo = repo)
  
    __obj.asInstanceOf[PullsGetParamsDeprecatedNumber]
  }
}

