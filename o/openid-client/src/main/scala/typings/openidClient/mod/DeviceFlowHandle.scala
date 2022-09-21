package typings.openidClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openid-client", "DeviceFlowHandle")
@js.native
open class DeviceFlowHandle[TClient /* <: BaseClient */] () extends StObject {
  
  def abort(): Unit = js.native
  
  var client: TClient = js.native
  
  var device_code: String = js.native
  
  def expired(): Boolean = js.native
  
  var expires_at: Double = js.native
  
  var expires_in: Double = js.native
  
  def poll(): js.Promise[TokenSet] = js.native
  def poll(options: DeviceFlowPollOptions): js.Promise[TokenSet] = js.native
  
  var user_code: String = js.native
  
  var verification_uri: String = js.native
  
  var verification_uri_complete: String = js.native
}
