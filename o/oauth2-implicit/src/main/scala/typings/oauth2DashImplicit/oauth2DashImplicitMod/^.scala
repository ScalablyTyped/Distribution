package typings.oauth2DashImplicit.oauth2DashImplicitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oauth2-implicit", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def finish(): js.UndefOr[AuthResult | Null] = js.native
  def parseCredentials(hashString: String): AuthParams = js.native
  def run(options: js.Any): js.Any = js.native
  def start(options: AuthParams): Unit = js.native
}

