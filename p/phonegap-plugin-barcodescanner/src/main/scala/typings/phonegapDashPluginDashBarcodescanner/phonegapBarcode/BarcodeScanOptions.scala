package typings.phonegapDashPluginDashBarcodescanner.phonegapBarcode

import typings.phonegapDashPluginDashBarcodescanner.phonegapDashPluginDashBarcodescannerStrings.landscape
import typings.phonegapDashPluginDashBarcodescanner.phonegapDashPluginDashBarcodescannerStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarcodeScanOptions extends js.Object {
  var disableAnimations: Boolean
  var disableSuccessBeep: js.UndefOr[Boolean] = js.undefined
  var formats: js.UndefOr[String] = js.undefined
  var orientation: js.UndefOr[landscape | portrait] = js.undefined
  var preferFrontCamera: js.UndefOr[Boolean] = js.undefined
  var prompt: js.UndefOr[String] = js.undefined
  var resultDisplayDuration: js.UndefOr[Double] = js.undefined
  var saveHistory: js.UndefOr[Boolean] = js.undefined
  var showFlipCameraButton: js.UndefOr[Boolean] = js.undefined
  var showTorchButton: js.UndefOr[Boolean] = js.undefined
  var torchOn: js.UndefOr[Boolean] = js.undefined
}

object BarcodeScanOptions {
  @scala.inline
  def apply(
    disableAnimations: Boolean,
    disableSuccessBeep: js.UndefOr[Boolean] = js.undefined,
    formats: String = null,
    orientation: landscape | portrait = null,
    preferFrontCamera: js.UndefOr[Boolean] = js.undefined,
    prompt: String = null,
    resultDisplayDuration: Int | Double = null,
    saveHistory: js.UndefOr[Boolean] = js.undefined,
    showFlipCameraButton: js.UndefOr[Boolean] = js.undefined,
    showTorchButton: js.UndefOr[Boolean] = js.undefined,
    torchOn: js.UndefOr[Boolean] = js.undefined
  ): BarcodeScanOptions = {
    val __obj = js.Dynamic.literal(disableAnimations = disableAnimations.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSuccessBeep)) __obj.updateDynamic("disableSuccessBeep")(disableSuccessBeep.asInstanceOf[js.Any])
    if (formats != null) __obj.updateDynamic("formats")(formats.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(preferFrontCamera)) __obj.updateDynamic("preferFrontCamera")(preferFrontCamera.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (resultDisplayDuration != null) __obj.updateDynamic("resultDisplayDuration")(resultDisplayDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(saveHistory)) __obj.updateDynamic("saveHistory")(saveHistory.asInstanceOf[js.Any])
    if (!js.isUndefined(showFlipCameraButton)) __obj.updateDynamic("showFlipCameraButton")(showFlipCameraButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showTorchButton)) __obj.updateDynamic("showTorchButton")(showTorchButton.asInstanceOf[js.Any])
    if (!js.isUndefined(torchOn)) __obj.updateDynamic("torchOn")(torchOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarcodeScanOptions]
  }
}

