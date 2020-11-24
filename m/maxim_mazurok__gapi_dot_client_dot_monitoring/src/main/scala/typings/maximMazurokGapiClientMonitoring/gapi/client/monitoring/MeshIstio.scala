package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshIstio extends js.Object {
  
  /** Identifier for the mesh in which this Istio service is defined. Corresponds to the mesh_uid metric label in Istio metrics. */
  var meshUid: js.UndefOr[String] = js.native
  
  /** The name of the Istio service underlying this service. Corresponds to the destination_service_name metric label in Istio metrics. */
  var serviceName: js.UndefOr[String] = js.native
  
  /** The namespace of the Istio service underlying this service. Corresponds to the destination_service_namespace metric label in Istio metrics. */
  var serviceNamespace: js.UndefOr[String] = js.native
}
object MeshIstio {
  
  @scala.inline
  def apply(): MeshIstio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshIstio]
  }
  
  @scala.inline
  implicit class MeshIstioOps[Self <: MeshIstio] (val x: Self) extends AnyVal {
    
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
    def setMeshUid(value: String): Self = this.set("meshUid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeshUid: Self = this.set("meshUid", js.undefined)
    
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
