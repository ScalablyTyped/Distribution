package typings
package pDashLimitLib.pDashLimitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-limit", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Run multiple promise-returning & async functions with limited concurrency.
    * @param concurrency Concurrency limit. Minimum: `1`.
    * @returns A `limit` function.
    */
  def apply(concurrency: scala.Double): pDashLimitLib.pDashLimitMod.pLimitNs.Limit = js.native
}

