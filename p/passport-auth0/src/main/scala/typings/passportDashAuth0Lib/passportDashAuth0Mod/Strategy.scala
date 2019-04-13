package typings
package passportDashAuth0Lib.passportDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-auth0", "Strategy")
@js.native
class Strategy protected ()
  extends passportLib.passportMod.Strategy {
  def this(options: StrategyOptionWithRequest, verify: VerifyFunctionWithRequest) = this()
  def this(options: StrategyOption, verify: VerifyFunction) = this()
  @JSName("name")
  var name_Strategy: java.lang.String = js.native
  def authenticate(req: expressLib.expressMod.Request): scala.Unit = js.native
  def authenticate(req: expressLib.expressMod.Request, options: js.Object): scala.Unit = js.native
}

