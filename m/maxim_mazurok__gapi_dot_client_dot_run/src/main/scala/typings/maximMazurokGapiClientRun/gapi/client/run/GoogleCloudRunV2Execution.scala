package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV2Execution extends StObject {
  
  /** KRM-style annotations for the resource. */
  var annotations: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientRun.maximMazurokGapiClientRunStrings.GoogleCloudRunV2Execution & TopLevel[Any]
  ] = js.undefined
  
  /** Output only. Represents time when the execution was completed. It is not guaranteed to be set in happens-before order across separate operations. */
  var completionTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The Condition of this Execution, containing its readiness status, and detailed error information in case it did not reach the desired state. */
  var conditions: js.UndefOr[js.Array[GoogleCloudRunV2Condition]] = js.undefined
  
  /** Output only. Represents time when the execution was acknowledged by the execution controller. It is not guaranteed to be set in happens-before order across separate operations. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. For a deleted resource, the deletion time. It is only populated as a response to a Delete request. */
  var deleteTime: js.UndefOr[String] = js.undefined
  
  /** Output only. A system-generated fingerprint for this version of the resource. May be used to detect modification conflict during updates. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Output only. For a deleted resource, the time after which it will be permamently deleted. It is only populated as a response to a Delete request. */
  var expireTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The number of tasks which reached phase Failed. */
  var failedCount: js.UndefOr[Double] = js.undefined
  
  /** Output only. A number that monotonically increases every time the user modifies the desired state. */
  var generation: js.UndefOr[String] = js.undefined
  
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
    */ typings.maximMazurokGapiClientRun.maximMazurokGapiClientRunStrings.GoogleCloudRunV2Execution & TopLevel[Any]
  ] = js.undefined
  
  /**
    * Set the launch stage to a preview stage on write to allow use of preview features in that stage. On read, describes whether the resource uses preview features. Launch Stages are
    * defined at [Google Cloud Platform Launch Stages](https://cloud.google.com/terms/launch-stages).
    */
  var launchStage: js.UndefOr[String] = js.undefined
  
  /** Output only. The unique name of this Execution. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The generation of this Execution. See comments in `reconciling` for additional information on reconciliation process in Cloud Run. */
  var observedGeneration: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Specifies the maximum desired number of tasks the execution should run at any given time. Must be <= task_count. The actual number of tasks running in steady state will
    * be less than this number when ((.spec.task_count - .status.successful) < .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
    */
  var parallelism: js.UndefOr[Double] = js.undefined
  
  /**
    * Output only. Indicates whether the resource's reconciliation is still in progress. See comments in `Job.reconciling` for additional information on reconciliation process in Cloud
    * Run.
    */
  var reconciling: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. The number of actively running tasks. */
  var runningCount: js.UndefOr[Double] = js.undefined
  
  /** Output only. Represents time when the execution started to run. It is not guaranteed to be set in happens-before order across separate operations. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The number of tasks which reached phase Succeeded. */
  var succeededCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Output only. Specifies the desired number of tasks the execution should run. Setting to 1 means that parallelism is limited to 1 and the success of that task signals the success of
    * the execution. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
    */
  var taskCount: js.UndefOr[Double] = js.undefined
  
  /** Output only. Describes the task(s) that will be created when executing an execution. */
  var template: js.UndefOr[GoogleCloudRunV2TaskTemplate] = js.undefined
  
  /** Output only. Server assigned unique identifier for the Execution. The value is a UUID4 string and guaranteed to remain unchanged until the resource is deleted. */
  var uid: js.UndefOr[String] = js.undefined
  
  /** Output only. The last-modified time. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object GoogleCloudRunV2Execution {
  
  inline def apply(): GoogleCloudRunV2Execution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV2Execution]
  }
  
  extension [Self <: GoogleCloudRunV2Execution](x: Self) {
    
    inline def setAnnotations(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientRun.maximMazurokGapiClientRunStrings.GoogleCloudRunV2Execution & TopLevel[Any]
    ): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setCompletionTime(value: String): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "completionTime", js.undefined)
    
    inline def setConditions(value: js.Array[GoogleCloudRunV2Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: GoogleCloudRunV2Condition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDeleteTime(value: String): Self = StObject.set(x, "deleteTime", value.asInstanceOf[js.Any])
    
    inline def setDeleteTimeUndefined: Self = StObject.set(x, "deleteTime", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setFailedCount(value: Double): Self = StObject.set(x, "failedCount", value.asInstanceOf[js.Any])
    
    inline def setFailedCountUndefined: Self = StObject.set(x, "failedCount", js.undefined)
    
    inline def setGeneration(value: String): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    inline def setJob(value: String): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientRun.maximMazurokGapiClientRunStrings.GoogleCloudRunV2Execution & TopLevel[Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLaunchStage(value: String): Self = StObject.set(x, "launchStage", value.asInstanceOf[js.Any])
    
    inline def setLaunchStageUndefined: Self = StObject.set(x, "launchStage", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setObservedGeneration(value: String): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    inline def setObservedGenerationUndefined: Self = StObject.set(x, "observedGeneration", js.undefined)
    
    inline def setParallelism(value: Double): Self = StObject.set(x, "parallelism", value.asInstanceOf[js.Any])
    
    inline def setParallelismUndefined: Self = StObject.set(x, "parallelism", js.undefined)
    
    inline def setReconciling(value: Boolean): Self = StObject.set(x, "reconciling", value.asInstanceOf[js.Any])
    
    inline def setReconcilingUndefined: Self = StObject.set(x, "reconciling", js.undefined)
    
    inline def setRunningCount(value: Double): Self = StObject.set(x, "runningCount", value.asInstanceOf[js.Any])
    
    inline def setRunningCountUndefined: Self = StObject.set(x, "runningCount", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setSucceededCount(value: Double): Self = StObject.set(x, "succeededCount", value.asInstanceOf[js.Any])
    
    inline def setSucceededCountUndefined: Self = StObject.set(x, "succeededCount", js.undefined)
    
    inline def setTaskCount(value: Double): Self = StObject.set(x, "taskCount", value.asInstanceOf[js.Any])
    
    inline def setTaskCountUndefined: Self = StObject.set(x, "taskCount", js.undefined)
    
    inline def setTemplate(value: GoogleCloudRunV2TaskTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
