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
  
  inline def apply(): Photo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Photo]
  }
  
  extension [Self <: Photo](x: Self) {
    
    inline def setCameraMake(value: NullableOption[String]): Self = StObject.set(x, "cameraMake", value.asInstanceOf[js.Any])
    
    inline def setCameraMakeNull: Self = StObject.set(x, "cameraMake", null)
    
    inline def setCameraMakeUndefined: Self = StObject.set(x, "cameraMake", js.undefined)
    
    inline def setCameraModel(value: NullableOption[String]): Self = StObject.set(x, "cameraModel", value.asInstanceOf[js.Any])
    
    inline def setCameraModelNull: Self = StObject.set(x, "cameraModel", null)
    
    inline def setCameraModelUndefined: Self = StObject.set(x, "cameraModel", js.undefined)
    
    inline def setExposureDenominator(value: NullableOption[Double]): Self = StObject.set(x, "exposureDenominator", value.asInstanceOf[js.Any])
    
    inline def setExposureDenominatorNull: Self = StObject.set(x, "exposureDenominator", null)
    
    inline def setExposureDenominatorUndefined: Self = StObject.set(x, "exposureDenominator", js.undefined)
    
    inline def setExposureNumerator(value: NullableOption[Double]): Self = StObject.set(x, "exposureNumerator", value.asInstanceOf[js.Any])
    
    inline def setExposureNumeratorNull: Self = StObject.set(x, "exposureNumerator", null)
    
    inline def setExposureNumeratorUndefined: Self = StObject.set(x, "exposureNumerator", js.undefined)
    
    inline def setFNumber(value: NullableOption[Double]): Self = StObject.set(x, "fNumber", value.asInstanceOf[js.Any])
    
    inline def setFNumberNull: Self = StObject.set(x, "fNumber", null)
    
    inline def setFNumberUndefined: Self = StObject.set(x, "fNumber", js.undefined)
    
    inline def setFocalLength(value: NullableOption[Double]): Self = StObject.set(x, "focalLength", value.asInstanceOf[js.Any])
    
    inline def setFocalLengthNull: Self = StObject.set(x, "focalLength", null)
    
    inline def setFocalLengthUndefined: Self = StObject.set(x, "focalLength", js.undefined)
    
    inline def setIso(value: NullableOption[Double]): Self = StObject.set(x, "iso", value.asInstanceOf[js.Any])
    
    inline def setIsoNull: Self = StObject.set(x, "iso", null)
    
    inline def setIsoUndefined: Self = StObject.set(x, "iso", js.undefined)
    
    inline def setOrientation(value: NullableOption[Double]): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationNull: Self = StObject.set(x, "orientation", null)
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setTakenDateTime(value: NullableOption[String]): Self = StObject.set(x, "takenDateTime", value.asInstanceOf[js.Any])
    
    inline def setTakenDateTimeNull: Self = StObject.set(x, "takenDateTime", null)
    
    inline def setTakenDateTimeUndefined: Self = StObject.set(x, "takenDateTime", js.undefined)
  }
}
