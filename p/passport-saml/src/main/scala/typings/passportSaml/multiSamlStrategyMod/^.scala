package typings.passportSaml.multiSamlStrategyMod

import typings.passportSaml.mod.VerifyWithRequest
import typings.passportSaml.mod.VerifyWithoutRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-saml/multiSamlStrategy", JSImport.Namespace)
@js.native
class ^ protected () extends MultiSamlStrategy {
  def this(config: MultiSamlConfig, verify: VerifyWithRequest) = this()
  def this(config: MultiSamlConfig, verify: VerifyWithoutRequest) = this()
}

