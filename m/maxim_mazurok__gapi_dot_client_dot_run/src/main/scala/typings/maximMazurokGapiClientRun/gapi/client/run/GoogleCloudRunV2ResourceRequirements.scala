package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV2ResourceRequirements extends StObject {
  
  /** Determines whether CPU should be throttled or not outside of requests. */
  var cpuIdle: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Only memory and CPU are supported. Note: The only supported values for CPU are '1', '2', and '4'. Setting 4 CPU requires at least 2Gi of memory. The values of the map is string form
    * of the 'quantity' k8s type: https://github.com/kubernetes/kubernetes/blob/master/staging/src/k8s.io/apimachinery/pkg/api/resource/quantity.go
    */
  var limits: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
}
object GoogleCloudRunV2ResourceRequirements {
  
  inline def apply(): GoogleCloudRunV2ResourceRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV2ResourceRequirements]
  }
  
  extension [Self <: GoogleCloudRunV2ResourceRequirements](x: Self) {
    
    inline def setCpuIdle(value: Boolean): Self = StObject.set(x, "cpuIdle", value.asInstanceOf[js.Any])
    
    inline def setCpuIdleUndefined: Self = StObject.set(x, "cpuIdle", js.undefined)
    
    inline def setLimits(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
  }
}
