package typings.pQueue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-queue/dist/lower-bound", JSImport.Namespace)
@js.native
object lowerBoundMod extends js.Object {
  def default[T](array: js.Array[T], value: T, comparator: js.Function2[/* a */ T, /* b */ T, Double]): Double = js.native
}

