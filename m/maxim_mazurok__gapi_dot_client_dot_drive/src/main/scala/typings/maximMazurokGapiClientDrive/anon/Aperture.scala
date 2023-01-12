package typings.maximMazurokGapiClientDrive.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aperture extends StObject {
  
  /** The aperture used to create the photo (f-number). */
  var aperture: js.UndefOr[Double] = js.undefined
  
  /** The make of the camera used to create the photo. */
  var cameraMake: js.UndefOr[String] = js.undefined
  
  /** The model of the camera used to create the photo. */
  var cameraModel: js.UndefOr[String] = js.undefined
  
  /** The color space of the photo. */
  var colorSpace: js.UndefOr[String] = js.undefined
  
  /** The exposure bias of the photo (APEX value). */
  var exposureBias: js.UndefOr[Double] = js.undefined
  
  /** The exposure mode used to create the photo. */
  var exposureMode: js.UndefOr[String] = js.undefined
  
  /** The length of the exposure, in seconds. */
  var exposureTime: js.UndefOr[Double] = js.undefined
  
  /** Whether a flash was used to create the photo. */
  var flashUsed: js.UndefOr[Boolean] = js.undefined
  
  /** The focal length used to create the photo, in millimeters. */
  var focalLength: js.UndefOr[Double] = js.undefined
  
  /** The height of the image in pixels. */
  var height: js.UndefOr[Double] = js.undefined
  
  /** The ISO speed used to create the photo. */
  var isoSpeed: js.UndefOr[Double] = js.undefined
  
  /** The lens used to create the photo. */
  var lens: js.UndefOr[String] = js.undefined
  
  /** Geographic location information stored in the image. */
  var location: js.UndefOr[Altitude] = js.undefined
  
  /** The smallest f-number of the lens at the focal length used to create the photo (APEX value). */
  var maxApertureValue: js.UndefOr[Double] = js.undefined
  
  /** The metering mode used to create the photo. */
  var meteringMode: js.UndefOr[String] = js.undefined
  
  /** The number of clockwise 90 degree rotations applied from the image's original orientation. */
  var rotation: js.UndefOr[Double] = js.undefined
  
  /** The type of sensor used to create the photo. */
  var sensor: js.UndefOr[String] = js.undefined
  
  /** The distance to the subject of the photo, in meters. */
  var subjectDistance: js.UndefOr[Double] = js.undefined
  
  /** The date and time the photo was taken (EXIF DateTime). */
  var time: js.UndefOr[String] = js.undefined
  
  /** The white balance mode used to create the photo. */
  var whiteBalance: js.UndefOr[String] = js.undefined
  
  /** The width of the image in pixels. */
  var width: js.UndefOr[Double] = js.undefined
}
object Aperture {
  
  inline def apply(): Aperture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aperture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Aperture] (val x: Self) extends AnyVal {
    
    inline def setAperture(value: Double): Self = StObject.set(x, "aperture", value.asInstanceOf[js.Any])
    
    inline def setApertureUndefined: Self = StObject.set(x, "aperture", js.undefined)
    
    inline def setCameraMake(value: String): Self = StObject.set(x, "cameraMake", value.asInstanceOf[js.Any])
    
    inline def setCameraMakeUndefined: Self = StObject.set(x, "cameraMake", js.undefined)
    
    inline def setCameraModel(value: String): Self = StObject.set(x, "cameraModel", value.asInstanceOf[js.Any])
    
    inline def setCameraModelUndefined: Self = StObject.set(x, "cameraModel", js.undefined)
    
    inline def setColorSpace(value: String): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceUndefined: Self = StObject.set(x, "colorSpace", js.undefined)
    
    inline def setExposureBias(value: Double): Self = StObject.set(x, "exposureBias", value.asInstanceOf[js.Any])
    
    inline def setExposureBiasUndefined: Self = StObject.set(x, "exposureBias", js.undefined)
    
    inline def setExposureMode(value: String): Self = StObject.set(x, "exposureMode", value.asInstanceOf[js.Any])
    
    inline def setExposureModeUndefined: Self = StObject.set(x, "exposureMode", js.undefined)
    
    inline def setExposureTime(value: Double): Self = StObject.set(x, "exposureTime", value.asInstanceOf[js.Any])
    
    inline def setExposureTimeUndefined: Self = StObject.set(x, "exposureTime", js.undefined)
    
    inline def setFlashUsed(value: Boolean): Self = StObject.set(x, "flashUsed", value.asInstanceOf[js.Any])
    
    inline def setFlashUsedUndefined: Self = StObject.set(x, "flashUsed", js.undefined)
    
    inline def setFocalLength(value: Double): Self = StObject.set(x, "focalLength", value.asInstanceOf[js.Any])
    
    inline def setFocalLengthUndefined: Self = StObject.set(x, "focalLength", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIsoSpeed(value: Double): Self = StObject.set(x, "isoSpeed", value.asInstanceOf[js.Any])
    
    inline def setIsoSpeedUndefined: Self = StObject.set(x, "isoSpeed", js.undefined)
    
    inline def setLens(value: String): Self = StObject.set(x, "lens", value.asInstanceOf[js.Any])
    
    inline def setLensUndefined: Self = StObject.set(x, "lens", js.undefined)
    
    inline def setLocation(value: Altitude): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMaxApertureValue(value: Double): Self = StObject.set(x, "maxApertureValue", value.asInstanceOf[js.Any])
    
    inline def setMaxApertureValueUndefined: Self = StObject.set(x, "maxApertureValue", js.undefined)
    
    inline def setMeteringMode(value: String): Self = StObject.set(x, "meteringMode", value.asInstanceOf[js.Any])
    
    inline def setMeteringModeUndefined: Self = StObject.set(x, "meteringMode", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setSensor(value: String): Self = StObject.set(x, "sensor", value.asInstanceOf[js.Any])
    
    inline def setSensorUndefined: Self = StObject.set(x, "sensor", js.undefined)
    
    inline def setSubjectDistance(value: Double): Self = StObject.set(x, "subjectDistance", value.asInstanceOf[js.Any])
    
    inline def setSubjectDistanceUndefined: Self = StObject.set(x, "subjectDistance", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setWhiteBalance(value: String): Self = StObject.set(x, "whiteBalance", value.asInstanceOf[js.Any])
    
    inline def setWhiteBalanceUndefined: Self = StObject.set(x, "whiteBalance", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
