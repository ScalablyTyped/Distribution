package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraOptions extends js.Object {
  var allowEdit: js.UndefOr[Boolean] = js.undefined
  var correctOrientation: js.UndefOr[Boolean] = js.undefined
  var destinationType: js.UndefOr[Double] = js.undefined
  var encodingType: js.UndefOr[Double] = js.undefined
  var mediaType: js.UndefOr[Double] = js.undefined
  var popoverOptions: js.UndefOr[CameraPopoverOptions] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
  var saveToPhotoAlbum: js.UndefOr[Boolean] = js.undefined
  var sourceType: js.UndefOr[Double] = js.undefined
  var targetHeight: js.UndefOr[Double] = js.undefined
  var targetWidth: js.UndefOr[Double] = js.undefined
}

object CameraOptions {
  @scala.inline
  def apply(
    allowEdit: js.UndefOr[Boolean] = js.undefined,
    correctOrientation: js.UndefOr[Boolean] = js.undefined,
    destinationType: Int | Double = null,
    encodingType: Int | Double = null,
    mediaType: Int | Double = null,
    popoverOptions: CameraPopoverOptions = null,
    quality: Int | Double = null,
    saveToPhotoAlbum: js.UndefOr[Boolean] = js.undefined,
    sourceType: Int | Double = null,
    targetHeight: Int | Double = null,
    targetWidth: Int | Double = null
  ): CameraOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEdit)) __obj.updateDynamic("allowEdit")(allowEdit.asInstanceOf[js.Any])
    if (!js.isUndefined(correctOrientation)) __obj.updateDynamic("correctOrientation")(correctOrientation.asInstanceOf[js.Any])
    if (destinationType != null) __obj.updateDynamic("destinationType")(destinationType.asInstanceOf[js.Any])
    if (encodingType != null) __obj.updateDynamic("encodingType")(encodingType.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (popoverOptions != null) __obj.updateDynamic("popoverOptions")(popoverOptions.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (!js.isUndefined(saveToPhotoAlbum)) __obj.updateDynamic("saveToPhotoAlbum")(saveToPhotoAlbum.asInstanceOf[js.Any])
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    if (targetHeight != null) __obj.updateDynamic("targetHeight")(targetHeight.asInstanceOf[js.Any])
    if (targetWidth != null) __obj.updateDynamic("targetWidth")(targetWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraOptions]
  }
}

