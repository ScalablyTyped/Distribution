package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCheckIfMergedParamsDeprecatedNumber extends js.Object {
  /**
    * @deprecated "number" parameter renamed to "pull_number"
    */
  var number: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object PullsCheckIfMergedParamsDeprecatedNumber {
  @scala.inline
  def apply(number: scala.Double, owner: java.lang.String, repo: java.lang.String): PullsCheckIfMergedParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(number = number, owner = owner, repo = repo)
  
    __obj.asInstanceOf[PullsCheckIfMergedParamsDeprecatedNumber]
  }
}

