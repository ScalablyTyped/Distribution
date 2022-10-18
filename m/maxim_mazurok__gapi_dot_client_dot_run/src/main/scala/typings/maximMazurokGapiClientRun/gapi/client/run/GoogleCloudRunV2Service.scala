package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV2Service extends StObject {
  
  /**
    * Unstructured key value map that may be set by external tools to store and arbitrary metadata. They are not queryable and should be preserved when modifying objects. Cloud Run will
    * populate some annotations using 'run.googleapis.com' or 'serving.knative.dev' namespaces. This field follows Kubernetes annotations' namespacing, limits, and rules. More info:
    * https://kubernetes.io/docs/user-guide/annotations
    */
  var annotations: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Settings for the Binary Authorization feature. */
  var binaryAuthorization: js.UndefOr[GoogleCloudRunV2BinaryAuthorization] = js.undefined
  
  /** Arbitrary identifier for the API client. */
  var client: js.UndefOr[String] = js.undefined
  
  /** Arbitrary version identifier for the API client. */
  var clientVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The Conditions of all other associated sub-resources. They contain additional diagnostics information in case the Service does not reach its Serving state. See comments
    * in `reconciling` for additional information on reconciliation process in Cloud Run.
    */
  var conditions: js.UndefOr[js.Array[GoogleCloudRunV2Condition]] = js.undefined
  
  /** Output only. The creation time. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. Email address of the authenticated creator. */
  var creator: js.UndefOr[String] = js.undefined
  
  /** Output only. The deletion time. */
  var deleteTime: js.UndefOr[String] = js.undefined
  
  /** User-provided description of the Service. This field currently has a 512-character limit. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Output only. A system-generated fingerprint for this version of the resource. May be used to detect modification conflict during updates. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Output only. For a deleted resource, the time after which it will be permamently deleted. */
  var expireTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. A number that monotonically increases every time the user modifies the desired state. Please note that unlike v1, this is an int64 value. As with most Google APIs, its
    * JSON representation will be a `string` instead of an `integer`.
    */
  var generation: js.UndefOr[String] = js.undefined
  
  /** Provides the ingress settings for this Service. On output, returns the currently observed ingress settings, or INGRESS_TRAFFIC_UNSPECIFIED if no revision is active. */
  var ingress: js.UndefOr[String] = js.undefined
  
  /**
    * Map of string keys and values that can be used to organize and categorize objects. User-provided labels are shared with Google's billing system, so they can be used to filter, or
    * break down billing charges by team, component, environment, state, etc. For more information, visit https://cloud.google.com/resource-manager/docs/creating-managing-labels or
    * https://cloud.google.com/run/docs/configuring/labels Cloud Run will populate some labels with 'run.googleapis.com' or 'serving.knative.dev' namespaces. Those labels are read-only,
    * and user changes will not be preserved.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Output only. Email address of the last authenticated modifier. */
  var lastModifier: js.UndefOr[String] = js.undefined
  
  /** Output only. Name of the last created revision. See comments in `reconciling` for additional information on reconciliation process in Cloud Run. */
  var latestCreatedRevision: js.UndefOr[String] = js.undefined
  
  /** Output only. Name of the latest revision that is serving traffic. See comments in `reconciling` for additional information on reconciliation process in Cloud Run. */
  var latestReadyRevision: js.UndefOr[String] = js.undefined
  
  /**
    * The launch stage as defined by [Google Cloud Platform Launch Stages](https://cloud.google.com/terms/launch-stages). Cloud Run supports `ALPHA`, `BETA`, and `GA`. If no value is
    * specified, GA is assumed.
    */
  var launchStage: js.UndefOr[String] = js.undefined
  
  /**
    * The fully qualified name of this Service. In CreateServiceRequest, this field is ignored, and instead composed from CreateServiceRequest.parent and CreateServiceRequest.service_id.
    * Format: projects/{project}/locations/{location}/services/{service_id}
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The generation of this Service currently serving traffic. See comments in `reconciling` for additional information on reconciliation process in Cloud Run. Please note
    * that unlike v1, this is an int64 value. As with most Google APIs, its JSON representation will be a `string` instead of an `integer`.
    */
  var observedGeneration: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Returns true if the Service is currently being acted upon by the system to bring it into the desired state. When a new Service is created, or an existing one is
    * updated, Cloud Run will asynchronously perform all necessary steps to bring the Service to the desired serving state. This process is called reconciliation. While reconciliation is
    * in process, `observed_generation`, `latest_ready_revison`, `traffic_statuses`, and `uri` will have transient values that might mismatch the intended state: Once reconciliation is
    * over (and this field is false), there are two possible outcomes: reconciliation succeeded and the serving state matches the Service, or there was an error, and reconciliation
    * failed. This state can be found in `terminal_condition.state`. If reconciliation succeeded, the following fields will match: `traffic` and `traffic_statuses`, `observed_generation`
    * and `generation`, `latest_ready_revision` and `latest_created_revision`. If reconciliation failed, `traffic_statuses`, `observed_generation`, and `latest_ready_revision` will have
    * the state of the last serving revision, or empty for newly created Services. Additional information on the failure can be found in `terminal_condition` and `conditions`.
    */
  var reconciling: js.UndefOr[Boolean] = js.undefined
  
  /** Required. The template used to create revisions for this Service. */
  var template: js.UndefOr[GoogleCloudRunV2RevisionTemplate] = js.undefined
  
  /**
    * Output only. The Condition of this Service, containing its readiness status, and detailed error information in case it did not reach a serving state. See comments in `reconciling`
    * for additional information on reconciliation process in Cloud Run.
    */
  var terminalCondition: js.UndefOr[GoogleCloudRunV2Condition] = js.undefined
  
  /**
    * Specifies how to distribute traffic over a collection of Revisions belonging to the Service. If traffic is empty or not provided, defaults to 100% traffic to the latest `Ready`
    * Revision.
    */
  var traffic: js.UndefOr[js.Array[GoogleCloudRunV2TrafficTarget]] = js.undefined
  
  /** Output only. Detailed status information for corresponding traffic targets. See comments in `reconciling` for additional information on reconciliation process in Cloud Run. */
  var trafficStatuses: js.UndefOr[js.Array[GoogleCloudRunV2TrafficTargetStatus]] = js.undefined
  
  /** Output only. Server assigned unique identifier for the trigger. The value is a UUID4 string and guaranteed to remain unchanged until the resource is deleted. */
  var uid: js.UndefOr[String] = js.undefined
  
  /** Output only. The last-modified time. */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The main URI in which this Service is serving traffic. */
  var uri: js.UndefOr[String] = js.undefined
}
object GoogleCloudRunV2Service {
  
