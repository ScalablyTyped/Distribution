package typings.oidcProvider.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessToken
  extends StObject
     with BaseToken {
  
  var accountId: String = js.native
  
  var aud: String | js.Array[String] = js.native
  
  var claims: js.UndefOr[ClaimsParameter] = js.native
  
  var expiresWithSession: js.UndefOr[Boolean] = js.native
  
  var extra: js.UndefOr[UnknownObject] = js.native
  
  var grantId: String = js.native
  
  var gty: String = js.native
  
  def isSenderConstrained(): Boolean = js.native
  
  var jkt: js.UndefOr[String] = js.native
  
  @JSName("kind")
  val kind_AccessToken: typings.oidcProvider.oidcProviderStrings.AccessToken = js.native
  
  var resourceServer: js.UndefOr[ResourceServer] = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var sessionUid: js.UndefOr[String] = js.native
  
  var sid: js.UndefOr[String] = js.native
  
  val tokenType: String = js.native
  
  @JSName("x5t#S256")
  var x5tNumbersignS256: js.UndefOr[String] = js.native
}
