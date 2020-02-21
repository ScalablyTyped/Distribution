package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExcludeattachments extends js.Object {
  var exclude_attachments: AnonType
  var lock_repositories: AnonType
  var repositories: AnonRequired
}

object AnonExcludeattachments {
  @scala.inline
  def apply(exclude_attachments: AnonType, lock_repositories: AnonType, repositories: AnonRequired): AnonExcludeattachments = {
    val __obj = js.Dynamic.literal(exclude_attachments = exclude_attachments.asInstanceOf[js.Any], lock_repositories = lock_repositories.asInstanceOf[js.Any], repositories = repositories.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExcludeattachments]
  }
}

