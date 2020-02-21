package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCname extends js.Object {
  var cname: AnonType
  var owner: AnonRequired
  var repo: AnonRequired
  var source: AnonEnum
}

object AnonCname {
  @scala.inline
  def apply(cname: AnonType, owner: AnonRequired, repo: AnonRequired, source: AnonEnum): AnonCname = {
    val __obj = js.Dynamic.literal(cname = cname.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCname]
  }
}

