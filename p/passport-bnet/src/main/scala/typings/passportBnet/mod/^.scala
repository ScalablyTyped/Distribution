package typings.passportBnet.mod

import typings.passportOauth2.mod.OAuth2Strategy
import typings.passportOauth2.mod.VerifyFunction
import typings.passportOauth2.mod.VerifyFunctionWithRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("passport-bnet", JSImport.Namespace)
@js.native
class ^ protected () extends OAuth2Strategy {
  def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
  def this(options: StrategyOptions, verify: VerifyFunction) = this()
}
