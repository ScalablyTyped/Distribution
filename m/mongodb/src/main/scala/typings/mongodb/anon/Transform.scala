package typings.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transform[T] extends js.Object {
  var transform: js.UndefOr[js.Function1[/* document */ T, _]] = js.native
}

object Transform {
  @scala.inline
  def apply[T](): Transform[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transform[T]]
  }
  @scala.inline
  implicit class TransformOps[Self <: Transform[_], T] (val x: Self with Transform[T]) extends AnyVal {
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
    def setTransform(value: /* document */ T => _): Self = this.set("transform", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
  
}

