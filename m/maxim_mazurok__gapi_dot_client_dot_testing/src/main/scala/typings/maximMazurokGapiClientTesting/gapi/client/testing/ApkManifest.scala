package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApkManifest extends StObject {
  
  /** User-readable name for the application. */
  var applicationLabel: js.UndefOr[String] = js.undefined
  
  var intentFilters: js.UndefOr[js.Array[IntentFilter]] = js.undefined
  
  /** Maximum API level on which the application is designed to run. */
  var maxSdkVersion: js.UndefOr[Double] = js.undefined
  
  /** Minimum API level required for the application to run. */
  var minSdkVersion: js.UndefOr[Double] = js.undefined
  
  /** Full Java-style package name for this application, e.g. "com.example.foo". */
  var packageName: js.UndefOr[String] = js.undefined
  
  /** Specifies the API Level on which the application is designed to run. */
  var targetSdkVersion: js.UndefOr[Double] = js.undefined
}
object ApkManifest {
  
  inline def apply(): ApkManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApkManifest]
  }
  
  extension [Self <: ApkManifest](x: Self) {
    
    inline def setApplicationLabel(value: String): Self = StObject.set(x, "applicationLabel", value.asInstanceOf[js.Any])
    
    inline def setApplicationLabelUndefined: Self = StObject.set(x, "applicationLabel", js.undefined)
    
    inline def setIntentFilters(value: js.Array[IntentFilter]): Self = StObject.set(x, "intentFilters", value.asInstanceOf[js.Any])
    
    inline def setIntentFiltersUndefined: Self = StObject.set(x, "intentFilters", js.undefined)
    
    inline def setIntentFiltersVarargs(value: IntentFilter*): Self = StObject.set(x, "intentFilters", js.Array(value :_*))
    
    inline def setMaxSdkVersion(value: Double): Self = StObject.set(x, "maxSdkVersion", value.asInstanceOf[js.Any])
    
    inline def setMaxSdkVersionUndefined: Self = StObject.set(x, "maxSdkVersion", js.undefined)
    
    inline def setMinSdkVersion(value: Double): Self = StObject.set(x, "minSdkVersion", value.asInstanceOf[js.Any])
    
    inline def setMinSdkVersionUndefined: Self = StObject.set(x, "minSdkVersion", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setTargetSdkVersion(value: Double): Self = StObject.set(x, "targetSdkVersion", value.asInstanceOf[js.Any])
    
    inline def setTargetSdkVersionUndefined: Self = StObject.set(x, "targetSdkVersion", js.undefined)
  }
}
