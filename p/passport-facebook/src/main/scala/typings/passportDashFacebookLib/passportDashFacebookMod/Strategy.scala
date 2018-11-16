package typings
package passportDashFacebookLib.passportDashFacebookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-facebook", "Strategy")
@js.native
class Strategy protected ()
  extends passportLib.passportMod.passportNs.Strategy {
  def this(options: StrategyOptionWithRequest, verify: VerifyFunctionWithRequest) = this()
  def this(options: StrategyOption, verify: VerifyFunction) = this()
  @JSName("name")
  var name_Strategy: java.lang.String = js.native
  def authenticate(req: expressLib.expressMod.eNs.Request): scala.Unit = js.native
  def authenticate(req: expressLib.expressMod.eNs.Request, options: js.Object): scala.Unit = js.native
}

