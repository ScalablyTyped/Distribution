package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeOverflowRangeUnderflow extends js.Object {
  var rangeOverflow: js.UndefOr[String] = js.native
  var rangeUnderflow: js.UndefOr[String] = js.native
}

object RangeOverflowRangeUnderflow {
  @scala.inline
  def apply(): RangeOverflowRangeUnderflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeOverflowRangeUnderflow]
  }
  @scala.inline
  implicit class RangeOverflowRangeUnderflowOps[Self <: RangeOverflowRangeUnderflow] (val x: Self) extends AnyVal {
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
    def setRangeOverflow(value: String): Self = this.set("rangeOverflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeOverflow: Self = this.set("rangeOverflow", js.undefined)
    @scala.inline
    def setRangeUnderflow(value: String): Self = this.set("rangeUnderflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeUnderflow: Self = this.set("rangeUnderflow", js.undefined)
  }
  
}

