package typings.nodeCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrappedValue[T] extends js.Object {
  // ttl
  var t: Double = js.native
  // value
  var v: T = js.native
}

object WrappedValue {
  @scala.inline
  def apply[T](t: Double, v: T): WrappedValue[T] = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedValue[T]]
  }
  @scala.inline
  implicit class WrappedValueOps[Self <: WrappedValue[_], T] (val x: Self with WrappedValue[T]) extends AnyVal {
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
    def setT(value: Double): Self = this.set("t", value.asInstanceOf[js.Any])
    @scala.inline
    def setV(value: T): Self = this.set("v", value.asInstanceOf[js.Any])
  }
  
}

