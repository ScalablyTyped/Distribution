package typings.piCamera.mod

import typings.piCamera.piCameraStrings.photo
import typings.piCamera.piCameraStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cameraConfig extends js.Object {
  var annotate: js.UndefOr[String | Double] = js.native
  var datetime: js.UndefOr[Boolean] = js.native
  var demo: js.UndefOr[Double] = js.native
  var encoding: js.UndefOr[String] = js.native
  var exif: js.UndefOr[String] = js.native
  var framerate: js.UndefOr[Double] = js.native
  var fullscreen: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var hflip: js.UndefOr[Boolean] = js.native
  var latest: js.UndefOr[String] = js.native
  var mode: photo | video = js.native
  var nopreview: js.UndefOr[Boolean] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var output: js.UndefOr[String] = js.native
  var preview: js.UndefOr[String] = js.native
  var quality: js.UndefOr[Double] = js.native
  var raw: js.UndefOr[Boolean] = js.native
  var rotation: js.UndefOr[Double] = js.native
  var thumb: js.UndefOr[String] = js.native
  var timelapse: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var timestamp: js.UndefOr[Boolean] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
  var vflip: js.UndefOr[Boolean] = js.native
  var vstab: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
}

object cameraConfig {
  @scala.inline
  def apply(mode: photo | video): cameraConfig = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[cameraConfig]
  }
  @scala.inline
  implicit class cameraConfigOps[Self <: cameraConfig] (val x: Self) extends AnyVal {
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
    def setMode(value: photo | video): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnnotate(value: String | Double): Self = this.set("annotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnotate: Self = this.set("annotate", js.undefined)
    @scala.inline
    def setDatetime(value: Boolean): Self = this.set("datetime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatetime: Self = this.set("datetime", js.undefined)
    @scala.inline
    def setDemo(value: Double): Self = this.set("demo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDemo: Self = this.set("demo", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setExif(value: String): Self = this.set("exif", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExif: Self = this.set("exif", js.undefined)
    @scala.inline
    def setFramerate(value: Double): Self = this.set("framerate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFramerate: Self = this.set("framerate", js.undefined)
    @scala.inline
    def setFullscreen(value: Boolean): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullscreen: Self = this.set("fullscreen", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHflip(value: Boolean): Self = this.set("hflip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHflip: Self = this.set("hflip", js.undefined)
    @scala.inline
    def setLatest(value: String): Self = this.set("latest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatest: Self = this.set("latest", js.undefined)
    @scala.inline
    def setNopreview(value: Boolean): Self = this.set("nopreview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNopreview: Self = this.set("nopreview", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    @scala.inline
    def setPreview(value: String): Self = this.set("preview", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setThumb(value: String): Self = this.set("thumb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumb: Self = this.set("thumb", js.undefined)
    @scala.inline
    def setTimelapse(value: Double): Self = this.set("timelapse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimelapse: Self = this.set("timelapse", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTimestamp(value: Boolean): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
    @scala.inline
    def setVflip(value: Boolean): Self = this.set("vflip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVflip: Self = this.set("vflip", js.undefined)
    @scala.inline
    def setVstab(value: Boolean): Self = this.set("vstab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVstab: Self = this.set("vstab", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

