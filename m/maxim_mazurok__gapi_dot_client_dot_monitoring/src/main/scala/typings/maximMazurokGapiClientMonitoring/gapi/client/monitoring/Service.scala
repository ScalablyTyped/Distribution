package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Service extends StObject {
  
  /** Type used for App Engine services. */
  var appEngine: js.UndefOr[AppEngine] = js.undefined
  
  /** Type used for Cloud Endpoints services. */
  var cloudEndpoints: js.UndefOr[CloudEndpoints] = js.undefined
  
  /** Type used for Istio services that live in a Kubernetes cluster. */
  var clusterIstio: js.UndefOr[ClusterIstio] = js.undefined
  
  /** Custom service type. */
  var custom: js.UndefOr[js.Any] = js.undefined
  
  /** Name used for UI elements listing this Service. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Type used for Istio services scoped to an Istio mesh. */
  var meshIstio: js.UndefOr[MeshIstio] = js.undefined
  
  /** Resource name for this Service. The format is: projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID] */
  var name: js.UndefOr[String] = js.undefined
  
  /** Configuration for how to query telemetry on a Service. */
  var telemetry: js.UndefOr[Telemetry] = js.undefined
}
object Service {
  
  inline def apply(): Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Service]
  }
  
  extension [Self <: Service](x: Self) {
    
    inline def setAppEngine(value: AppEngine): Self = StObject.set(x, "appEngine", value.asInstanceOf[js.Any])
    
    inline def setAppEngineUndefined: Self = StObject.set(x, "appEngine", js.undefined)
    
    inline def setCloudEndpoints(value: CloudEndpoints): Self = StObject.set(x, "cloudEndpoints", value.asInstanceOf[js.Any])
    
    inline def setCloudEndpointsUndefined: Self = StObject.set(x, "cloudEndpoints", js.undefined)
    
    inline def setClusterIstio(value: ClusterIstio): Self = StObject.set(x, "clusterIstio", value.asInstanceOf[js.Any])
    
    inline def setClusterIstioUndefined: Self = StObject.set(x, "clusterIstio", js.undefined)
    
    inline def setCustom(value: js.Any): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setMeshIstio(value: MeshIstio): Self = StObject.set(x, "meshIstio", value.asInstanceOf[js.Any])
    
    inline def setMeshIstioUndefined: Self = StObject.set(x, "meshIstio", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTelemetry(value: Telemetry): Self = StObject.set(x, "telemetry", value.asInstanceOf[js.Any])
    
    inline def setTelemetryUndefined: Self = StObject.set(x, "telemetry", js.undefined)
  }
}
