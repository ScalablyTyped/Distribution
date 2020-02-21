package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIssuenumberNumberOwnerPage extends js.Object {
  var issue_number: AnonRequired
  var number: AnonAlias
  var owner: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var repo: AnonRequired
}

object AnonIssuenumberNumberOwnerPage {
  @scala.inline
  def apply(
    issue_number: AnonRequired,
    number: AnonAlias,
    owner: AnonRequired,
    page: AnonType,
    per_page: AnonType,
    repo: AnonRequired
  ): AnonIssuenumberNumberOwnerPage = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIssuenumberNumberOwnerPage]
  }
}

