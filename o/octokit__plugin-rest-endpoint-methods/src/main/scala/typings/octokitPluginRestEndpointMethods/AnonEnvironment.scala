package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnvironment extends js.Object {
  var environment: AnonType
  var owner: AnonRequired
  var page: AnonType
  var per_page: AnonType
  var ref: AnonType
  var repo: AnonRequired
  var sha: AnonType
  var task: AnonType
}

object AnonEnvironment {
  @scala.inline
  def apply(
    environment: AnonType,
    owner: AnonRequired,
    page: AnonType,
    per_page: AnonType,
    ref: AnonType,
    repo: AnonRequired,
    sha: AnonType,
    task: AnonType
  ): AnonEnvironment = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEnvironment]
  }
}

