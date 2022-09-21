package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosModel extends StObject {
  
  /**
    * Device capabilities. Copied from
    * https://developer.apple.com/library/archive/documentation/DeviceInformation/Reference/iOSDeviceCompatibility/DeviceCompatibilityMatrix/DeviceCompatibilityMatrix.html
    */
  var deviceCapabilities: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Whether this device is a phone, tablet, wearable, etc. */
  var formFactor: js.UndefOr[String] = js.undefined
  
  /** The unique opaque id for this model. Use this for invoking the TestExecutionService. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The human-readable name for this device model. Examples: "iPhone 4s", "iPad Mini 2". */
  var name: js.UndefOr[String] = js.undefined
  
  /** Screen density in DPI. */
  var screenDensity: js.UndefOr[Double] = js.undefined
  
  /** Screen size in the horizontal (X) dimension measured in pixels. */
  var screenX: js.UndefOr[Double] = js.undefined
  
  /** Screen size in the vertical (Y) dimension measured in pixels. */
  var screenY: js.UndefOr[Double] = js.undefined
  
  /** The set of iOS major software versions this device supports. */
  var supportedVersionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Tags for this dimension. Examples: "default", "preview", "deprecated". */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object IosModel {
  
  inline def apply(): IosModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosModel]
  }
  
  extension [Self <: IosModel](x: Self) {
    
    inline def setDeviceCapabilities(value: js.Array[String]): Self = StObject.set(x, "deviceCapabilities", value.asInstanceOf[js.Any])
    
    inline def setDeviceCapabilitiesUndefined: Self = StObject.set(x, "deviceCapabilities", js.undefined)
    
    inline def setDeviceCapabilitiesVarargs(value: String*): Self = StObject.set(x, "deviceCapabilities", js.Array(value*))
    
    inline def setFormFactor(value: String): Self = StObject.set(x, "formFactor", value.asInstanceOf[js.Any])
    
    inline def setFormFactorUndefined: Self = StObject.set(x, "formFactor", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setScreenDensity(value: Double): Self = StObject.set(x, "screenDensity", value.asInstanceOf[js.Any])
    
    inline def setScreenDensityUndefined: Self = StObject.set(x, "screenDensity", js.undefined)
    
    inline def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
    
    inline def setScreenXUndefined: Self = StObject.set(x, "screenX", js.undefined)
    
    inline def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
    
    inline def setScreenYUndefined: Self = StObject.set(x, "screenY", js.undefined)
    
    inline def setSupportedVersionIds(value: js.Array[String]): Self = StObject.set(x, "supportedVersionIds", value.asInstanceOf[js.Any])
    
    inline def setSupportedVersionIdsUndefined: Self = StObject.set(x, "supportedVersionIds", js.undefined)
    
    inline def setSupportedVersionIdsVarargs(value: String*): Self = StObject.set(x, "supportedVersionIds", js.Array(value*))
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
