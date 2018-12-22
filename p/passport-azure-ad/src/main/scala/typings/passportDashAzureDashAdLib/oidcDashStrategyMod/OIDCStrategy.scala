package typings
package passportDashAzureDashAdLib.oidcDashStrategyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-azure-ad/oidc-strategy", "OIDCStrategy")
@js.native
class OIDCStrategy protected ()
  extends passportLib.passportMod.passportNs.Strategy {
  def this(options: IOIDCStrategyOptionWithRequest, verify: VerifyOIDCFunctionWithReq) = this()
  def this(options: IOIDCStrategyOption, verify: VerifyOIDCFunction) = this()
  @JSName("name")
  var name_OIDCStrategy: java.lang.String = js.native
  def authenticate(req: expressLib.expressMod.eNs.Request): scala.Unit = js.native
  def authenticate(req: expressLib.expressMod.eNs.Request, options: js.Object): scala.Unit = js.native
}

