package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Photo extends js.Object {
  // Camera manufacturer. Read-only.
  var cameraMake: js.UndefOr[java.lang.String] = js.undefined
  // Camera model. Read-only.
  var cameraModel: js.UndefOr[java.lang.String] = js.undefined
  // The denominator for the exposure time fraction from the camera. Read-only.
  var exposureDenominator: js.UndefOr[scala.Double] = js.undefined
  // The numerator for the exposure time fraction from the camera. Read-only.
  var exposureNumerator: js.UndefOr[scala.Double] = js.undefined
  // The F-stop value from the camera. Read-only.
  var fNumber: js.UndefOr[scala.Double] = js.undefined
  // The focal length from the camera. Read-only.
  var focalLength: js.UndefOr[scala.Double] = js.undefined
  // The ISO value from the camera. Read-only.
  var iso: js.UndefOr[scala.Double] = js.undefined
  // Represents the date and time the photo was taken. Read-only.
  var takenDateTime: js.UndefOr[java.lang.String] = js.undefined
}

object Photo {
  @scala.inline
  def apply(
    cameraMake: java.lang.String = null,
    cameraModel: java.lang.String = null,
    exposureDenominator: scala.Int | scala.Double = null,
    exposureNumerator: scala.Int | scala.Double = null,
    fNumber: scala.Int | scala.Double = null,
    focalLength: scala.Int | scala.Double = null,
    iso: scala.Int | scala.Double = null,
    takenDateTime: java.lang.String = null
  ): Photo = {
    val __obj = js.Dynamic.literal()
    if (cameraMake != null) __obj.updateDynamic("cameraMake")(cameraMake)
    if (cameraModel != null) __obj.updateDynamic("cameraModel")(cameraModel)
    if (exposureDenominator != null) __obj.updateDynamic("exposureDenominator")(exposureDenominator.asInstanceOf[js.Any])
    if (exposureNumerator != null) __obj.updateDynamic("exposureNumerator")(exposureNumerator.asInstanceOf[js.Any])
    if (fNumber != null) __obj.updateDynamic("fNumber")(fNumber.asInstanceOf[js.Any])
    if (focalLength != null) __obj.updateDynamic("focalLength")(focalLength.asInstanceOf[js.Any])
    if (iso != null) __obj.updateDynamic("iso")(iso.asInstanceOf[js.Any])
    if (takenDateTime != null) __obj.updateDynamic("takenDateTime")(takenDateTime)
    __obj.asInstanceOf[Photo]
  }
}

