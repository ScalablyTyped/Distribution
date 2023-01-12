package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Service extends StObject {
  
  /** Type used for App Engine services. */
  var appEngine: js.UndefOr[AppEngine] = js.undefined
  
  /** Type used for Cloud Endpoints services. */
  var cloudEndpoints: js.UndefOr[CloudEndpoints] = js.undefined
  
  /** Type used for Cloud Run services. */
  var cloudRun: js.UndefOr[CloudRun] = js.undefined
  
  /** Type used for Istio services that live in a Kubernetes cluster. */
  var clusterIstio: js.UndefOr[ClusterIstio] = js.undefined
  
  /** Custom service type. */
  var custom: js.UndefOr[Any] = js.undefined
  
  /** Name used for UI elements listing this Service. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Type used for GKE Namespaces. */
  var gkeNamespace: js.UndefOr[GkeNamespace] = js.undefined
  
  /** Type used for GKE Services (the Kubernetes concept of a service). */
  var gkeService: js.UndefOr[GkeService] = js.undefined
  
  /** Type used for GKE Workloads. */
  var gkeWorkload: js.UndefOr[GkeWorkload] = js.undefined
  
  /** Type used for canonical services scoped to an Istio mesh. Metrics for Istio are documented here (https://istio.io/latest/docs/reference/config/metrics/) */
  var istioCanonicalService: js.UndefOr[IstioCanonicalService] = js.undefined
  
  /** Type used for Istio services scoped to an Istio mesh. */
  var meshIstio: js.UndefOr[MeshIstio] = js.undefined
  
  /** Resource name for this Service. The format is: projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID] */
  var name: js.UndefOr[String] = js.undefined
  
  /** Configuration for how to query telemetry on a Service. */
  var telemetry: js.UndefOr[Telemetry] = js.undefined
  
  /**
    * Labels which have been used to annotate the service. Label keys must start with a letter. Label keys and values may contain lowercase letters, numbers, underscores, and dashes.
    * Label keys and values have a maximum length of 63 characters, and must be less than 128 bytes in size. Up to 64 label entries may be stored. For labels which do not have a semantic
    * value, the empty string may be supplied for the label value.
    */
  var userLabels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
}
object Service {
  
  inline def apply(): Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Service]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
    
    inline def setAppEngine(value: AppEngine): Self = StObject.set(x, "appEngine", value.asInstanceOf[js.Any])
    
    inline def setAppEngineUndefined: Self = StObject.set(x, "appEngine", js.undefined)
    
    inline def setCloudEndpoints(value: CloudEndpoints): Self = StObject.set(x, "cloudEndpoints", value.asInstanceOf[js.Any])
    
    inline def setCloudEndpointsUndefined: Self = StObject.set(x, "cloudEndpoints", js.undefined)
    
    inline def setCloudRun(value: CloudRun): Self = StObject.set(x, "cloudRun", value.asInstanceOf[js.Any])
    
    inline def setCloudRunUndefined: Self = StObject.set(x, "cloudRun", js.undefined)
    
    inline def setClusterIstio(value: ClusterIstio): Self = StObject.set(x, "clusterIstio", value.asInstanceOf[js.Any])
    
    inline def setClusterIstioUndefined: Self = StObject.set(x, "clusterIstio", js.undefined)
    
    inline def setCustom(value: Any): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGkeNamespace(value: GkeNamespace): Self = StObject.set(x, "gkeNamespace", value.asInstanceOf[js.Any])
    
    inline def setGkeNamespaceUndefined: Self = StObject.set(x, "gkeNamespace", js.undefined)
    
    inline def setGkeService(value: GkeService): Self = StObject.set(x, "gkeService", value.asInstanceOf[js.Any])
    
    inline def setGkeServiceUndefined: Self = StObject.set(x, "gkeService", js.undefined)
    
    inline def setGkeWorkload(value: GkeWorkload): Self = StObject.set(x, "gkeWorkload", value.asInstanceOf[js.Any])
    
    inline def setGkeWorkloadUndefined: Self = StObject.set(x, "gkeWorkload", js.undefined)
    
    inline def setIstioCanonicalService(value: IstioCanonicalService): Self = StObject.set(x, "istioCanonicalService", value.asInstanceOf[js.Any])
    
    inline def setIstioCanonicalServiceUndefined: Self = StObject.set(x, "istioCanonicalService", js.undefined)
    
    inline def setMeshIstio(value: MeshIstio): Self = StObject.set(x, "meshIstio", value.asInstanceOf[js.Any])
    
    inline def setMeshIstioUndefined: Self = StObject.set(x, "meshIstio", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTelemetry(value: Telemetry): Self = StObject.set(x, "telemetry", value.asInstanceOf[js.Any])
    
    inline def setTelemetryUndefined: Self = StObject.set(x, "telemetry", js.undefined)
    
    inline def setUserLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "userLabels", value.asInstanceOf[js.Any])
    
    inline def setUserLabelsUndefined: Self = StObject.set(x, "userLabels", js.undefined)
  }
}
