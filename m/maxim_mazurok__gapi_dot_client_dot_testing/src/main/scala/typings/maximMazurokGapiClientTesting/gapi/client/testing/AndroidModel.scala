package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidModel extends StObject {
  
  /** The company that this device is branded with. Example: "Google", "Samsung". */
  var brand: js.UndefOr[String] = js.undefined
  
  /** The name of the industrial design. This corresponds to android.os.Build.DEVICE. */
  var codename: js.UndefOr[String] = js.undefined
  
  /** Whether this device is virtual or physical. */
  var form: js.UndefOr[String] = js.undefined
  
  /** Whether this device is a phone, tablet, wearable, etc. */
  var formFactor: js.UndefOr[String] = js.undefined
  
  /** The unique opaque id for this model. Use this for invoking the TestExecutionService. */
  var id: js.UndefOr[String] = js.undefined
  
  /** True if and only if tests with this model are recorded by stitching together screenshots. See use_low_spec_video_recording in device config. */
  var lowFpsVideoRecording: js.UndefOr[Boolean] = js.undefined
  
  /** The manufacturer of this device. */
  var manufacturer: js.UndefOr[String] = js.undefined
  
  /** The human-readable marketing name for this device model. Examples: "Nexus 5", "Galaxy S5". */
  var name: js.UndefOr[String] = js.undefined
  
  /** Screen density in DPI. This corresponds to ro.sf.lcd_density */
  var screenDensity: js.UndefOr[Double] = js.undefined
  
  /** Screen size in the horizontal (X) dimension measured in pixels. */
  var screenX: js.UndefOr[Double] = js.undefined
  
  /** Screen size in the vertical (Y) dimension measured in pixels. */
  var screenY: js.UndefOr[Double] = js.undefined
  
  /**
    * The list of supported ABIs for this device. This corresponds to either android.os.Build.SUPPORTED_ABIS (for API level 21 and above) or android.os.Build.CPU_ABI/CPU_ABI2. The most
    * preferred ABI is the first element in the list. Elements are optionally prefixed by "version_id:" (where version_id is the id of an AndroidVersion), denoting an ABI that is
    * supported only on a particular version.
    */
  var supportedAbis: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The set of Android versions this device supports. */
  var supportedVersionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Tags for this dimension. Examples: "default", "preview", "deprecated". */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  
  /** URL of a thumbnail image (photo) of the device. e.g. https://lh3.googleusercontent.com/90WcauuJiCYABEl8U0lcZeuS5STUbf2yW... */
  var thumbnailUrl: js.UndefOr[String] = js.undefined
}
object AndroidModel {
  
  inline def apply(): AndroidModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidModel]
  }
  
  extension [Self <: AndroidModel](x: Self) {
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    inline def setCodename(value: String): Self = StObject.set(x, "codename", value.asInstanceOf[js.Any])
    
    inline def setCodenameUndefined: Self = StObject.set(x, "codename", js.undefined)
    
    inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormFactor(value: String): Self = StObject.set(x, "formFactor", value.asInstanceOf[js.Any])
    
    inline def setFormFactorUndefined: Self = StObject.set(x, "formFactor", js.undefined)
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLowFpsVideoRecording(value: Boolean): Self = StObject.set(x, "lowFpsVideoRecording", value.asInstanceOf[js.Any])
    
    inline def setLowFpsVideoRecordingUndefined: Self = StObject.set(x, "lowFpsVideoRecording", js.undefined)
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setScreenDensity(value: Double): Self = StObject.set(x, "screenDensity", value.asInstanceOf[js.Any])
    
    inline def setScreenDensityUndefined: Self = StObject.set(x, "screenDensity", js.undefined)
    
    inline def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
    
    inline def setScreenXUndefined: Self = StObject.set(x, "screenX", js.undefined)
    
    inline def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
    
    inline def setScreenYUndefined: Self = StObject.set(x, "screenY", js.undefined)
    
    inline def setSupportedAbis(value: js.Array[String]): Self = StObject.set(x, "supportedAbis", value.asInstanceOf[js.Any])
    
    inline def setSupportedAbisUndefined: Self = StObject.set(x, "supportedAbis", js.undefined)
    
    inline def setSupportedAbisVarargs(value: String*): Self = StObject.set(x, "supportedAbis", js.Array(value :_*))
    
    inline def setSupportedVersionIds(value: js.Array[String]): Self = StObject.set(x, "supportedVersionIds", value.asInstanceOf[js.Any])
    
    inline def setSupportedVersionIdsUndefined: Self = StObject.set(x, "supportedVersionIds", js.undefined)
    
    inline def setSupportedVersionIdsVarargs(value: String*): Self = StObject.set(x, "supportedVersionIds", js.Array(value :_*))
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    inline def setThumbnailUrl(value: String): Self = StObject.set(x, "thumbnailUrl", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUrlUndefined: Self = StObject.set(x, "thumbnailUrl", js.undefined)
  }
}
