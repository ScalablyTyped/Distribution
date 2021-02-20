package typings.maximMazurokGapiClientDrive.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aperture extends StObject {
  
  /** The aperture used to create the photo (f-number). */
  var aperture: js.UndefOr[Double] = js.native
  
  /** The make of the camera used to create the photo. */
  var cameraMake: js.UndefOr[String] = js.native
  
  /** The model of the camera used to create the photo. */
  var cameraModel: js.UndefOr[String] = js.native
  
  /** The color space of the photo. */
  var colorSpace: js.UndefOr[String] = js.native
  
  /** The exposure bias of the photo (APEX value). */
  var exposureBias: js.UndefOr[Double] = js.native
  
  /** The exposure mode used to create the photo. */
  var exposureMode: js.UndefOr[String] = js.native
  
  /** The length of the exposure, in seconds. */
  var exposureTime: js.UndefOr[Double] = js.native
  
  /** Whether a flash was used to create the photo. */
  var flashUsed: js.UndefOr[Boolean] = js.native
  
  /** The focal length used to create the photo, in millimeters. */
  var focalLength: js.UndefOr[Double] = js.native
  
  /** The height of the image in pixels. */
  var height: js.UndefOr[Double] = js.native
  
  /** The ISO speed used to create the photo. */
  var isoSpeed: js.UndefOr[Double] = js.native
  
  /** The lens used to create the photo. */
  var lens: js.UndefOr[String] = js.native
  
  /** Geographic location information stored in the image. */
  var location: js.UndefOr[Altitude] = js.native
  
  /** The smallest f-number of the lens at the focal length used to create the photo (APEX value). */
  var maxApertureValue: js.UndefOr[Double] = js.native
  
  /** The metering mode used to create the photo. */
  var meteringMode: js.UndefOr[String] = js.native
  
  /** The number of clockwise 90 degree rotations applied from the image's original orientation. */
  var rotation: js.UndefOr[Double] = js.native
  
  /** The type of sensor used to create the photo. */
  var sensor: js.UndefOr[String] = js.native
  
  /** The distance to the subject of the photo, in meters. */
  var subjectDistance: js.UndefOr[Double] = js.native
  
  /** The date and time the photo was taken (EXIF DateTime). */
  var time: js.UndefOr[String] = js.native
  
  /** The white balance mode used to create the photo. */
  var whiteBalance: js.UndefOr[String] = js.native
  
  /** The width of the image in pixels. */
  var width: js.UndefOr[Double] = js.native
}
object Aperture {
  
  @scala.inline
  def apply(): Aperture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aperture]
  }
  
  @scala.inline
  implicit class ApertureMutableBuilder[Self <: Aperture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAperture(value: Double): Self = StObject.set(x, "aperture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApertureUndefined: Self = StObject.set(x, "aperture", js.undefined)
    
    @scala.inline
    def setCameraMake(value: String): Self = StObject.set(x, "cameraMake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraMakeUndefined: Self = StObject.set(x, "cameraMake", js.undefined)
    
    @scala.inline
    def setCameraModel(value: String): Self = StObject.set(x, "cameraModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraModelUndefined: Self = StObject.set(x, "cameraModel", js.undefined)
    
    @scala.inline
    def setColorSpace(value: String): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSpaceUndefined: Self = StObject.set(x, "colorSpace", js.undefined)
    
    @scala.inline
    def setExposureBias(value: Double): Self = StObject.set(x, "exposureBias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposureBiasUndefined: Self = StObject.set(x, "exposureBias", js.undefined)
    
    @scala.inline
    def setExposureMode(value: String): Self = StObject.set(x, "exposureMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposureModeUndefined: Self = StObject.set(x, "exposureMode", js.undefined)
    
    @scala.inline
    def setExposureTime(value: Double): Self = StObject.set(x, "exposureTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposureTimeUndefined: Self = StObject.set(x, "exposureTime", js.undefined)
    
    @scala.inline
    def setFlashUsed(value: Boolean): Self = StObject.set(x, "flashUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlashUsedUndefined: Self = StObject.set(x, "flashUsed", js.undefined)
    
    @scala.inline
    def setFocalLength(value: Double): Self = StObject.set(x, "focalLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocalLengthUndefined: Self = StObject.set(x, "focalLength", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIsoSpeed(value: Double): Self = StObject.set(x, "isoSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsoSpeedUndefined: Self = StObject.set(x, "isoSpeed", js.undefined)
    
    @scala.inline
    def setLens(value: String): Self = StObject.set(x, "lens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLensUndefined: Self = StObject.set(x, "lens", js.undefined)
    
    @scala.inline
    def setLocation(value: Altitude): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMaxApertureValue(value: Double): Self = StObject.set(x, "maxApertureValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxApertureValueUndefined: Self = StObject.set(x, "maxApertureValue", js.undefined)
    
    @scala.inline
    def setMeteringMode(value: String): Self = StObject.set(x, "meteringMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeteringModeUndefined: Self = StObject.set(x, "meteringMode", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setSensor(value: String): Self = StObject.set(x, "sensor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensorUndefined: Self = StObject.set(x, "sensor", js.undefined)
    
    @scala.inline
    def setSubjectDistance(value: Double): Self = StObject.set(x, "subjectDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectDistanceUndefined: Self = StObject.set(x, "subjectDistance", js.undefined)
    
    @scala.inline
    def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    @scala.inline
    def setWhiteBalance(value: String): Self = StObject.set(x, "whiteBalance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhiteBalanceUndefined: Self = StObject.set(x, "whiteBalance", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
