package typings.passportHttp.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.passport.mod.Strategy
import typings.passportHttp.passportHttpBooleans.`false`
import typings.passportHttp.passportHttpBooleans.`true`
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
  def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: js.Object): Unit = js.native
}

