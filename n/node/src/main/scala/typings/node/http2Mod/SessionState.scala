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
    deflateDynamicTableSize: js.UndefOr[Double] = js.undefined,
    effectiveLocalWindowSize: js.UndefOr[Double] = js.undefined,
    effectiveRecvDataLength: js.UndefOr[Double] = js.undefined,
    inflateDynamicTableSize: js.UndefOr[Double] = js.undefined,
    lastProcStreamID: js.UndefOr[Double] = js.undefined,
    localWindowSize: js.UndefOr[Double] = js.undefined,
    nextStreamID: js.UndefOr[Double] = js.undefined,
    outboundQueueSize: js.UndefOr[Double] = js.undefined,
    remoteWindowSize: js.UndefOr[Double] = js.undefined
  ): SessionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deflateDynamicTableSize)) __obj.updateDynamic("deflateDynamicTableSize")(deflateDynamicTableSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(effectiveLocalWindowSize)) __obj.updateDynamic("effectiveLocalWindowSize")(effectiveLocalWindowSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(effectiveRecvDataLength)) __obj.updateDynamic("effectiveRecvDataLength")(effectiveRecvDataLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inflateDynamicTableSize)) __obj.updateDynamic("inflateDynamicTableSize")(inflateDynamicTableSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lastProcStreamID)) __obj.updateDynamic("lastProcStreamID")(lastProcStreamID.get.asInstanceOf[js.Any])
    if (!js.isUndefined(localWindowSize)) __obj.updateDynamic("localWindowSize")(localWindowSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nextStreamID)) __obj.updateDynamic("nextStreamID")(nextStreamID.get.asInstanceOf[js.Any])
    if (!js.isUndefined(outboundQueueSize)) __obj.updateDynamic("outboundQueueSize")(outboundQueueSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteWindowSize)) __obj.updateDynamic("remoteWindowSize")(remoteWindowSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionState]
  }
}

