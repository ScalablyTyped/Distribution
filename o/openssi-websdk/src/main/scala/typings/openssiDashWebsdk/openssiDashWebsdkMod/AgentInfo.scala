package typings.openssiDashWebsdk.openssiDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentInfo extends js.Object {
  var creation_time: String
  var did: DID
  var expiration: Double
  var metrics: js.Any
  var name: AgentName
  var role: String | Null
  var url: AgentURL
  var verkey: Verkey
}

object AgentInfo {
  @scala.inline
  def apply(
    creation_time: String,
    did: DID,
    expiration: Double,
    metrics: js.Any,
    name: AgentName,
    url: AgentURL,
    verkey: Verkey,
    role: String = null
  ): AgentInfo = {
    val __obj = js.Dynamic.literal(creation_time = creation_time.asInstanceOf[js.Any], did = did.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verkey = verkey.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentInfo]
  }
}

