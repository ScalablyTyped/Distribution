package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshIstio extends StObject {
  
  /** Identifier for the mesh in which this Istio service is defined. Corresponds to the mesh_uid metric label in Istio metrics. */
  var meshUid: js.UndefOr[String] = js.undefined
  
  /** The name of the Istio service underlying this service. Corresponds to the destination_service_name metric label in Istio metrics. */
  var serviceName: js.UndefOr[String] = js.undefined
  
  /** The namespace of the Istio service underlying this service. Corresponds to the destination_service_namespace metric label in Istio metrics. */
  var serviceNamespace: js.UndefOr[String] = js.undefined
}
object MeshIstio {
  
  inline def apply(): MeshIstio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshIstio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeshIstio] (val x: Self) extends AnyVal {
    
    inline def setMeshUid(value: String): Self = StObject.set(x, "meshUid", value.asInstanceOf[js.Any])
    
    inline def setMeshUidUndefined: Self = StObject.set(x, "meshUid", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setServiceNamespace(value: String): Self = StObject.set(x, "serviceNamespace", value.asInstanceOf[js.Any])
    
    inline def setServiceNamespaceUndefined: Self = StObject.set(x, "serviceNamespace", js.undefined)
  }
}
