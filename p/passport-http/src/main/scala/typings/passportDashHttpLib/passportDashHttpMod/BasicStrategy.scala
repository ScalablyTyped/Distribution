package typings
package passportDashHttpLib.passportDashHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-http", "BasicStrategy")
@js.native
class BasicStrategy protected ()
  extends passportLib.passportMod.passportNs.Strategy {
  def this(verify: BasicVerifyFunction) = this()
  def this(options: BasicStrategyOptions[passportDashHttpLib.passportDashHttpLibNumbers.`false`], verify: BasicVerifyFunction) = this()
  def this(options: BasicStrategyOptions[passportDashHttpLib.passportDashHttpLibNumbers.`true`], verify: BasicVerifyFunctionWithRequest) = this()
  @JSName("name")
  var name_BasicStrategy: java.lang.String = js.native
  def authenticate(req: expressLib.expressMod.eNs.Request): scala.Unit = js.native
  def authenticate(req: expressLib.expressMod.eNs.Request, options: js.Object): scala.Unit = js.native
}

