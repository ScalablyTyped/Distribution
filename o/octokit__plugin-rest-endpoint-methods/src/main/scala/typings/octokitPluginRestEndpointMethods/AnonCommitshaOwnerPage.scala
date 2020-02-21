package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommitshaOwnerPage extends js.Object {
  var commit_sha: AnonRequired
  var owner: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var ref: AnonAlias
  var repo: AnonRequired
}

object AnonCommitshaOwnerPage {
  @scala.inline
  def apply(
    commit_sha: AnonRequired,
    owner: AnonRequired,
    page: AnonType,
    per_page: AnonType,
    ref: AnonAlias,
    repo: AnonRequired
  ): AnonCommitshaOwnerPage = {
    val __obj = js.Dynamic.literal(commit_sha = commit_sha.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCommitshaOwnerPage]
  }
}

