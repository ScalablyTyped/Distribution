package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommitsha extends js.Object {
  var commit_sha: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonCommitsha {
  @scala.inline
  def apply(commit_sha: AnonRequired, owner: AnonRequired, repo: AnonRequired): AnonCommitsha = {
    val __obj = js.Dynamic.literal(commit_sha = commit_sha.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCommitsha]
  }
}

