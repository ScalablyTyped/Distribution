package typings.octokitTypes

import typings.octokitTypes.authInterfaceMod.AuthInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@octokit/types/dist-types/StrategyInterface", JSImport.Namespace)
@js.native
object strategyInterfaceMod extends js.Object {
  type StrategyInterface[StrategyOptions /* <: js.Array[_] */, AuthOptions /* <: js.Array[_] */, Authentication /* <: js.Object */] = js.Function1[/* args */ StrategyOptions, AuthInterface[AuthOptions, Authentication]]
}

