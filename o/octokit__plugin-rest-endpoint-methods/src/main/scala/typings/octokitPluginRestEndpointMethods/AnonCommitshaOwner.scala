package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommitshaOwner extends js.Object {
  var commit_sha: AnonAlias
  var owner: AnonRequired
  var ref: AnonRequired
  var repo: AnonRequired
  var sha: AnonAlias
}

object AnonCommitshaOwner {
  @scala.inline
  def apply(commit_sha: AnonAlias, owner: AnonRequired, ref: AnonRequired, repo: AnonRequired, sha: AnonAlias): AnonCommitshaOwner = {
    val __obj = js.Dynamic.literal(commit_sha = commit_sha.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCommitshaOwner]
  }
}

