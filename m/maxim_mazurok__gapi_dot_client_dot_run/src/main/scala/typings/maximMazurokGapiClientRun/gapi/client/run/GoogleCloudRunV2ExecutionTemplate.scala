package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV2ExecutionTemplate extends StObject {
  
  /** KRM-style annotations for the resource. */
  var annotations: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientRun.maximMazurokGapiClientRunStrings.GoogleCloudRunV2ExecutionTemplate & TopLevel[Any]
  ] = js.undefined
  
  /** KRM-style labels for the resource. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientRun.maximMazurokGapiClientRunStrings.GoogleCloudRunV2ExecutionTemplate & TopLevel[Any]
  ] = js.undefined
  
  /**
    * Specifies the maximum desired number of tasks the execution should run at given time. Must be <= task_count. When the job is run, if this field is 0 or unset, the maximum possible
    * value will be used for that execution. The actual number of tasks running in steady state will be less than this number when there are fewer tasks waiting to be completed remaining,
    * i.e. when the work left to do is less than max parallelism.
    */
  var parallelism: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the desired number of tasks the execution should run. Setting to 1 means that parallelism is limited to 1 and the success of that task signals the success of the
    * execution. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
    */
  var taskCount: js.UndefOr[Double] = js.undefined
  
  /** Required. Describes the task(s) that will be created when executing an execution. */
  var template: js.UndefOr[GoogleCloudRunV2TaskTemplate] = js.undefined
}
object GoogleCloudRunV2ExecutionTemplate {
  
  inline def apply(): GoogleCloudRunV2ExecutionTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV2ExecutionTemplate]
  }
  
  extension [Self <: GoogleCloudRunV2ExecutionTemplate](x: Self) {
    
    inline def setAnnotations(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientRun.maximMazurokGapiClientRunStrings.GoogleCloudRunV2ExecutionTemplate & TopLevel[Any]
    ): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientRun.maximMazurokGapiClientRunStrings.GoogleCloudRunV2ExecutionTemplate & TopLevel[Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setParallelism(value: Double): Self = StObject.set(x, "parallelism", value.asInstanceOf[js.Any])
    
    inline def setParallelismUndefined: Self = StObject.set(x, "parallelism", js.undefined)
    
    inline def setTaskCount(value: Double): Self = StObject.set(x, "taskCount", value.asInstanceOf[js.Any])
    
    inline def setTaskCountUndefined: Self = StObject.set(x, "taskCount", js.undefined)
    
    inline def setTemplate(value: GoogleCloudRunV2TaskTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
