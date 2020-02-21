package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommitmessage extends js.Object {
  var commit_message: AnonType
  var commit_title: AnonType
  var merge_method: AnonEnum
  var number: AnonAlias
  var owner: AnonRequired
  var pull_number: AnonRequired
  var repo: AnonRequired
  var sha: AnonType
}

object AnonCommitmessage {
  @scala.inline
  def apply(
    commit_message: AnonType,
    commit_title: AnonType,
    merge_method: AnonEnum,
    number: AnonAlias,
    owner: AnonRequired,
    pull_number: AnonRequired,
    repo: AnonRequired,
    sha: AnonType
  ): AnonCommitmessage = {
    val __obj = js.Dynamic.literal(commit_message = commit_message.asInstanceOf[js.Any], commit_title = commit_title.asInstanceOf[js.Any], merge_method = merge_method.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCommitmessage]
  }
}

