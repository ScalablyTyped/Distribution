package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Video extends js.Object {
  // Number of audio bits per sample.
  var audioBitsPerSample: js.UndefOr[Double] = js.undefined
  // Number of audio channels.
  var audioChannels: js.UndefOr[Double] = js.undefined
  // Name of the audio format (AAC, MP3, etc.).
  var audioFormat: js.UndefOr[String] = js.undefined
  // Number of audio samples per second.
  var audioSamplesPerSecond: js.UndefOr[Double] = js.undefined
  // Bit rate of the video in bits per second.
  var bitrate: js.UndefOr[Double] = js.undefined
  // Duration of the file in milliseconds.
  var duration: js.UndefOr[Double] = js.undefined
  // 'Four character code' name of the video format.
  var fourCC: js.UndefOr[String] = js.undefined
  // Frame rate of the video.
  var frameRate: js.UndefOr[Double] = js.undefined
  // Height of the video, in pixels.
  var height: js.UndefOr[Double] = js.undefined
  // Width of the video, in pixels.
  var width: js.UndefOr[Double] = js.undefined
}

object Video {
  @scala.inline
  def apply(
    audioBitsPerSample: Int | Double = null,
    audioChannels: Int | Double = null,
    audioFormat: String = null,
    audioSamplesPerSecond: Int | Double = null,
    bitrate: Int | Double = null,
    duration: Int | Double = null,
    fourCC: String = null,
    frameRate: Int | Double = null,
    height: Int | Double = null,
    width: Int | Double = null
  ): Video = {
    val __obj = js.Dynamic.literal()
    if (audioBitsPerSample != null) __obj.updateDynamic("audioBitsPerSample")(audioBitsPerSample.asInstanceOf[js.Any])
    if (audioChannels != null) __obj.updateDynamic("audioChannels")(audioChannels.asInstanceOf[js.Any])
    if (audioFormat != null) __obj.updateDynamic("audioFormat")(audioFormat)
    if (audioSamplesPerSecond != null) __obj.updateDynamic("audioSamplesPerSecond")(audioSamplesPerSecond.asInstanceOf[js.Any])
    if (bitrate != null) __obj.updateDynamic("bitrate")(bitrate.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (fourCC != null) __obj.updateDynamic("fourCC")(fourCC)
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Video]
  }
}

