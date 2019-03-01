package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionState extends js.Object {
  var deflateDynamicTableSize: js.UndefOr[scala.Double] = js.undefined
  var effectiveLocalWindowSize: js.UndefOr[scala.Double] = js.undefined
  var effectiveRecvDataLength: js.UndefOr[scala.Double] = js.undefined
  var inflateDynamicTableSize: js.UndefOr[scala.Double] = js.undefined
  var lastProcStreamID: js.UndefOr[scala.Double] = js.undefined
  var localWindowSize: js.UndefOr[scala.Double] = js.undefined
  var nextStreamID: js.UndefOr[scala.Double] = js.undefined
  var outboundQueueSize: js.UndefOr[scala.Double] = js.undefined
  var remoteWindowSize: js.UndefOr[scala.Double] = js.undefined
}

object SessionState {
  @scala.inline
  def apply(
    deflateDynamicTableSize: scala.Int | scala.Double = null,
    effectiveLocalWindowSize: scala.Int | scala.Double = null,
    effectiveRecvDataLength: scala.Int | scala.Double = null,
    inflateDynamicTableSize: scala.Int | scala.Double = null,
    lastProcStreamID: scala.Int | scala.Double = null,
    localWindowSize: scala.Int | scala.Double = null,
    nextStreamID: scala.Int | scala.Double = null,
    outboundQueueSize: scala.Int | scala.Double = null,
    remoteWindowSize: scala.Int | scala.Double = null
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

