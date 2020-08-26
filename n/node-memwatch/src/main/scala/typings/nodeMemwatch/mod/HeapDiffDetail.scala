package typings.nodeMemwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeapDiffDetail extends js.Object {
  @JSName("+")
  var Plussign: Double = js.native
  @JSName("-")
  var _dash: Double = js.native
  var size: String = js.native
  var size_bytes: Double = js.native
  var what: String = js.native
}

object HeapDiffDetail {
  @scala.inline
  def apply(Plussign: Double, _dash: Double, size: String, size_bytes: Double, what: String): HeapDiffDetail = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], size_bytes = size_bytes.asInstanceOf[js.Any], what = what.asInstanceOf[js.Any])
    __obj.updateDynamic("+")(Plussign.asInstanceOf[js.Any])
    __obj.updateDynamic("-")(_dash.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeapDiffDetail]
  }
  @scala.inline
  implicit class HeapDiffDetailOps[Self <: HeapDiffDetail] (val x: Self) extends AnyVal {
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
    def setPlussign(value: Double): Self = this.set("+", value.asInstanceOf[js.Any])
    @scala.inline
    def set_dash(value: Double): Self = this.set("-", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize_bytes(value: Double): Self = this.set("size_bytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhat(value: String): Self = this.set("what", value.asInstanceOf[js.Any])
  }
  
}

