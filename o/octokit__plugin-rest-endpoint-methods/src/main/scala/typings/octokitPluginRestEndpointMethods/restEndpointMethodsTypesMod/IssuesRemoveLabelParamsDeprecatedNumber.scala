package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IssuesRemoveLabelParamsDeprecatedNumber]
  }
}

