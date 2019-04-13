package typings
package passportDashBnetLib.passportDashBnetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-bnet", JSImport.Namespace)
@js.native
class ^ protected () extends BnetStrategy {
  def this(options: StrategyOptionsWithRequest, verify: passportDashOauth2Lib.passportDashOauth2Mod.VerifyFunctionWithRequest) = this()
  def this(options: StrategyOptions, verify: passportDashOauth2Lib.passportDashOauth2Mod.VerifyFunction) = this()
}

@JSImport("passport-bnet", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Strategy: org.scalablytyped.runtime.Instantiable2[
    /* options */ StrategyOptions, 
    /* verify */ passportDashOauth2Lib.passportDashOauth2Mod.VerifyFunction, 
    BnetStrategy
  ] = js.native
  def getHost(region: java.lang.String): java.lang.String = js.native
}

