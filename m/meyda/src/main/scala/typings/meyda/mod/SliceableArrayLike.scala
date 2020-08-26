package typings.meyda.mod

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliceableArrayLike[T] extends ArrayLike[T] {
  def slice(start: Double, end: Double): SliceableArrayLike[T] = js.native
}

object SliceableArrayLike {
  @scala.inline
  def apply[T](length: Double, slice: (Double, Double) => SliceableArrayLike[T]): SliceableArrayLike[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], slice = js.Any.fromFunction2(slice))
    __obj.asInstanceOf[SliceableArrayLike[T]]
  }
  @scala.inline
  implicit class SliceableArrayLikeOps[Self <: SliceableArrayLike[_], T] (val x: Self with SliceableArrayLike[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSlice(value: (Double, Double) => SliceableArrayLike[T]): Self = this.set("slice", js.Any.fromFunction2(value))
  }
  
}

