package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Video extends js.Object {
  // Number of audio bits per sample.
  var audioBitsPerSample: js.UndefOr[Double] = js.native
  // Number of audio channels.
  var audioChannels: js.UndefOr[Double] = js.native
  // Name of the audio format (AAC, MP3, etc.).
  var audioFormat: js.UndefOr[String] = js.native
  // Number of audio samples per second.
  var audioSamplesPerSecond: js.UndefOr[Double] = js.native
  // Bit rate of the video in bits per second.
  var bitrate: js.UndefOr[Double] = js.native
  // Duration of the file in milliseconds.
  var duration: js.UndefOr[Double] = js.native
  // 'Four character code' name of the video format.
  var fourCC: js.UndefOr[String] = js.native
  // Frame rate of the video.
  var frameRate: js.UndefOr[Double] = js.native
  // Height of the video, in pixels.
  var height: js.UndefOr[Double] = js.native
  // Width of the video, in pixels.
  var width: js.UndefOr[Double] = js.native
}

object Video {
  @scala.inline
  def apply(): Video = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Video]
  }
  @scala.inline
  implicit class VideoOps[Self <: Video] (val x: Self) extends AnyVal {
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
    def setAudioBitsPerSample(value: Double): Self = this.set("audioBitsPerSample", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioBitsPerSample: Self = this.set("audioBitsPerSample", js.undefined)
    @scala.inline
    def setAudioChannels(value: Double): Self = this.set("audioChannels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioChannels: Self = this.set("audioChannels", js.undefined)
    @scala.inline
    def setAudioFormat(value: String): Self = this.set("audioFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioFormat: Self = this.set("audioFormat", js.undefined)
    @scala.inline
    def setAudioSamplesPerSecond(value: Double): Self = this.set("audioSamplesPerSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioSamplesPerSecond: Self = this.set("audioSamplesPerSecond", js.undefined)
    @scala.inline
    def setBitrate(value: Double): Self = this.set("bitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitrate: Self = this.set("bitrate", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setFourCC(value: String): Self = this.set("fourCC", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFourCC: Self = this.set("fourCC", js.undefined)
    @scala.inline
    def setFrameRate(value: Double): Self = this.set("frameRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameRate: Self = this.set("frameRate", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