  inline def apply(): GoogleCloudRunV2Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV2Service]
  }
  
  extension [Self <: GoogleCloudRunV2Service](x: Self) {
    
    inline def setAnnotations(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setBinaryAuthorization(value: GoogleCloudRunV2BinaryAuthorization): Self = StObject.set(x, "binaryAuthorization", value.asInstanceOf[js.Any])
    
    inline def setBinaryAuthorizationUndefined: Self = StObject.set(x, "binaryAuthorization", js.undefined)
    
    inline def setClient(value: String): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setClientVersion(value: String): Self = StObject.set(x, "clientVersion", value.asInstanceOf[js.Any])
    
    inline def setClientVersionUndefined: Self = StObject.set(x, "clientVersion", js.undefined)
    
    inline def setConditions(value: js.Array[GoogleCloudRunV2Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: GoogleCloudRunV2Condition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
    
    inline def setDeleteTime(value: String): Self = StObject.set(x, "deleteTime", value.asInstanceOf[js.Any])
    
    inline def setDeleteTimeUndefined: Self = StObject.set(x, "deleteTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    inline def setIngress(value: String): Self = StObject.set(x, "ingress", value.asInstanceOf[js.Any])
    
    inline def setIngressUndefined: Self = StObject.set(x, "ingress", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLastModifier(value: String): Self = StObject.set(x, "lastModifier", value.asInstanceOf[js.Any])
    
    inline def setLastModifierUndefined: Self = StObject.set(x, "lastModifier", js.undefined)
    
    inline def setLatestCreatedRevision(value: String): Self = StObject.set(x, "latestCreatedRevision", value.asInstanceOf[js.Any])
    
    inline def setLatestCreatedRevisionUndefined: Self = StObject.set(x, "latestCreatedRevision", js.undefined)
    
    inline def setLatestReadyRevision(value: String): Self = StObject.set(x, "latestReadyRevision", value.asInstanceOf[js.Any])
    
    inline def setLatestReadyRevisionUndefined: Self = StObject.set(x, "latestReadyRevision", js.undefined)
    
    inline def setLaunchStage(value: String): Self = StObject.set(x, "launchStage", value.asInstanceOf[js.Any])
    
    inline def setLaunchStageUndefined: Self = StObject.set(x, "launchStage", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setObservedGeneration(value: String): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    inline def setObservedGenerationUndefined: Self = StObject.set(x, "observedGeneration", js.undefined)
    
    inline def setReconciling(value: Boolean): Self = StObject.set(x, "reconciling", value.asInstanceOf[js.Any])
    
    inline def setReconcilingUndefined: Self = StObject.set(x, "reconciling", js.undefined)
    
    inline def setTemplate(value: GoogleCloudRunV2RevisionTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTerminalCondition(value: GoogleCloudRunV2Condition): Self = StObject.set(x, "terminalCondition", value.asInstanceOf[js.Any])
    
    inline def setTerminalConditionUndefined: Self = StObject.set(x, "terminalCondition", js.undefined)
    
    inline def setTraffic(value: js.Array[GoogleCloudRunV2TrafficTarget]): Self = StObject.set(x, "traffic", value.asInstanceOf[js.Any])
    
    inline def setTrafficStatuses(value: js.Array[GoogleCloudRunV2TrafficTargetStatus]): Self = StObject.set(x, "trafficStatuses", value.asInstanceOf[js.Any])
    
    inline def setTrafficStatusesUndefined: Self = StObject.set(x, "trafficStatuses", js.undefined)
    
    inline def setTrafficStatusesVarargs(value: GoogleCloudRunV2TrafficTargetStatus*): Self = StObject.set(x, "trafficStatuses", js.Array(value*))
    
    inline def setTrafficUndefined: Self = StObject.set(x, "traffic", js.undefined)
    
    inline def setTrafficVarargs(value: GoogleCloudRunV2TrafficTarget*): Self = StObject.set(x, "traffic", js.Array(value*))
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
