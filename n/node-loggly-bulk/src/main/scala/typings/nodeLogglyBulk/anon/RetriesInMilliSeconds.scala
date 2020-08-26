package typings.nodeLogglyBulk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetriesInMilliSeconds extends js.Object {
  var retriesInMilliSeconds: Double = js.native
  var size: Double = js.native
}

object RetriesInMilliSeconds {
  @scala.inline
  def apply(retriesInMilliSeconds: Double, size: Double): RetriesInMilliSeconds = {
    val __obj = js.Dynamic.literal(retriesInMilliSeconds = retriesInMilliSeconds.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetriesInMilliSeconds]
  }
  @scala.inline
  implicit class RetriesInMilliSecondsOps[Self <: RetriesInMilliSeconds] (val x: Self) extends AnyVal {
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
    def setRetriesInMilliSeconds(value: Double): Self = this.set("retriesInMilliSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

