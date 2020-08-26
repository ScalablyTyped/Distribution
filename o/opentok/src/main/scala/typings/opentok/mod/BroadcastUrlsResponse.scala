package typings.opentok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BroadcastUrlsResponse extends js.Object {
  var hls: js.UndefOr[String] = js.native
  var rtmp: js.UndefOr[js.Array[BroadcastOutputOptionsRtmp]] = js.native
}

object BroadcastUrlsResponse {
  @scala.inline
  def apply(): BroadcastUrlsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BroadcastUrlsResponse]
  }
  @scala.inline
  implicit class BroadcastUrlsResponseOps[Self <: BroadcastUrlsResponse] (val x: Self) extends AnyVal {
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
    def setHls(value: String): Self = this.set("hls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHls: Self = this.set("hls", js.undefined)
    @scala.inline
    def setRtmpVarargs(value: BroadcastOutputOptionsRtmp*): Self = this.set("rtmp", js.Array(value :_*))
    @scala.inline
    def setRtmp(value: js.Array[BroadcastOutputOptionsRtmp]): Self = this.set("rtmp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtmp: Self = this.set("rtmp", js.undefined)
  }
  
}

