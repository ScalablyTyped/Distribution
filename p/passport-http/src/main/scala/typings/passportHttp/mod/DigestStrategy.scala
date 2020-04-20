package typings.passportHttp.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.passport.mod.Strategy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-http", "DigestStrategy")
@js.native
class DigestStrategy protected () extends Strategy {
  def this(secret: DigestSecretFunction) = this()
  def this(options: DigestStrategyOptions, secret: DigestSecretFunction) = this()
  def this(secret: DigestSecretFunction, validate: DigestValidateFunction) = this()
  def this(options: DigestStrategyOptions, secret: DigestSecretFunction, validate: DigestValidateFunction) = this()
  @JSName("name")
  var name_DigestStrategy: String = js.native
  def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: js.Object): Unit = js.native
}

