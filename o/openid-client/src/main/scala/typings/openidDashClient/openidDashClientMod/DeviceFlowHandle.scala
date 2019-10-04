package typings.openidDashClient.openidDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openid-client", "DeviceFlowHandle")
@js.native
class DeviceFlowHandle[TClient /* <: Client */] () extends js.Object {
  var client: TClient = js.native
  var device_code: String = js.native
  var expires_at: Double = js.native
  var expires_in: Double = js.native
  var user_code: String = js.native
  var verification_uri: String = js.native
  var verification_uri_complete: String = js.native
  def expired(): Boolean = js.native
  // tslint:disable-line:no-unnecessary-generics
  def poll(): js.Promise[TokenSet] = js.native
}

