package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1DiskConfig extends StObject {
  
  /** Size in GB of the boot disk (default is 100GB). */
  var bootDiskSizeGb: js.UndefOr[Double] = js.undefined
  
  /** Type of the boot disk (default is "pd-ssd"). Valid values: "pd-ssd" (Persistent Disk Solid State Drive) or "pd-standard" (Persistent Disk Hard Disk Drive). */
  var bootDiskType: js.UndefOr[String] = js.undefined
}
object GoogleCloudMlV1DiskConfig {
  
  inline def apply(): GoogleCloudMlV1DiskConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1DiskConfig]
  }
  
  extension [Self <: GoogleCloudMlV1DiskConfig](x: Self) {
    
    inline def setBootDiskSizeGb(value: Double): Self = StObject.set(x, "bootDiskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setBootDiskSizeGbUndefined: Self = StObject.set(x, "bootDiskSizeGb", js.undefined)
    
    inline def setBootDiskType(value: String): Self = StObject.set(x, "bootDiskType", value.asInstanceOf[js.Any])
    
    inline def setBootDiskTypeUndefined: Self = StObject.set(x, "bootDiskType", js.undefined)
  }
}
