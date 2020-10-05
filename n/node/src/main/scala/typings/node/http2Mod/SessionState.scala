package typings.node.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionState extends js.Object {
  var deflateDynamicTableSize: js.UndefOr[Double] = js.native
  var effectiveLocalWindowSize: js.UndefOr[Double] = js.native
  var effectiveRecvDataLength: js.UndefOr[Double] = js.native
  var inflateDynamicTableSize: js.UndefOr[Double] = js.native
  var lastProcStreamID: js.UndefOr[Double] = js.native
  var localWindowSize: js.UndefOr[Double] = js.native
  var nextStreamID: js.UndefOr[Double] = js.native
  var outboundQueueSize: js.UndefOr[Double] = js.native
  var remoteWindowSize: js.UndefOr[Double] = js.native
}

object SessionState {
  @scala.inline
  def apply(): SessionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionState]
  }
  @scala.inline
  implicit class SessionStateOps[Self <: SessionState] (val x: Self) extends AnyVal {
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
    def setDeflateDynamicTableSize(value: Double): Self = this.set("deflateDynamicTableSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeflateDynamicTableSize: Self = this.set("deflateDynamicTableSize", js.undefined)
    @scala.inline
    def setEffectiveLocalWindowSize(value: Double): Self = this.set("effectiveLocalWindowSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffectiveLocalWindowSize: Self = this.set("effectiveLocalWindowSize", js.undefined)
    @scala.inline
    def setEffectiveRecvDataLength(value: Double): Self = this.set("effectiveRecvDataLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffectiveRecvDataLength: Self = this.set("effectiveRecvDataLength", js.undefined)
    @scala.inline
    def setInflateDynamicTableSize(value: Double): Self = this.set("inflateDynamicTableSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInflateDynamicTableSize: Self = this.set("inflateDynamicTableSize", js.undefined)
    @scala.inline
    def setLastProcStreamID(value: Double): Self = this.set("lastProcStreamID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastProcStreamID: Self = this.set("lastProcStreamID", js.undefined)
    @scala.inline
    def setLocalWindowSize(value: Double): Self = this.set("localWindowSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalWindowSize: Self = this.set("localWindowSize", js.undefined)
    @scala.inline
    def setNextStreamID(value: Double): Self = this.set("nextStreamID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextStreamID: Self = this.set("nextStreamID", js.undefined)
    @scala.inline
    def setOutboundQueueSize(value: Double): Self = this.set("outboundQueueSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutboundQueueSize: Self = this.set("outboundQueueSize", js.undefined)
    @scala.inline
    def setRemoteWindowSize(value: Double): Self = this.set("remoteWindowSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteWindowSize: Self = this.set("remoteWindowSize", js.undefined)
  }
  
}

