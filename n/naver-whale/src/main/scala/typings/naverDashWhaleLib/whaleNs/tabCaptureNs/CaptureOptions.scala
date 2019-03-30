package typings
package naverDashWhaleLib.whaleNs.tabCaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptureOptions extends js.Object {
  /** Optional. */
  var audio: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. */
  var audioConstraints: js.UndefOr[stdLib.MediaStreamConstraints] = js.undefined
  /** Optional. */
  var video: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. */
  var videoConstraints: js.UndefOr[stdLib.MediaStreamConstraints] = js.undefined
}

object CaptureOptions {
  @scala.inline
  def apply(
    audio: js.UndefOr[scala.Boolean] = js.undefined,
    audioConstraints: stdLib.MediaStreamConstraints = null,
    video: js.UndefOr[scala.Boolean] = js.undefined,
    videoConstraints: stdLib.MediaStreamConstraints = null
  ): CaptureOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audio)) __obj.updateDynamic("audio")(audio)
    if (audioConstraints != null) __obj.updateDynamic("audioConstraints")(audioConstraints)
    if (!js.isUndefined(video)) __obj.updateDynamic("video")(video)
    if (videoConstraints != null) __obj.updateDynamic("videoConstraints")(videoConstraints)
    __obj.asInstanceOf[CaptureOptions]
  }
}

