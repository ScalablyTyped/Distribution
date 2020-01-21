package typings.oidcTokenManager

import org.scalablytyped.runtime.TopLevel
import typings.oidcTokenManager.Oidc.OidcClientSettings
import typings.oidcTokenManager.Oidc.OidcClientStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("OidcClient")
@js.native
class OidcClient protected ()
  extends typings.oidcTokenManager.Oidc.OidcTokenManager {
  def this(settings: OidcClientSettings) = this()
}

@JSGlobal("OidcClient")
@js.native
object OidcClient extends TopLevel[OidcClientStatic]

