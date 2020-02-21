package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNumberOwner extends js.Object {
  var number: AnonAlias
  var owner: AnonRequired
  var pull_number: AnonRequired
  var repo: AnonRequired
  var reviewers: AnonType
  var team_reviewers: AnonType
}

object AnonNumberOwner {
  @scala.inline
  def apply(
    number: AnonAlias,
    owner: AnonRequired,
    pull_number: AnonRequired,
    repo: AnonRequired,
    reviewers: AnonType,
    team_reviewers: AnonType
  ): AnonNumberOwner = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], reviewers = reviewers.asInstanceOf[js.Any], team_reviewers = team_reviewers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNumberOwner]
  }
}

