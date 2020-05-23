package typings.opentok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BroadcastOutputOptions extends js.Object {
  var hls: js.UndefOr[js.Object] = js.undefined
  var rtmp: js.UndefOr[js.Array[BroadcastOutputOptionsRtmp]] = js.undefined
}

object BroadcastOutputOptions {
  @scala.inline
  def apply(hls: js.Object = null, rtmp: js.Array[BroadcastOutputOptionsRtmp] = null): BroadcastOutputOptions = {
    val __obj = js.Dynamic.literal()
    if (hls != null) __obj.updateDynamic("hls")(hls.asInstanceOf[js.Any])
    if (rtmp != null) __obj.updateDynamic("rtmp")(rtmp.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastOutputOptions]
  }
}

