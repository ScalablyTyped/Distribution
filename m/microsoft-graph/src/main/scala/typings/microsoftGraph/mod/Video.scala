package typings.microsoftGraph.mod

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
    audioBitsPerSample: js.UndefOr[Double] = js.undefined,
    audioChannels: js.UndefOr[Double] = js.undefined,
    audioFormat: String = null,
    audioSamplesPerSecond: js.UndefOr[Double] = js.undefined,
    bitrate: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    fourCC: String = null,
    frameRate: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): Video = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audioBitsPerSample)) __obj.updateDynamic("audioBitsPerSample")(audioBitsPerSample.get.asInstanceOf[js.Any])
    if (!js.isUndefined(audioChannels)) __obj.updateDynamic("audioChannels")(audioChannels.get.asInstanceOf[js.Any])
    if (audioFormat != null) __obj.updateDynamic("audioFormat")(audioFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(audioSamplesPerSecond)) __obj.updateDynamic("audioSamplesPerSecond")(audioSamplesPerSecond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bitrate)) __obj.updateDynamic("bitrate")(bitrate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (fourCC != null) __obj.updateDynamic("fourCC")(fourCC.asInstanceOf[js.Any])
    if (!js.isUndefined(frameRate)) __obj.updateDynamic("frameRate")(frameRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Video]
  }
}

