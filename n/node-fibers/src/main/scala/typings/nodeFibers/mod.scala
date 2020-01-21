package typings.nodeFibers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fibers", JSImport.Namespace)
@js.native
object mod extends js.Object {
  var current: Fiber = js.native
  def apply(fn: js.Function): Fiber = js.native
  def `yield`(): js.Any = js.native
  def `yield`(value: js.Any): js.Any = js.native
}

