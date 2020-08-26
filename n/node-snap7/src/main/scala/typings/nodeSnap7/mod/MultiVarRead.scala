package typings.nodeSnap7.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiVarRead extends js.Object {
  var Amount: Double = js.native
  var Area: typings.nodeSnap7.mod.Area = js.native
  var DBNumber: js.UndefOr[Double] = js.native
  var Start: Double = js.native
  var WordLen: typings.nodeSnap7.mod.WordLen = js.native
}

object MultiVarRead {
  @scala.inline
  def apply(Amount: Double, Area: Area, Start: Double, WordLen: WordLen): MultiVarRead = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Area = Area.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], WordLen = WordLen.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiVarRead]
  }
  @scala.inline
  implicit class MultiVarReadOps[Self <: MultiVarRead] (val x: Self) extends AnyVal {
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
    def setAmount(value: Double): Self = this.set("Amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setArea(value: Area): Self = this.set("Area", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("Start", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordLen(value: WordLen): Self = this.set("WordLen", value.asInstanceOf[js.Any])
    @scala.inline
    def setDBNumber(value: Double): Self = this.set("DBNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBNumber: Self = this.set("DBNumber", js.undefined)
  }
  
}

