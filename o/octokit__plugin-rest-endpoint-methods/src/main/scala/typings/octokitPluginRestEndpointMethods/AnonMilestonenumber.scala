package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMilestonenumber extends js.Object {
  var milestone_number: AnonRequired
  var number: AnonAlias
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonMilestonenumber {
  @scala.inline
  def apply(milestone_number: AnonRequired, number: AnonAlias, owner: AnonRequired, repo: AnonRequired): AnonMilestonenumber = {
    val __obj = js.Dynamic.literal(milestone_number = milestone_number.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMilestonenumber]
  }
}

