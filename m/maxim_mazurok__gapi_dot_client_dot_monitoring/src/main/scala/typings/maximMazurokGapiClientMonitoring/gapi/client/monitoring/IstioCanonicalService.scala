package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IstioCanonicalService extends StObject {
  
  /**
    * The name of the canonical service underlying this service. Corresponds to the destination_canonical_service_name metric label in label in Istio metrics
    * (https://cloud.google.com/monitoring/api/metrics_istio).
    */
  var canonicalService: js.UndefOr[String] = js.undefined
  
  /**
    * The namespace of the canonical service underlying this service. Corresponds to the destination_canonical_service_namespace metric label in Istio metrics
    * (https://cloud.google.com/monitoring/api/metrics_istio).
    */
  var canonicalServiceNamespace: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier for the Istio mesh in which this canonical service is defined. Corresponds to the mesh_uid metric label in Istio metrics
    * (https://cloud.google.com/monitoring/api/metrics_istio).
    */
  var meshUid: js.UndefOr[String] = js.undefined
}
object IstioCanonicalService {
  
  inline def apply(): IstioCanonicalService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IstioCanonicalService]
  }
  
  extension [Self <: IstioCanonicalService](x: Self) {
    
    inline def setCanonicalService(value: String): Self = StObject.set(x, "canonicalService", value.asInstanceOf[js.Any])
    
    inline def setCanonicalServiceNamespace(value: String): Self = StObject.set(x, "canonicalServiceNamespace", value.asInstanceOf[js.Any])
    
    inline def setCanonicalServiceNamespaceUndefined: Self = StObject.set(x, "canonicalServiceNamespace", js.undefined)
    
    inline def setCanonicalServiceUndefined: Self = StObject.set(x, "canonicalService", js.undefined)
    
    inline def setMeshUid(value: String): Self = StObject.set(x, "meshUid", value.asInstanceOf[js.Any])
    
    inline def setMeshUidUndefined: Self = StObject.set(x, "meshUid", js.undefined)
  }
}
