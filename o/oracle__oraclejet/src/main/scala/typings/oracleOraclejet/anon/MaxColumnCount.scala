package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxColumnCount extends js.Object {
  var maxColumnCount: Double = js.native
  var maxRowCount: Double = js.native
}

object MaxColumnCount {
  @scala.inline
  def apply(maxColumnCount: Double, maxRowCount: Double): MaxColumnCount = {
    val __obj = js.Dynamic.literal(maxColumnCount = maxColumnCount.asInstanceOf[js.Any], maxRowCount = maxRowCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxColumnCount]
  }
  @scala.inline
  implicit class MaxColumnCountOps[Self <: MaxColumnCount] (val x: Self) extends AnyVal {
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
    def setMaxColumnCount(value: Double): Self = this.set("maxColumnCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxRowCount(value: Double): Self = this.set("maxRowCount", value.asInstanceOf[js.Any])
  }
  
}

