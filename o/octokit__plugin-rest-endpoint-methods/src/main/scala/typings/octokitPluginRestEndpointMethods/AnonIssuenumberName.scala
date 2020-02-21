package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIssuenumberName extends js.Object {
  var issue_number: AnonRequired
  var name: AnonRequired
  var number: AnonAlias
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonIssuenumberName {
  @scala.inline
  def apply(
    issue_number: AnonRequired,
    name: AnonRequired,
    number: AnonAlias,
    owner: AnonRequired,
    repo: AnonRequired
  ): AnonIssuenumberName = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIssuenumberName]
  }
}

