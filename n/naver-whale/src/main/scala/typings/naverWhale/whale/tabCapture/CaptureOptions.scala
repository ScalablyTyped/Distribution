package typings.naverWhale.whale.tabCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptureOptions extends js.Object {
  /** Optional. */
  var audio: js.UndefOr[Boolean] = js.undefined
  /** Optional. */
  var audioConstraints: js.UndefOr[typings.chrome.chrome.tabCapture.MediaStreamConstraint] = js.undefined
  /** Optional. */
  var video: js.UndefOr[Boolean] = js.undefined
  /** Optional. */
  var videoConstraints: js.UndefOr[typings.chrome.chrome.tabCapture.MediaStreamConstraint] = js.undefined
}

object CaptureOptions {
  @scala.inline
  def apply(
    audio: js.UndefOr[Boolean] = js.undefined,
    audioConstraints: typings.chrome.chrome.tabCapture.MediaStreamConstraint = null,
    video: js.UndefOr[Boolean] = js.undefined,
    videoConstraints: typings.chrome.chrome.tabCapture.MediaStreamConstraint = null
  ): CaptureOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audio)) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (audioConstraints != null) __obj.updateDynamic("audioConstraints")(audioConstraints.asInstanceOf[js.Any])
    if (!js.isUndefined(video)) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    if (videoConstraints != null) __obj.updateDynamic("videoConstraints")(videoConstraints.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureOptions]
  }
}

