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
    demo: js.UndefOr[Double] = js.undefined,
    encoding: String = null,
    exif: String = null,
    framerate: js.UndefOr[Double] = js.undefined,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    hflip: js.UndefOr[Boolean] = js.undefined,
    latest: String = null,
    nopreview: js.UndefOr[Boolean] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    output: String = null,
    preview: String = null,
    quality: js.UndefOr[Double] = js.undefined,
    raw: js.UndefOr[Boolean] = js.undefined,
    rotation: js.UndefOr[Double] = js.undefined,
    thumb: String = null,
    timelapse: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    timestamp: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined,
    vflip: js.UndefOr[Boolean] = js.undefined,
    vstab: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): cameraConfig = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    if (annotate != null) __obj.updateDynamic("annotate")(annotate.asInstanceOf[js.Any])
    if (!js.isUndefined(datetime)) __obj.updateDynamic("datetime")(datetime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(demo)) __obj.updateDynamic("demo")(demo.get.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (exif != null) __obj.updateDynamic("exif")(exif.asInstanceOf[js.Any])
    if (!js.isUndefined(framerate)) __obj.updateDynamic("framerate")(framerate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hflip)) __obj.updateDynamic("hflip")(hflip.get.asInstanceOf[js.Any])
    if (latest != null) __obj.updateDynamic("latest")(latest.asInstanceOf[js.Any])
    if (!js.isUndefined(nopreview)) __obj.updateDynamic("nopreview")(nopreview.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (preview != null) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    if (!js.isUndefined(timelapse)) __obj.updateDynamic("timelapse")(timelapse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vflip)) __obj.updateDynamic("vflip")(vflip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vstab)) __obj.updateDynamic("vstab")(vstab.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[cameraConfig]
  }
}

