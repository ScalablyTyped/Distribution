package typings.nodeMailjet.mod.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResponseData extends js.Object {
  val Count: Double = js.native
  val Data: js.Array[js.Object] = js.native
  val Total: Double = js.native
}

object GetResponseData {
  @scala.inline
  def apply(Count: Double, Data: js.Array[js.Object], Total: Double): GetResponseData = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], Total = Total.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponseData]
  }
  @scala.inline
  implicit class GetResponseDataOps[Self <: GetResponseData] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(value: js.Object*): Self = this.set("Data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[js.Object]): Self = this.set("Data", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("Total", value.asInstanceOf[js.Any])
  }
  
}

