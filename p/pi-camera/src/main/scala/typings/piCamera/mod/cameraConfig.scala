package typings.piCamera.mod

import typings.piCamera.piCameraStrings.photo
import typings.piCamera.piCameraStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cameraConfig extends js.Object {
  var annotate: js.UndefOr[String | Double] = js.undefined
  var datetime: js.UndefOr[Boolean] = js.undefined
  var demo: js.UndefOr[Double] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var exif: js.UndefOr[String] = js.undefined
  var framerate: js.UndefOr[Double] = js.undefined
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hflip: js.UndefOr[Boolean] = js.undefined
  var latest: js.UndefOr[String] = js.undefined
  var mode: photo | video
  var nopreview: js.UndefOr[Boolean] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var output: js.UndefOr[String] = js.undefined
  var preview: js.UndefOr[String] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
  var raw: js.UndefOr[Boolean] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var thumb: js.UndefOr[String] = js.undefined
  var timelapse: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var timestamp: js.UndefOr[Boolean] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
  var vflip: js.UndefOr[Boolean] = js.undefined
  var vstab: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object cameraConfig {
  @scala.inline
  def apply(
    mode: photo | video,
    annotate: String | Double = null,
    datetime: js.UndefOr[Boolean] = js.undefined,
    demo: Int | Double = null,
    encoding: String = null,
    exif: String = null,
    framerate: Int | Double = null,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    hflip: js.UndefOr[Boolean] = js.undefined,
    latest: String = null,
    nopreview: js.UndefOr[Boolean] = js.undefined,
    opacity: Int | Double = null,
    output: String = null,
    preview: String = null,
    quality: Int | Double = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    rotation: Int | Double = null,
    thumb: String = null,
    timelapse: Int | Double = null,
    timeout: Int | Double = null,
    timestamp: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined,
    vflip: js.UndefOr[Boolean] = js.undefined,
    vstab: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): cameraConfig = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    if (annotate != null) __obj.updateDynamic("annotate")(annotate.asInstanceOf[js.Any])
    if (!js.isUndefined(datetime)) __obj.updateDynamic("datetime")(datetime.asInstanceOf[js.Any])
    if (demo != null) __obj.updateDynamic("demo")(demo.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (exif != null) __obj.updateDynamic("exif")(exif.asInstanceOf[js.Any])
    if (framerate != null) __obj.updateDynamic("framerate")(framerate.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hflip)) __obj.updateDynamic("hflip")(hflip.asInstanceOf[js.Any])
    if (latest != null) __obj.updateDynamic("latest")(latest.asInstanceOf[js.Any])
    if (!js.isUndefined(nopreview)) __obj.updateDynamic("nopreview")(nopreview.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (preview != null) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    if (timelapse != null) __obj.updateDynamic("timelapse")(timelapse.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    if (!js.isUndefined(vflip)) __obj.updateDynamic("vflip")(vflip.asInstanceOf[js.Any])
    if (!js.isUndefined(vstab)) __obj.updateDynamic("vstab")(vstab.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[cameraConfig]
  }
}

