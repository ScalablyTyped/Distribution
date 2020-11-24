package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Service extends js.Object {
  
  /** Type used for App Engine services. */
  var appEngine: js.UndefOr[AppEngine] = js.native
  
  /** Type used for Cloud Endpoints services. */
  var cloudEndpoints: js.UndefOr[CloudEndpoints] = js.native
  
  /** Type used for Istio services that live in a Kubernetes cluster. */
  var clusterIstio: js.UndefOr[ClusterIstio] = js.native
  
  /** Custom service type. */
  var custom: js.UndefOr[js.Any] = js.native
  
  /** Name used for UI elements listing this Service. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Type used for Istio services scoped to an Istio mesh. */
  var meshIstio: js.UndefOr[MeshIstio] = js.native
  
  /** Resource name for this Service. The format is: projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID] */
  var name: js.UndefOr[String] = js.native
  
  /** Configuration for how to query telemetry on a Service. */
  var telemetry: js.UndefOr[Telemetry] = js.native
}
object Service {
  
  @scala.inline
  def apply(): Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Service]
  }
  
  @scala.inline
  implicit class ServiceOps[Self <: Service] (val x: Self) extends AnyVal {
    
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
    def setAppEngine(value: AppEngine): Self = this.set("appEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppEngine: Self = this.set("appEngine", js.undefined)
    
    @scala.inline
    def setCloudEndpoints(value: CloudEndpoints): Self = this.set("cloudEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudEndpoints: Self = this.set("cloudEndpoints", js.undefined)
    
    @scala.inline
    def setClusterIstio(value: ClusterIstio): Self = this.set("clusterIstio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterIstio: Self = this.set("clusterIstio", js.undefined)
    
    @scala.inline
    def setCustom(value: js.Any): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setMeshIstio(value: MeshIstio): Self = this.set("meshIstio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeshIstio: Self = this.set("meshIstio", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTelemetry(value: Telemetry): Self = this.set("telemetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTelemetry: Self = this.set("telemetry", js.undefined)
  }
}
