package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyCommitsha extends js.Object {
  var body: AnonRequired
  var commit_sha: AnonRequired
  var line: AnonType
  var owner: AnonRequired
  var path: AnonType
  var position: AnonType
  var repo: AnonRequired
  var sha: AnonAlias
}

object AnonBodyCommitsha {
  @scala.inline
  def apply(
    body: AnonRequired,
    commit_sha: AnonRequired,
    line: AnonType,
    owner: AnonRequired,
    path: AnonType,
    position: AnonType,
    repo: AnonRequired,
    sha: AnonAlias
  ): AnonBodyCommitsha = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], commit_sha = commit_sha.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBodyCommitsha]
  }
}

