package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxCount extends js.Object {
  var fetchSize: Double = js.native
  var maxCount: Double = js.native
}

object MaxCount {
  @scala.inline
  def apply(fetchSize: Double, maxCount: Double): MaxCount = {
    val __obj = js.Dynamic.literal(fetchSize = fetchSize.asInstanceOf[js.Any], maxCount = maxCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxCount]
  }
  @scala.inline
  implicit class MaxCountOps[Self <: MaxCount] (val x: Self) extends AnyVal {
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
    def setFetchSize(value: Double): Self = this.set("fetchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxCount(value: Double): Self = this.set("maxCount", value.asInstanceOf[js.Any])
  }
  
}

