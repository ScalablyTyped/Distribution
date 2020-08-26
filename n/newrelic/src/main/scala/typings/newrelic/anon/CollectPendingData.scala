package typings.newrelic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectPendingData extends js.Object {
  var collectPendingData: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var waitForIdle: js.UndefOr[Boolean] = js.native
}

object CollectPendingData {
  @scala.inline
  def apply(): CollectPendingData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectPendingData]
  }
  @scala.inline
  implicit class CollectPendingDataOps[Self <: CollectPendingData] (val x: Self) extends AnyVal {
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
    def setCollectPendingData(value: Boolean): Self = this.set("collectPendingData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectPendingData: Self = this.set("collectPendingData", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setWaitForIdle(value: Boolean): Self = this.set("waitForIdle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForIdle: Self = this.set("waitForIdle", js.undefined)
  }
  
}

