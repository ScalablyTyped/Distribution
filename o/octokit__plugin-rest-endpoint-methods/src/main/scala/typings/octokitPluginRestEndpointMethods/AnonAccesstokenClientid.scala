package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccesstokenClientid extends js.Object {
  var access_token: AnonType
  var client_id: AnonRequired
}

object AnonAccesstokenClientid {
  @scala.inline
  def apply(access_token: AnonType, client_id: AnonRequired): AnonAccesstokenClientid = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAccesstokenClientid]
  }
}

