package typings
package passportDashAzureDashAdLib.bearerDashStrategyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-azure-ad/bearer-strategy", "BearerStrategy")
@js.native
class BearerStrategy protected ()
  extends passportLib.passportMod.passportNs.Strategy {
  def this(options: IBearerStrategyOptionWithRequest, verify: VerifyBearerFunctionWithReq) = this()
  def this(options: IBearerStrategyOption, verify: VerifyBearerFunction) = this()
  @JSName("name")
  var name_BearerStrategy: java.lang.String = js.native
  def authenticate(req: expressLib.expressMod.eNs.Request): scala.Unit = js.native
  def authenticate(req: expressLib.expressMod.eNs.Request, options: js.Object): scala.Unit = js.native
}

