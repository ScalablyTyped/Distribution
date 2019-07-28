package typings.node.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionState extends js.Object {
  var deflateDynamicTableSize: js.UndefOr[Double] = js.undefined
  var effectiveLocalWindowSize: js.UndefOr[Double] = js.undefined
  var effectiveRecvDataLength: js.UndefOr[Double] = js.undefined
  var inflateDynamicTableSize: js.UndefOr[Double] = js.undefined
  var lastProcStreamID: js.UndefOr[Double] = js.undefined
  var localWindowSize: js.UndefOr[Double] = js.undefined
  var nextStreamID: js.UndefOr[Double] = js.undefined
  var outboundQueueSize: js.UndefOr[Double] = js.undefined
  var remoteWindowSize: js.UndefOr[Double] = js.undefined
}

object SessionState {
  @scala.inline
  def apply(
    deflateDynamicTableSize: Int | Double = null,
    effectiveLocalWindowSize: Int | Double = null,
    effectiveRecvDataLength: Int | Double = null,
    inflateDynamicTableSize: Int | Double = null,
    lastProcStreamID: Int | Double = null,
    localWindowSize: Int | Double = null,
    nextStreamID: Int | Double = null,
    outboundQueueSize: Int | Double = null,
    remoteWindowSize: Int | Double = null
  ): SessionState = {
    val __obj = js.Dynamic.literal()
    if (deflateDynamicTableSize != null) __obj.updateDynamic("deflateDynamicTableSize")(deflateDynamicTableSize.asInstanceOf[js.Any])
    if (effectiveLocalWindowSize != null) __obj.updateDynamic("effectiveLocalWindowSize")(effectiveLocalWindowSize.asInstanceOf[js.Any])
    if (effectiveRecvDataLength != null) __obj.updateDynamic("effectiveRecvDataLength")(effectiveRecvDataLength.asInstanceOf[js.Any])
    if (inflateDynamicTableSize != null) __obj.updateDynamic("inflateDynamicTableSize")(inflateDynamicTableSize.asInstanceOf[js.Any])
    if (lastProcStreamID != null) __obj.updateDynamic("lastProcStreamID")(lastProcStreamID.asInstanceOf[js.Any])
    if (localWindowSize != null) __obj.updateDynamic("localWindowSize")(localWindowSize.asInstanceOf[js.Any])
    if (nextStreamID != null) __obj.updateDynamic("nextStreamID")(nextStreamID.asInstanceOf[js.Any])
    if (outboundQueueSize != null) __obj.updateDynamic("outboundQueueSize")(outboundQueueSize.asInstanceOf[js.Any])
    if (remoteWindowSize != null) __obj.updateDynamic("remoteWindowSize")(remoteWindowSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionState]
  }
}

