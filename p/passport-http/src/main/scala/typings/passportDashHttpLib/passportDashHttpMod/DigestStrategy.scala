package typings
package passportDashHttpLib.passportDashHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-http", "DigestStrategy")
@js.native
class DigestStrategy protected ()
  extends passportLib.passportMod.passportNs.Strategy {
  def this(secret: DigestSecretFunction) = this()
  def this(options: DigestStrategyOptions, secret: DigestSecretFunction) = this()
  def this(secret: DigestSecretFunction, validate: DigestValidateFunction) = this()
  def this(options: DigestStrategyOptions, secret: DigestSecretFunction, validate: DigestValidateFunction) = this()
  @JSName("name")
  var name_DigestStrategy: java.lang.String = js.native
  def authenticate(req: expressLib.expressMod.eNs.Request): scala.Unit = js.native
  def authenticate(req: expressLib.expressMod.eNs.Request, options: js.Object): scala.Unit = js.native
}

