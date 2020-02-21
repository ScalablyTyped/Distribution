package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccesstoken extends js.Object {
  var access_token: AnonRequired
  var client_id: AnonRequired
}

object AnonAccesstoken {
  @scala.inline
  def apply(access_token: AnonRequired, client_id: AnonRequired): AnonAccesstoken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAccesstoken]
  }
}

