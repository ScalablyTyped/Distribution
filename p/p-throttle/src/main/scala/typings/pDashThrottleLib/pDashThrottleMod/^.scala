package typings
package pDashThrottleLib.pDashThrottleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-throttle", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def default[Arguments /* <: js.Array[_] */, Return](
    fn: js.Function1[/* arguments */ Arguments, js.Thenable[Return] | Return],
    limit: scala.Double,
    interval: scala.Double
  ): pDashThrottleLib.pDashThrottleMod.ThrottledFunction[Arguments, Return] = js.native
}

