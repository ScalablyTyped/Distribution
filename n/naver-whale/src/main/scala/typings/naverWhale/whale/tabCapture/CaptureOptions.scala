package typings.naverWhale.whale.tabCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaptureOptions extends js.Object {
  /** Optional. */
  var audio: js.UndefOr[Boolean] = js.native
  /** Optional. */
  var audioConstraints: js.UndefOr[typings.chrome.chrome.tabCapture.MediaStreamConstraint] = js.native
  /** Optional. */
  var video: js.UndefOr[Boolean] = js.native
  /** Optional. */
  var videoConstraints: js.UndefOr[typings.chrome.chrome.tabCapture.MediaStreamConstraint] = js.native
}

object CaptureOptions {
  @scala.inline
  def apply(): CaptureOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureOptions]
  }
  @scala.inline
  implicit class CaptureOptionsOps[Self <: CaptureOptions] (val x: Self) extends AnyVal {
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
    def setAudio(value: Boolean): Self = this.set("audio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudio: Self = this.set("audio", js.undefined)
    @scala.inline
    def setAudioConstraints(value: typings.chrome.chrome.tabCapture.MediaStreamConstraint): Self = this.set("audioConstraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioConstraints: Self = this.set("audioConstraints", js.undefined)
    @scala.inline
    def setVideo(value: Boolean): Self = this.set("video", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
    @scala.inline
    def setVideoConstraints(value: typings.chrome.chrome.tabCapture.MediaStreamConstraint): Self = this.set("videoConstraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoConstraints: Self = this.set("videoConstraints", js.undefined)
  }
  
}

