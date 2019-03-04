package typings
package phonegapDashPluginDashBarcodescannerLib.phonegapBarcodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarcodeScanOptions extends js.Object {
  var disableAnimations: scala.Boolean
  var disableSuccessBeep: js.UndefOr[scala.Boolean] = js.undefined
  var formats: js.UndefOr[java.lang.String] = js.undefined
  var orientation: js.UndefOr[
    phonegapDashPluginDashBarcodescannerLib.phonegapDashPluginDashBarcodescannerLibStrings.landscape | phonegapDashPluginDashBarcodescannerLib.phonegapDashPluginDashBarcodescannerLibStrings.portrait
  ] = js.undefined
  var preferFrontCamera: js.UndefOr[scala.Boolean] = js.undefined
  var prompt: js.UndefOr[java.lang.String] = js.undefined
  var resultDisplayDuration: js.UndefOr[scala.Double] = js.undefined
  var saveHistory: js.UndefOr[scala.Boolean] = js.undefined
  var showFlipCameraButton: js.UndefOr[scala.Boolean] = js.undefined
  var showTorchButton: js.UndefOr[scala.Boolean] = js.undefined
  var torchOn: js.UndefOr[scala.Boolean] = js.undefined
}

object BarcodeScanOptions {
  @scala.inline
  def apply(
    disableAnimations: scala.Boolean,
    disableSuccessBeep: js.UndefOr[scala.Boolean] = js.undefined,
    formats: java.lang.String = null,
    orientation: phonegapDashPluginDashBarcodescannerLib.phonegapDashPluginDashBarcodescannerLibStrings.landscape | phonegapDashPluginDashBarcodescannerLib.phonegapDashPluginDashBarcodescannerLibStrings.portrait = null,
    preferFrontCamera: js.UndefOr[scala.Boolean] = js.undefined,
    prompt: java.lang.String = null,
    resultDisplayDuration: scala.Int | scala.Double = null,
    saveHistory: js.UndefOr[scala.Boolean] = js.undefined,
    showFlipCameraButton: js.UndefOr[scala.Boolean] = js.undefined,
    showTorchButton: js.UndefOr[scala.Boolean] = js.undefined,
    torchOn: js.UndefOr[scala.Boolean] = js.undefined
  ): BarcodeScanOptions = {
    val __obj = js.Dynamic.literal(disableAnimations = disableAnimations)
    if (!js.isUndefined(disableSuccessBeep)) __obj.updateDynamic("disableSuccessBeep")(disableSuccessBeep)
    if (formats != null) __obj.updateDynamic("formats")(formats)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(preferFrontCamera)) __obj.updateDynamic("preferFrontCamera")(preferFrontCamera)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    if (resultDisplayDuration != null) __obj.updateDynamic("resultDisplayDuration")(resultDisplayDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(saveHistory)) __obj.updateDynamic("saveHistory")(saveHistory)
    if (!js.isUndefined(showFlipCameraButton)) __obj.updateDynamic("showFlipCameraButton")(showFlipCameraButton)
    if (!js.isUndefined(showTorchButton)) __obj.updateDynamic("showTorchButton")(showTorchButton)
    if (!js.isUndefined(torchOn)) __obj.updateDynamic("torchOn")(torchOn)
    __obj.asInstanceOf[BarcodeScanOptions]
  }
}

