package typings.oauth2DashImplicit.oauth2DashImplicitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oauth2-implicit", "run")
@js.native
object run extends js.Object {
  def apply(options: js.Any): js.Any = js.native
  def finish(): js.UndefOr[AuthResult | Null] = js.native
  def parseCredentials(hashString: String): AuthParams = js.native
  def start(options: AuthParams): Unit = js.native
}

