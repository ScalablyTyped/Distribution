package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOwnerPer extends js.Object {
  var owner: AnonRequired
  var per: AnonEnum
  var repo: AnonRequired
}

object AnonOwnerPer {
  @scala.inline
  def apply(owner: AnonRequired, per: AnonEnum, repo: AnonRequired): AnonOwnerPer = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], per = per.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOwnerPer]
  }
}

