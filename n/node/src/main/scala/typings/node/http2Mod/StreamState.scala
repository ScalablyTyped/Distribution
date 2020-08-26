package typings.node.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamState extends js.Object {
  var localClose: js.UndefOr[Double] = js.native
  var localWindowSize: js.UndefOr[Double] = js.native
  var remoteClose: js.UndefOr[Double] = js.native
  var state: js.UndefOr[Double] = js.native
  var sumDependencyWeight: js.UndefOr[Double] = js.native
  var weight: js.UndefOr[Double] = js.native
}

object StreamState {
  @scala.inline
  def apply(): StreamState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamState]
  }
  @scala.inline
  implicit class StreamStateOps[Self <: StreamState] (val x: Self) extends AnyVal {
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
    def setLocalClose(value: Double): Self = this.set("localClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalClose: Self = this.set("localClose", js.undefined)
    @scala.inline
    def setLocalWindowSize(value: Double): Self = this.set("localWindowSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalWindowSize: Self = this.set("localWindowSize", js.undefined)
    @scala.inline
    def setRemoteClose(value: Double): Self = this.set("remoteClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteClose: Self = this.set("remoteClose", js.undefined)
    @scala.inline
    def setState(value: Double): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setSumDependencyWeight(value: Double): Self = this.set("sumDependencyWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSumDependencyWeight: Self = this.set("sumDependencyWeight", js.undefined)
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

