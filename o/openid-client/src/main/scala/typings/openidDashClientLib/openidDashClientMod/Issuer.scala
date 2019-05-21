package typings
package openidDashClientLib.openidDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openid-client", "Issuer")
@js.native
class Issuer () extends js.Object {
  val Client: org.scalablytyped.runtime.Instantiable1[/* metadata */ ClientMetadata, Client] = js.native
  val metadata: IssuerMetadata = js.native
  def keystore(): js.Promise[_] = js.native
  def keystore(forceReload: scala.Boolean): js.Promise[_] = js.native
}

/* static members */
@JSImport("openid-client", "Issuer")
@js.native
object Issuer extends js.Object {
  def discover(issuer: java.lang.String): js.Promise[openidDashClientLib.openidDashClientMod.Issuer] = js.native
}

