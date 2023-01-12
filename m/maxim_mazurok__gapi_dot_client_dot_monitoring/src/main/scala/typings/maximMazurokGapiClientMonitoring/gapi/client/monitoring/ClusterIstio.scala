package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterIstio extends StObject {
  
  /** The name of the Kubernetes cluster in which this Istio service is defined. Corresponds to the cluster_name resource label in k8s_cluster resources. */
  var clusterName: js.UndefOr[String] = js.undefined
  
  /** The location of the Kubernetes cluster in which this Istio service is defined. Corresponds to the location resource label in k8s_cluster resources. */
  var location: js.UndefOr[String] = js.undefined
  
  /** The name of the Istio service underlying this service. Corresponds to the destination_service_name metric label in Istio metrics. */
  var serviceName: js.UndefOr[String] = js.undefined
  
  /** The namespace of the Istio service underlying this service. Corresponds to the destination_service_namespace metric label in Istio metrics. */
  var serviceNamespace: js.UndefOr[String] = js.undefined
}
object ClusterIstio {
  
  inline def apply(): ClusterIstio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterIstio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterIstio] (val x: Self) extends AnyVal {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setServiceNamespace(value: String): Self = StObject.set(x, "serviceNamespace", value.asInstanceOf[js.Any])
    
    inline def setServiceNamespaceUndefined: Self = StObject.set(x, "serviceNamespace", js.undefined)
  }
}
