package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIssuenumberLabels extends js.Object {
  var issue_number: AnonRequired
  var labels: AnonType
  var number: AnonAlias
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonIssuenumberLabels {
  @scala.inline
  def apply(
    issue_number: AnonRequired,
    labels: AnonType,
    number: AnonAlias,
    owner: AnonRequired,
    repo: AnonRequired
  ): AnonIssuenumberLabels = {
    val __obj = js.Dynamic.literal(issue_number = issue_number.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIssuenumberLabels]
  }
}

