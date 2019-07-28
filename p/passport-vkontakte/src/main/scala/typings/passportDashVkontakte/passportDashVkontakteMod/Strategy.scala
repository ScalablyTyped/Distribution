package typings.passportDashVkontakte.passportDashVkontakteMod

import typings.express.expressMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-vkontakte", "Strategy")
@js.native
class Strategy protected ()
  extends typings.passport.passportMod.Strategy {
  def this(options: StrategyOptions, verify: VerifyFunction) = this()
  def this(options: StrategyOptions, verify: VerifyFunctionWithParams) = this()
  @JSName("name")
  var name_Strategy: String = js.native
  def authenticate(req: Request): Unit = js.native
  def authenticate(req: Request, options: js.Object): Unit = js.native
}

