package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Photo extends StObject {
  
  // Camera manufacturer. Read-only.
  var cameraMake: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Camera model. Read-only.
  var cameraModel: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The denominator for the exposure time fraction from the camera. Read-only.
  var exposureDenominator: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The numerator for the exposure time fraction from the camera. Read-only.
  var exposureNumerator: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The F-stop value from the camera. Read-only.
  var fNumber: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The focal length from the camera. Read-only.
  var focalLength: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The ISO value from the camera. Read-only.
  var iso: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The orientation value from the camera. Writable on OneDrive Personal.
  var orientation: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Represents the date and time the photo was taken. Read-only.
  var takenDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object Photo {
  
  @scala.inline
  def apply(): Photo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Photo]
  }
  
  @scala.inline
  implicit class PhotoMutableBuilder[Self <: Photo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCameraMake(value: NullableOption[String]): Self = StObject.set(x, "cameraMake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraMakeNull: Self = StObject.set(x, "cameraMake", null)
    
    @scala.inline
    def setCameraMakeUndefined: Self = StObject.set(x, "cameraMake", js.undefined)
    
    @scala.inline
    def setCameraModel(value: NullableOption[String]): Self = StObject.set(x, "cameraModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraModelNull: Self = StObject.set(x, "cameraModel", null)
    
    @scala.inline
    def setCameraModelUndefined: Self = StObject.set(x, "cameraModel", js.undefined)
    
    @scala.inline
    def setExposureDenominator(value: NullableOption[Double]): Self = StObject.set(x, "exposureDenominator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposureDenominatorNull: Self = StObject.set(x, "exposureDenominator", null)
    
    @scala.inline
    def setExposureDenominatorUndefined: Self = StObject.set(x, "exposureDenominator", js.undefined)
    
    @scala.inline
    def setExposureNumerator(value: NullableOption[Double]): Self = StObject.set(x, "exposureNumerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposureNumeratorNull: Self = StObject.set(x, "exposureNumerator", null)
    
    @scala.inline
    def setExposureNumeratorUndefined: Self = StObject.set(x, "exposureNumerator", js.undefined)
    
    @scala.inline
    def setFNumber(value: NullableOption[Double]): Self = StObject.set(x, "fNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFNumberNull: Self = StObject.set(x, "fNumber", null)
    
    @scala.inline
    def setFNumberUndefined: Self = StObject.set(x, "fNumber", js.undefined)
    
    @scala.inline
    def setFocalLength(value: NullableOption[Double]): Self = StObject.set(x, "focalLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocalLengthNull: Self = StObject.set(x, "focalLength", null)
    
    @scala.inline
    def setFocalLengthUndefined: Self = StObject.set(x, "focalLength", js.undefined)
    
    @scala.inline
    def setIso(value: NullableOption[Double]): Self = StObject.set(x, "iso", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsoNull: Self = StObject.set(x, "iso", null)
    
    @scala.inline
    def setIsoUndefined: Self = StObject.set(x, "iso", js.undefined)
    
    @scala.inline
    def setOrientation(value: NullableOption[Double]): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationNull: Self = StObject.set(x, "orientation", null)
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setTakenDateTime(value: NullableOption[String]): Self = StObject.set(x, "takenDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTakenDateTimeNull: Self = StObject.set(x, "takenDateTime", null)
    
    @scala.inline
    def setTakenDateTimeUndefined: Self = StObject.set(x, "takenDateTime", js.undefined)
  }
}
