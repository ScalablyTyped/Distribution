package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait View[D] extends js.Object {
  var map: js.UndefOr[DocumentInfer[D]] = js.native
  var reduce: js.UndefOr[String | DocumentInfer[D]] = js.native
}

object View {
  @scala.inline
  def apply[D](): View[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[View[D]]
  }
  @scala.inline
  implicit class ViewOps[Self <: View[_], D] (val x: Self with View[D]) extends AnyVal {
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
    def setMap(value: /* doc */ D with Document => Unit): Self = this.set("map", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setReduceFunction1(value: /* doc */ D with Document => Unit): Self = this.set("reduce", js.Any.fromFunction1(value))
    @scala.inline
    def setReduce(value: String | DocumentInfer[D]): Self = this.set("reduce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReduce: Self = this.set("reduce", js.undefined)
  }
  
}

