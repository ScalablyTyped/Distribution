package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Photo extends js.Object {
  // Camera manufacturer. Read-only.
  var cameraMake: js.UndefOr[String] = js.native
  // Camera model. Read-only.
  var cameraModel: js.UndefOr[String] = js.native
  // The denominator for the exposure time fraction from the camera. Read-only.
  var exposureDenominator: js.UndefOr[Double] = js.native
  // The numerator for the exposure time fraction from the camera. Read-only.
  var exposureNumerator: js.UndefOr[Double] = js.native
  // The F-stop value from the camera. Read-only.
  var fNumber: js.UndefOr[Double] = js.native
  // The focal length from the camera. Read-only.
  var focalLength: js.UndefOr[Double] = js.native
  // The ISO value from the camera. Read-only.
  var iso: js.UndefOr[Double] = js.native
  // The orientation value from the camera. Writable on OneDrive Personal.
  var orientation: js.UndefOr[Double] = js.native
  // Represents the date and time the photo was taken. Read-only.
  var takenDateTime: js.UndefOr[String] = js.native
}

object Photo {
  @scala.inline
  def apply(): Photo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Photo]
  }
  @scala.inline
  implicit class PhotoOps[Self <: Photo] (val x: Self) extends AnyVal {
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
    def setCameraMake(value: String): Self = this.set("cameraMake", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCameraMake: Self = this.set("cameraMake", js.undefined)
    @scala.inline
    def setCameraModel(value: String): Self = this.set("cameraModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCameraModel: Self = this.set("cameraModel", js.undefined)
    @scala.inline
    def setExposureDenominator(value: Double): Self = this.set("exposureDenominator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExposureDenominator: Self = this.set("exposureDenominator", js.undefined)
    @scala.inline
    def setExposureNumerator(value: Double): Self = this.set("exposureNumerator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExposureNumerator: Self = this.set("exposureNumerator", js.undefined)
    @scala.inline
    def setFNumber(value: Double): Self = this.set("fNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFNumber: Self = this.set("fNumber", js.undefined)
    @scala.inline
    def setFocalLength(value: Double): Self = this.set("focalLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocalLength: Self = this.set("focalLength", js.undefined)
    @scala.inline
    def setIso(value: Double): Self = this.set("iso", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIso: Self = this.set("iso", js.undefined)
    @scala.inline
    def setOrientation(value: Double): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setTakenDateTime(value: String): Self = this.set("takenDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTakenDateTime: Self = this.set("takenDateTime", js.undefined)
  }
  
}

