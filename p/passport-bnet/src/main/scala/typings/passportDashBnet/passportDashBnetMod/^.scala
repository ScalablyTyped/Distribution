package typings.passportDashBnet.passportDashBnetMod

import org.scalablytyped.runtime.Instantiable2
import typings.passportDashOauth2.passportDashOauth2Mod.VerifyFunction
import typings.passportDashOauth2.passportDashOauth2Mod.VerifyFunctionWithRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-bnet", JSImport.Namespace)
@js.native
class ^ protected () extends BnetStrategy {
  def this(options: StrategyOptionsWithRequest, verify: VerifyFunctionWithRequest) = this()
  def this(options: StrategyOptions, verify: VerifyFunction) = this()
}

@JSImport("passport-bnet", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Strategy: Instantiable2[/* options */ StrategyOptions, /* verify */ VerifyFunction, BnetStrategy] = js.native
  def getHost(region: String): String = js.native
}

