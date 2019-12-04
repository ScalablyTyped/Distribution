package typings.passportDashSaml.multiSamlStrategyMod

import typings.passportDashSaml.passportDashSamlMod.VerifyWithRequest
import typings.passportDashSaml.passportDashSamlMod.VerifyWithoutRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-saml/multiSamlStrategy", JSImport.Namespace)
@js.native
class ^ protected () extends MultiSamlStrategy {
  def this(config: MultiSamlConfig, verify: VerifyWithRequest) = this()
  def this(config: MultiSamlConfig, verify: VerifyWithoutRequest) = this()
}

