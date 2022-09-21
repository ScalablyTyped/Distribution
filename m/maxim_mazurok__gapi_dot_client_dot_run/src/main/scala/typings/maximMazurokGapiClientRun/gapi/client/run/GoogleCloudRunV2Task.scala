package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV2Task extends StObject {
  
  /** KRM-style annotations for the resource. */
  var annotations: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientRun.maximMazurokGapiClientRunStrings.GoogleCloudRunV2Task & TopLevel[Any]
  ] = js.undefined
  
  /** Output only. Represents time when the Task was completed. It is not guaranteed to be set in happens-before order across separate operations. */
  var completionTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The Condition of this Task, containing its readiness status, and detailed error information in case it did not reach the desired state. */
  var conditions: js.UndefOr[js.Array[GoogleCloudRunV2Condition]] = js.undefined
  
  /** Holds the single container that defines the unit of execution for this task. */
  var containers: js.UndefOr[js.Array[GoogleCloudRunV2Container]] = js.undefined
  
  /** Output only. Represents time when the task was created by the job controller. It is not guaranteed to be set in happens-before order across separate operations. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. For a deleted resource, the deletion time. It is only populated as a response to a Delete request. */
  var deleteTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. A reference to a customer managed encryption key (CMEK) to use to encrypt this container image. For more information, go to
    * https://cloud.google.com/run/docs/securing/using-cmek
    */
  var encryptionKey: js.UndefOr[String] = js.undefined
  
  /** Output only. A system-generated fingerprint for this version of the resource. May be used to detect modification conflict during updates. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Output only. The name of the parent Execution. */
  var execution: js.UndefOr[String] = js.undefined
  
  /** The execution environment being used to host this Task. */
  var executionEnvironment: js.UndefOr[String] = js.undefined
  
  /** Output only. For a deleted resource, the time after which it will be permamently deleted. It is only populated as a response to a Delete request. */
  var expireTime: js.UndefOr[String] = js.undefined
  
  /** Output only. A number that monotonically increases every time the user modifies the desired state. */
  var generation: js.UndefOr[String] = js.undefined
  
  /** Output only. Index of the Task, unique per execution, and beginning at 0. */
  var index: js.UndefOr[Double] = js.undefined
  
  /** Output only. The name of the parent Job. */
  var job: js.UndefOr[String] = js.undefined
  
  /**
    * KRM-style labels for the resource. User-provided labels are shared with Google's billing system, so they can be used to filter, or break down billing charges by team, component,
    * environment, state, etc. For more information, visit https://cloud.google.com/resource-manager/docs/creating-managing-labels or https://cloud.google.com/run/docs/configuring/labels
    * Cloud Run will populate some labels with 'run.googleapis.com' or 'serving.knative.dev' namespaces. Those labels are read-only, and user changes will not be preserved.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientRun.maximMazurokGapiClientRunStrings.GoogleCloudRunV2Task & TopLevel[Any]
  ] = js.undefined
  
  /** Output only. Result of the last attempt of this Task. */
  var lastAttemptResult: js.UndefOr[GoogleCloudRunV2TaskAttemptResult] = js.undefined
  
  /**
    * Set the launch stage to a preview stage on write to allow use of preview features in that stage. On read, describes whether the resource uses preview features. Launch Stages are
    * defined at [Google Cloud Platform Launch Stages](https://cloud.google.com/terms/launch-stages).
    */
  var launchStage: js.UndefOr[String] = js.undefined
  
  /** Number of retries allowed per Task, before marking this Task failed. */
  var maxRetries: js.UndefOr[Double] = js.undefined
  
  /** Output only. The unique name of this Task. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The generation of this Task. See comments in `Job.reconciling` for additional information on reconciliation process in Cloud Run. */
  var observedGeneration: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Indicates whether the resource's reconciliation is still in progress. See comments in `Job.reconciling` for additional information on reconciliation process in Cloud
    * Run.
    */
  var reconciling: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. The number of times this Task was retried. Tasks are retried when they fail up to the maxRetries limit. */
  var retried: js.UndefOr[Double] = js.undefined
  
  /**
    * Email address of the IAM service account associated with the Task of a Job. The service account represents the identity of the running task, and determines what permissions the task
    * has. If not provided, the task will use the project's default service account.
    */
  var serviceAccount: js.UndefOr[String] = js.undefined
  
  /** Output only. Represents time when the task started to run. It is not guaranteed to be set in happens-before order across separate operations. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * Max allowed time duration the Task may be active before the system will actively try to mark it failed and kill associated containers. This applies per attempt of a task, meaning
    * each retry can run for the full timeout.
    */
  var timeout: js.UndefOr[String] = js.undefined
  
  /** Output only. Server assigned unique identifier for the Task. The value is a UUID4 string and guaranteed to remain unchanged until the resource is deleted. */
  var uid: js.UndefOr[String] = js.undefined
  
  /** Output only. The last-modified time. */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /** A list of Volumes to make available to containers. */
  var volumes: js.UndefOr[js.Array[GoogleCloudRunV2Volume]] = js.undefined
  
  /** Output only. VPC Access configuration to use for this Task. For more information, visit https://cloud.google.com/run/docs/configuring/connecting-vpc. */
  var vpcAccess: js.UndefOr[GoogleCloudRunV2VpcAccess] = js.undefined
}
object GoogleCloudRunV2Task {
  
