package typings.passportGoogleOauth2.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-google-oauth2", "Strategy")
@js.native
class Strategy protected () extends js.Object {
  def this(verify: VerifyFunction) = this()
  def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
  def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequestAndParams) = this()
  def this(options: StrategyOptions, verify: VerifyFunction) = this()
  var name: String = js.native
  def authenticate(req: Request_[ParamsDictionary]): Unit = js.native
  def authenticate(req: Request_[ParamsDictionary], options: js.Object): Unit = js.native
}

