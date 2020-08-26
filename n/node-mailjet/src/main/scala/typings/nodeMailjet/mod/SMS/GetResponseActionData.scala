package typings.nodeMailjet.mod.SMS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResponseActionData extends js.Object {
  val Count: Double = js.native
}

object GetResponseActionData {
  @scala.inline
  def apply(Count: Double): GetResponseActionData = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponseActionData]
  }
  @scala.inline
  implicit class GetResponseActionDataOps[Self <: GetResponseActionData] (val x: Self) extends AnyVal {
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
  }
  
}

