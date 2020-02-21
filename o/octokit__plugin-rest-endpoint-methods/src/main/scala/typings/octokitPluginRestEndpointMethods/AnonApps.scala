package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApps extends js.Object {
  var apps: AnonMapTo
  var branch: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonApps {
  @scala.inline
  def apply(apps: AnonMapTo, branch: AnonRequired, owner: AnonRequired, repo: AnonRequired): AnonApps = {
    val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonApps]
  }
}

