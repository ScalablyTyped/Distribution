package typings.oidcProvider.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceCode
  extends StObject
     with BaseToken {
  
  var accountId: js.UndefOr[String] = js.native
  
  var acr: js.UndefOr[String] = js.native
  
  var amr: js.UndefOr[js.Array[String]] = js.native
  
  var authTime: js.UndefOr[Double] = js.native
  
  var claims: js.UndefOr[ClaimsParameter] = js.native
  
  def consume(): js.Promise[Unit] = js.native
  
  var consumed: Any = js.native
  
  var deviceInfo: js.UndefOr[UnknownObject] = js.native
  
  var error: js.UndefOr[String] = js.native
  
  var errorDescription: js.UndefOr[String] = js.native
  
  var expiresWithSession: js.UndefOr[Boolean] = js.native
  
  var grantId: String = js.native
  
  var inFlight: js.UndefOr[Boolean] = js.native
  
  @JSName("kind")
  val kind_DeviceCode: typings.oidcProvider.oidcProviderStrings.DeviceCode = js.native
  
  var nonce: js.UndefOr[String] = js.native
  
  var params: js.UndefOr[UnknownObject] = js.native
  
  var resource: js.UndefOr[String | js.Array[String]] = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var sessionUid: js.UndefOr[String] = js.native
  
  var sid: js.UndefOr[String] = js.native
  
  var userCode: String = js.native
}
