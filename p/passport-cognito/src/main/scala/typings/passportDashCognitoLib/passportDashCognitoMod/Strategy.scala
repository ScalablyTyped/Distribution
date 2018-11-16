package typings
package passportDashCognitoLib.passportDashCognitoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-cognito", "Strategy")
@js.native
class Strategy protected ()
  extends passportLib.passportMod.passportNs.Strategy {
  def this(options: CognitoStrategyOptions, verify: CognitoVerifyFunction) = this()
  @JSName("name")
  var name_Strategy: java.lang.String = js.native
  def authenticate(req: expressLib.expressMod.eNs.Request): scala.Unit = js.native
  def authenticate(req: expressLib.expressMod.eNs.Request, options: js.Object): scala.Unit = js.native
}

