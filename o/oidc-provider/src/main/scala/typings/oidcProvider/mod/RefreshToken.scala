package typings.oidcProvider.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefreshToken
  extends StObject
     with BaseToken {
  
  var accountId: String = js.native
  
  var acr: js.UndefOr[String] = js.native
  
  var amr: js.UndefOr[js.Array[String]] = js.native
  
  var authTime: js.UndefOr[Double] = js.native
  
  var claims: js.UndefOr[ClaimsParameter] = js.native
  
  def consume(): js.Promise[Unit] = js.native
  
  var consumed: Any = js.native
  
  var expiresWithSession: js.UndefOr[Boolean] = js.native
  
  var grantId: js.UndefOr[String] = js.native
  
  var gty: js.UndefOr[String] = js.native
  
  var iiat: js.UndefOr[Double] = js.native
  
  def isSenderConstrained(): Boolean = js.native
  
  var jkt: js.UndefOr[String] = js.native
  
  @JSName("kind")
  val kind_RefreshToken: typings.oidcProvider.oidcProviderStrings.RefreshToken = js.native
  
  var nonce: js.UndefOr[String] = js.native
  
  var resource: js.UndefOr[String | js.Array[String]] = js.native
  
  var rotations: js.UndefOr[Double] = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var sessionUid: js.UndefOr[String] = js.native
  
  var sid: js.UndefOr[String] = js.native
  
  def totalLifetime(): Double = js.native
  
  @JSName("x5t#S256")
  var x5tNumbersignS256: js.UndefOr[String] = js.native
}
