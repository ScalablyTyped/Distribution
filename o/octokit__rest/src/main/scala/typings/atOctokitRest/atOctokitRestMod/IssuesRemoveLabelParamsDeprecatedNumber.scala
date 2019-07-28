package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesRemoveLabelParamsDeprecatedNumber extends js.Object {
  var name: String
  /**
    * @deprecated "number" parameter renamed to "issue_number"
    */
  var number: Double
  var owner: String
  var repo: String
}

object IssuesRemoveLabelParamsDeprecatedNumber {
  @scala.inline
  def apply(name: String, number: Double, owner: String, repo: String): IssuesRemoveLabelParamsDeprecatedNumber = {
    val __obj = js.Dynamic.literal(name = name, number = number, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesRemoveLabelParamsDeprecatedNumber]
  }
}

