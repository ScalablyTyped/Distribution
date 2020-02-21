package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOwnerRefRepo extends js.Object {
  var owner: AnonRequired
  var ref: AnonRequired
  var repo: AnonRequired
}

object AnonOwnerRefRepo {
  @scala.inline
  def apply(owner: AnonRequired, ref: AnonRequired, repo: AnonRequired): AnonOwnerRefRepo = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOwnerRefRepo]
  }
}

