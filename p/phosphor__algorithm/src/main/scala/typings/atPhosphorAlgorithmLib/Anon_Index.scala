package typings
package atPhosphorAlgorithmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Index[T] extends js.Object {
  var index: scala.Double
  var value: js.UndefOr[T] = js.undefined
}

object Anon_Index {
  @scala.inline
  def apply[T](index: scala.Double, value: T = null): Anon_Index[T] = {
    val __obj = js.Dynamic.literal(index = index)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Index[T]]
  }
}

