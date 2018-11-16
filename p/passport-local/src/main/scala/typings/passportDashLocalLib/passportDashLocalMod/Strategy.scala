package typings
package passportDashLocalLib.passportDashLocalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-local", "Strategy")
@js.native
class Strategy protected ()
  extends passportDashStrategyLib.passportDashStrategyMod.Strategy {
  def this(verify: VerifyFunction) = this()
  def this(options: IStrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
  def this(options: IStrategyOptions, verify: VerifyFunction) = this()
  @JSName("name")
  var name_Strategy: java.lang.String = js.native
}

