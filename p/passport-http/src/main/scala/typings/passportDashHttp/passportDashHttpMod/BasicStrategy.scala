package typings.passportDashHttp.passportDashHttpMod

import typings.express.expressMod.Request
import typings.passport.passportMod.Strategy
import typings.passportDashHttp.passportDashHttpNumbers.`false`
import typings.passportDashHttp.passportDashHttpNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-http", "BasicStrategy")
@js.native
class BasicStrategy protected () extends Strategy {
  def this(verify: BasicVerifyFunction) = this()
  def this(options: BasicStrategyOptions[`false`], verify: BasicVerifyFunction) = this()
  def this(options: BasicStrategyOptions[`true`], verify: BasicVerifyFunctionWithRequest) = this()
  @JSName("name")
  var name_BasicStrategy: String = js.native
  def authenticate(req: Request): Unit = js.native
  def authenticate(req: Request, options: js.Object): Unit = js.native
}

