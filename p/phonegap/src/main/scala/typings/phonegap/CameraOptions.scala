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
    destinationType: js.UndefOr[Double] = js.undefined,
    encodingType: js.UndefOr[Double] = js.undefined,
    mediaType: js.UndefOr[Double] = js.undefined,
    popoverOptions: CameraPopoverOptions = null,
    quality: js.UndefOr[Double] = js.undefined,
    saveToPhotoAlbum: js.UndefOr[Boolean] = js.undefined,
    sourceType: js.UndefOr[Double] = js.undefined,
    targetHeight: js.UndefOr[Double] = js.undefined,
    targetWidth: js.UndefOr[Double] = js.undefined
  ): CameraOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEdit)) __obj.updateDynamic("allowEdit")(allowEdit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(correctOrientation)) __obj.updateDynamic("correctOrientation")(correctOrientation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(destinationType)) __obj.updateDynamic("destinationType")(destinationType.get.asInstanceOf[js.Any])
    if (!js.isUndefined(encodingType)) __obj.updateDynamic("encodingType")(encodingType.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mediaType)) __obj.updateDynamic("mediaType")(mediaType.get.asInstanceOf[js.Any])
    if (popoverOptions != null) __obj.updateDynamic("popoverOptions")(popoverOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (!js.isUndefined(saveToPhotoAlbum)) __obj.updateDynamic("saveToPhotoAlbum")(saveToPhotoAlbum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceType)) __obj.updateDynamic("sourceType")(sourceType.get.asInstanceOf[js.Any])
    if (!js.isUndefined(targetHeight)) __obj.updateDynamic("targetHeight")(targetHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(targetWidth)) __obj.updateDynamic("targetWidth")(targetWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraOptions]
  }
}

