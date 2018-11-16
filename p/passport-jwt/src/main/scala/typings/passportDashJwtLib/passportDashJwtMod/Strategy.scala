package typings
package passportDashJwtLib.passportDashJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-jwt", "Strategy")
@js.native
class Strategy protected ()
  extends passportDashStrategyLib.passportDashStrategyMod.Strategy {
  def this(opt: StrategyOptions, verify: VerifyCallback) = this()
  def this(opt: StrategyOptions, verify: VerifyCallbackWithRequest) = this()
}

