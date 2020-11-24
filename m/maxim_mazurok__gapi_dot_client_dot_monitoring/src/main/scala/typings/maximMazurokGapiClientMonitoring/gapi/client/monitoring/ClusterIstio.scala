package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterIstio extends js.Object {
  
  /** The name of the Kubernetes cluster in which this Istio service is defined. Corresponds to the cluster_name resource label in k8s_cluster resources. */
  var clusterName: js.UndefOr[String] = js.native
  
  /** The location of the Kubernetes cluster in which this Istio service is defined. Corresponds to the location resource label in k8s_cluster resources. */
  var location: js.UndefOr[String] = js.native
  
  /** The name of the Istio service underlying this service. Corresponds to the destination_service_name metric label in Istio metrics. */
  var serviceName: js.UndefOr[String] = js.native
  
  /** The namespace of the Istio service underlying this service. Corresponds to the destination_service_namespace metric label in Istio metrics. */
  var serviceNamespace: js.UndefOr[String] = js.native
}
object ClusterIstio {
  
  @scala.inline
  def apply(): ClusterIstio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterIstio]
  }
  
  @scala.inline
  implicit class ClusterIstioOps[Self <: ClusterIstio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClusterName(value: String): Self = this.set("clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterName: Self = this.set("clusterName", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
    
    @scala.inline
    def setServiceNamespace(value: String): Self = this.set("serviceNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceNamespace: Self = this.set("serviceNamespace", js.undefined)
  }
}
