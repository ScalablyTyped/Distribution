package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyDraftName extends js.Object {
  var body: AnonType
  var draft: AnonType
  var name: AnonType
  var owner: AnonRequired
  var prerelease: AnonType
  var release_id: AnonRequired
  var repo: AnonRequired
  var tag_name: AnonType
  var target_commitish: AnonType
}

object AnonBodyDraftName {
  @scala.inline
  def apply(
    body: AnonType,
    draft: AnonType,
    name: AnonType,
    owner: AnonRequired,
    prerelease: AnonType,
    release_id: AnonRequired,
    repo: AnonRequired,
    tag_name: AnonType,
    target_commitish: AnonType
  ): AnonBodyDraftName = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], prerelease = prerelease.asInstanceOf[js.Any], release_id = release_id.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], tag_name = tag_name.asInstanceOf[js.Any], target_commitish = target_commitish.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBodyDraftName]
  }
}

