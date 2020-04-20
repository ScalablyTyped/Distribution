package typings.meyda.mod

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliceableArrayLike[T] extends ArrayLike[T] {
  def slice(start: Double, end: Double): SliceableArrayLike[T]
}

object SliceableArrayLike {
  @scala.inline
  def apply[T](length: Double, slice: (Double, Double) => SliceableArrayLike[T]): SliceableArrayLike[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], slice = js.Any.fromFunction2(slice))
    __obj.asInstanceOf[SliceableArrayLike[T]]
  }
}

