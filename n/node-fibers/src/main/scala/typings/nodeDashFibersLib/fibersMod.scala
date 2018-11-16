package typings
package nodeDashFibersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fibers", JSImport.Namespace)
@js.native
object fibersMod extends js.Object {
  var current: nodeDashFibersLib.Fiber = js.native
  def apply(fn: js.Function): nodeDashFibersLib.Fiber = js.native
  def `yield`(): js.Any = js.native
  def `yield`(value: js.Any): js.Any = js.native
}

