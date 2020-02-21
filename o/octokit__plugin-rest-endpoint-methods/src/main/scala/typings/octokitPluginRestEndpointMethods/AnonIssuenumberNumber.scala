package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIssuenumberNumber extends js.Object {
  var issue_number: AnonRequired
  var number: AnonAlias
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonIssuenumberNumber {
  @scala.inline
  def apply(issue_number: AnonRequired, number: AnonAlias, owner: AnonRequired, repo: AnonRequired): AnonIssuenumberNumber = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIssuenumberNumber]
  }
}

