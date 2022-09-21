package typings.oidcProvider.mod

import org.scalablytyped.runtime.StringDictionary
import typings.oidcProvider.anon.AcceptDPoP
import typings.oidcProvider.anon.Get
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OIDCContext extends StObject {
  
  val accessToken: js.UndefOr[AccessToken] = js.native
  
  val account: js.UndefOr[Account] = js.native
  
  val acr: String = js.native
  
  val amr: js.Array[String] = js.native
  
  val body: js.UndefOr[UnknownObject] = js.native
  
  val claims: ClaimsParameter = js.native
  
  val client: js.UndefOr[Client] = js.native
  
  def clientJwtAuthExpectedAudience(): Set[String] = js.native
  
  val cookies: Get = js.native
  
  val deviceCode: js.UndefOr[DeviceCode] = js.native
  
  val entities: typings.oidcProvider.anon.AccessToken = js.native
  
  def entity(key: String, value: Any): Unit = js.native
  
  def getAccessToken(): String = js.native
  def getAccessToken(opts: AcceptDPoP): String = js.native
  
  val issuer: String = js.native
  
  val params: js.UndefOr[UnknownObject] = js.native
  
  def promptPending(name: String): Boolean = js.native
  
  val prompts: Set[String] = js.native
  
  val provider: Provider = js.native
  
  val redirectUriCheckPerformed: js.UndefOr[Boolean] = js.native
  
  val registrationAccessToken: js.UndefOr[RegistrationAccessToken] = js.native
  
  val requestParamClaims: Set[String] = js.native
  
  val requestParamScopes: Set[String] = js.native
  
  val resourceServers: js.UndefOr[StringDictionary[ResourceServer]] = js.native
  
  val result: js.UndefOr[InteractionResults] = js.native
  
  val route: String = js.native
  
  val session: js.UndefOr[Session] = js.native
  
  val trusted: js.UndefOr[js.Array[String]] = js.native
  
  val webMessageUriCheckPerformed: js.UndefOr[Boolean] = js.native
}
