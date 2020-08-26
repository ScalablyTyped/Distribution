package typings.nodeGeocoder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchResult extends js.Object {
  var error: js.Any = js.native
  var value: js.Array[Entry] = js.native
}

object BatchResult {
  @scala.inline
  def apply(error: js.Any, value: js.Array[Entry]): BatchResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchResult]
  }
  @scala.inline
  implicit class BatchResultOps[Self <: BatchResult] (val x: Self) extends AnyVal {
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
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueVarargs(value: Entry*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[Entry]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

