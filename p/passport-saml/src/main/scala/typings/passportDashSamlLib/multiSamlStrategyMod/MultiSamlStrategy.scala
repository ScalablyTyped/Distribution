package typings
package passportDashSamlLib.multiSamlStrategyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-saml/multiSamlStrategy", "MultiSamlStrategy")
@js.native
class MultiSamlStrategy protected ()
  extends passportDashSamlLib.passportDashSamlMod.Strategy {
  def this(config: MultiSamlConfig, verify: passportDashSamlLib.passportDashSamlMod.VerifyWithRequest) = this()
  def this(config: MultiSamlConfig, verify: passportDashSamlLib.passportDashSamlMod.VerifyWithoutRequest) = this()
}

