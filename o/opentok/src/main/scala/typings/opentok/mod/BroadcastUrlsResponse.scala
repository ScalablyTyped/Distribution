package typings.opentok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BroadcastUrlsResponse extends js.Object {
  var hls: js.UndefOr[String] = js.undefined
  var rtmp: js.UndefOr[js.Array[BroadcastOutputOptionsRtmp]] = js.undefined
}

object BroadcastUrlsResponse {
  @scala.inline
  def apply(hls: String = null, rtmp: js.Array[BroadcastOutputOptionsRtmp] = null): BroadcastUrlsResponse = {
    val __obj = js.Dynamic.literal()
    if (hls != null) __obj.updateDynamic("hls")(hls.asInstanceOf[js.Any])
    if (rtmp != null) __obj.updateDynamic("rtmp")(rtmp.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastUrlsResponse]
  }
}

