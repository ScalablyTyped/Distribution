package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraOptions extends js.Object {
  var allowEdit: js.UndefOr[scala.Boolean] = js.undefined
  var correctOrientation: js.UndefOr[scala.Boolean] = js.undefined
  var destinationType: js.UndefOr[scala.Double] = js.undefined
  var encodingType: js.UndefOr[scala.Double] = js.undefined
  var mediaType: js.UndefOr[scala.Double] = js.undefined
  var popoverOptions: js.UndefOr[CameraPopoverOptions] = js.undefined
  var quality: js.UndefOr[scala.Double] = js.undefined
  var saveToPhotoAlbum: js.UndefOr[scala.Boolean] = js.undefined
  var sourceType: js.UndefOr[scala.Double] = js.undefined
  var targetHeight: js.UndefOr[scala.Double] = js.undefined
  var targetWidth: js.UndefOr[scala.Double] = js.undefined
}

object CameraOptions {
  @scala.inline
  def apply(
    allowEdit: js.UndefOr[scala.Boolean] = js.undefined,
    correctOrientation: js.UndefOr[scala.Boolean] = js.undefined,
    destinationType: scala.Int | scala.Double = null,
    encodingType: scala.Int | scala.Double = null,
    mediaType: scala.Int | scala.Double = null,
    popoverOptions: CameraPopoverOptions = null,
    quality: scala.Int | scala.Double = null,
    saveToPhotoAlbum: js.UndefOr[scala.Boolean] = js.undefined,
    sourceType: scala.Int | scala.Double = null,
    targetHeight: scala.Int | scala.Double = null,
    targetWidth: scala.Int | scala.Double = null
  ): CameraOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEdit)) __obj.updateDynamic("allowEdit")(allowEdit)
    if (!js.isUndefined(correctOrientation)) __obj.updateDynamic("correctOrientation")(correctOrientation)
    if (destinationType != null) __obj.updateDynamic("destinationType")(destinationType.asInstanceOf[js.Any])
    if (encodingType != null) __obj.updateDynamic("encodingType")(encodingType.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (popoverOptions != null) __obj.updateDynamic("popoverOptions")(popoverOptions)
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (!js.isUndefined(saveToPhotoAlbum)) __obj.updateDynamic("saveToPhotoAlbum")(saveToPhotoAlbum)
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    if (targetHeight != null) __obj.updateDynamic("targetHeight")(targetHeight.asInstanceOf[js.Any])
    if (targetWidth != null) __obj.updateDynamic("targetWidth")(targetWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraOptions]
  }
}

