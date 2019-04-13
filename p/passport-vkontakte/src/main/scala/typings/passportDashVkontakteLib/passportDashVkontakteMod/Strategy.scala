package typings
package passportDashVkontakteLib.passportDashVkontakteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-vkontakte", "Strategy")
@js.native
class Strategy protected ()
  extends passportLib.passportMod.Strategy {
  def this(options: StrategyOptions, verify: VerifyFunction) = this()
  def this(options: StrategyOptions, verify: VerifyFunctionWithParams) = this()
  @JSName("name")
  var name_Strategy: java.lang.String = js.native
  def authenticate(req: expressLib.expressMod.Request): scala.Unit = js.native
  def authenticate(req: expressLib.expressMod.Request, options: js.Object): scala.Unit = js.native
}