  inline def apply(): GoogleCloudRunV2Task = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV2Task]
  }
  
  extension [Self <: GoogleCloudRunV2Task](x: Self) {
    
    inline def setAnnotations(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientRun.maximMazurokGapiClientRunStrings.GoogleCloudRunV2Task & TopLevel[Any]
    ): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setCompletionTime(value: String): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "completionTime", js.undefined)
    
    inline def setConditions(value: js.Array[GoogleCloudRunV2Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: GoogleCloudRunV2Condition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setContainers(value: js.Array[GoogleCloudRunV2Container]): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    inline def setContainersVarargs(value: GoogleCloudRunV2Container*): Self = StObject.set(x, "containers", js.Array(value*))
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDeleteTime(value: String): Self = StObject.set(x, "deleteTime", value.asInstanceOf[js.Any])
    
    inline def setDeleteTimeUndefined: Self = StObject.set(x, "deleteTime", js.undefined)
    
    inline def setEncryptionKey(value: String): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setExecution(value: String): Self = StObject.set(x, "execution", value.asInstanceOf[js.Any])
    
    inline def setExecutionEnvironment(value: String): Self = StObject.set(x, "executionEnvironment", value.asInstanceOf[js.Any])
    
    inline def setExecutionEnvironmentUndefined: Self = StObject.set(x, "executionEnvironment", js.undefined)
    
    inline def setExecutionUndefined: Self = StObject.set(x, "execution", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setJob(value: String): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientRun.maximMazurokGapiClientRunStrings.GoogleCloudRunV2Task & TopLevel[Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLastAttemptResult(value: GoogleCloudRunV2TaskAttemptResult): Self = StObject.set(x, "lastAttemptResult", value.asInstanceOf[js.Any])
    
    inline def setLastAttemptResultUndefined: Self = StObject.set(x, "lastAttemptResult", js.undefined)
    
    inline def setLaunchStage(value: String): Self = StObject.set(x, "launchStage", value.asInstanceOf[js.Any])
    
    inline def setLaunchStageUndefined: Self = StObject.set(x, "launchStage", js.undefined)
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setObservedGeneration(value: String): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    inline def setObservedGenerationUndefined: Self = StObject.set(x, "observedGeneration", js.undefined)
    
    inline def setReconciling(value: Boolean): Self = StObject.set(x, "reconciling", value.asInstanceOf[js.Any])
    
    inline def setReconcilingUndefined: Self = StObject.set(x, "reconciling", js.undefined)
    
    inline def setRetried(value: Double): Self = StObject.set(x, "retried", value.asInstanceOf[js.Any])
    
    inline def setRetriedUndefined: Self = StObject.set(x, "retried", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVolumes(value: js.Array[GoogleCloudRunV2Volume]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
    
    inline def setVolumesVarargs(value: GoogleCloudRunV2Volume*): Self = StObject.set(x, "volumes", js.Array(value*))
    
    inline def setVpcAccess(value: GoogleCloudRunV2VpcAccess): Self = StObject.set(x, "vpcAccess", value.asInstanceOf[js.Any])
    
    inline def setVpcAccessUndefined: Self = StObject.set(x, "vpcAccess", js.undefined)
  }
}
