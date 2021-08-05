package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jose.mod.JWKS.KeyStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openid-client", "Issuer")
@js.native
class Issuer[TClient /* <: Client */] protected ()
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  // tslint:disable-line:no-unnecessary-generics
  def this(metadata: IssuerMetadata) = this()
  
  /**
    * Returns the <Client> class tied to this issuer.
    */
  var Client: TypeOfGenericClient[TClient] = js.native
  
  /**
    * Returns the <FAPIClient> class tied to this issuer.
    */
  var FAPIClient: TypeOfGenericClient[TClient] = js.native
  
  /**
    * Returns the issuer's jwks_uri keys as a `jose` parsed JWKS.Keystore.
    * @param forceReload forces a reload of the issuer's jwks_uri
    */
  def keystore(): js.Promise[KeyStore] = js.native
  def keystore(forceReload: Boolean): js.Promise[KeyStore] = js.native
  
  /**
    * Returns metadata from the issuer's discovery document.
    */
  var metadata: IssuerMetadata = js.native
  
  var static: js.Any = js.native
}
/* static members */
object Issuer {
  
  @JSImport("openid-client", "Issuer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Loads OpenID Connect 1.0 and/or OAuth 2.0 Authorization Server Metadata documents.
    * When the issuer argument contains '.well-known' only that document is loaded, otherwise
    * performs both openid-configuration and oauth-authorization-server requests.
    * @param issuer Issuer Identifier or metadata URL
    */
  inline def discover(issuer: String): js.Promise[Issuer[Client]] = ^.asInstanceOf[js.Dynamic].applyDynamic("discover")(issuer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Issuer[Client]]]
  
  /**
    * Performs OpenID Provider Issuer Discovery based on End-User input.
    * @param input EMAIL, URL, Hostname and Port, acct or syntax input
    */
  inline def webfinger(input: String): js.Promise[Issuer[Client]] = ^.asInstanceOf[js.Dynamic].applyDynamic("webfinger")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Issuer[Client]]]
}
