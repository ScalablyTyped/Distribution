package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Photo extends js.Object {
  // Camera manufacturer. Read-only.
  var cameraMake: js.UndefOr[String] = js.undefined
  // Camera model. Read-only.
  var cameraModel: js.UndefOr[String] = js.undefined
  // The denominator for the exposure time fraction from the camera. Read-only.
  var exposureDenominator: js.UndefOr[Double] = js.undefined
  // The numerator for the exposure time fraction from the camera. Read-only.
  var exposureNumerator: js.UndefOr[Double] = js.undefined
  // The F-stop value from the camera. Read-only.
  var fNumber: js.UndefOr[Double] = js.undefined
  // The focal length from the camera. Read-only.
  var focalLength: js.UndefOr[Double] = js.undefined
  // The ISO value from the camera. Read-only.
  var iso: js.UndefOr[Double] = js.undefined
  // Represents the date and time the photo was taken. Read-only.
  var takenDateTime: js.UndefOr[String] = js.undefined
}

object Photo {
  @scala.inline
  def apply(
    cameraMake: String = null,
    cameraModel: String = null,
    exposureDenominator: Int | Double = null,
    exposureNumerator: Int | Double = null,
    fNumber: Int | Double = null,
    focalLength: Int | Double = null,
    iso: Int | Double = null,
    takenDateTime: String = null
  ): Photo = {
    val __obj = js.Dynamic.literal()
    if (cameraMake != null) __obj.updateDynamic("cameraMake")(cameraMake.asInstanceOf[js.Any])
    if (cameraModel != null) __obj.updateDynamic("cameraModel")(cameraModel.asInstanceOf[js.Any])
    if (exposureDenominator != null) __obj.updateDynamic("exposureDenominator")(exposureDenominator.asInstanceOf[js.Any])
    if (exposureNumerator != null) __obj.updateDynamic("exposureNumerator")(exposureNumerator.asInstanceOf[js.Any])
    if (fNumber != null) __obj.updateDynamic("fNumber")(fNumber.asInstanceOf[js.Any])
    if (focalLength != null) __obj.updateDynamic("focalLength")(focalLength.asInstanceOf[js.Any])
    if (iso != null) __obj.updateDynamic("iso")(iso.asInstanceOf[js.Any])
    if (takenDateTime != null) __obj.updateDynamic("takenDateTime")(takenDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Photo]
  }
}

