package typings.passportLocal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("passport-local", "Strategy")
@js.native
class Strategy protected ()
  extends typings.passportStrategy.mod.Strategy {
  def this(verify: VerifyFunction) = this()
  def this(options: IStrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
  def this(options: IStrategyOptions, verify: VerifyFunction) = this()
}
