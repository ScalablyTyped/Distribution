package typings.oidcProvider.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizationCode
  extends StObject
     with BaseToken {
  
  var accountId: js.UndefOr[String] = js.native
  
  var acr: js.UndefOr[String] = js.native
  
  var amr: js.UndefOr[js.Array[String]] = js.native
  
  var authTime: js.UndefOr[Double] = js.native
  
  var claims: js.UndefOr[ClaimsParameter] = js.native
  
  var codeChallenge: js.UndefOr[String] = js.native
  
  var codeChallengeMethod: js.UndefOr[String] = js.native
  
  def consume(): js.Promise[Unit] = js.native
  
  var expiresWithSession: js.UndefOr[Boolean] = js.native
  
  var grantId: js.UndefOr[String] = js.native
  
  var gty: js.UndefOr[String] = js.native
  
  var jkt: js.UndefOr[String] = js.native
  
  @JSName("kind")
  val kind_AuthorizationCode: typings.oidcProvider.oidcProviderStrings.AuthorizationCode = js.native
  
  var nonce: js.UndefOr[String] = js.native
  
  var redirectUri: js.UndefOr[String] = js.native
  
  var resource: js.UndefOr[String | js.Array[String]] = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var sessionUid: js.UndefOr[String] = js.native
  
  var sid: js.UndefOr[String] = js.native
  
  @JSName("x5t#S256")
  var x5tNumbersignS256: js.UndefOr[String] = js.native
}
