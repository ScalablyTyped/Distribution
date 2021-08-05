package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchJob extends StObject {
  
  /** Time this patch job was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Description of the patch job. Length of the description is limited to 1024 characters. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Display name for this patch job. This is not a unique identifier. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** If this patch job is a dry run, the agent reports that it has finished without running any updates on the VM instance. */
  var dryRun: js.UndefOr[Boolean] = js.undefined
  
  /** Duration of the patch job. After the duration ends, the patch job times out. */
  var duration: js.UndefOr[String] = js.undefined
  
  /** If this patch job failed, this message provides information about the failure. */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /** Summary of instance details. */
  var instanceDetailsSummary: js.UndefOr[PatchJobInstanceDetailsSummary] = js.undefined
  
  /** Instances to patch. */
  var instanceFilter: js.UndefOr[PatchInstanceFilter] = js.undefined
  
  /** Unique identifier for this patch job in the form `projects/∗/patchJobs/ *` */
  var name: js.UndefOr[String] = js.undefined
  
  /** Patch configuration being applied. */
  var patchConfig: js.UndefOr[PatchConfig] = js.undefined
  
  /** Output only. Name of the patch deployment that created this patch job. */
  var patchDeployment: js.UndefOr[String] = js.undefined
  
  /** Reflects the overall progress of the patch job in the range of 0.0 being no progress to 100.0 being complete. */
  var percentComplete: js.UndefOr[Double] = js.undefined
  
  /** Rollout strategy being applied. */
  var rollout: js.UndefOr[PatchRollout] = js.undefined
  
  /** The current state of the PatchJob. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Last time this patch job was updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object PatchJob {
  
  inline def apply(): PatchJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchJob]
  }
  
  extension [Self <: PatchJob](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setInstanceDetailsSummary(value: PatchJobInstanceDetailsSummary): Self = StObject.set(x, "instanceDetailsSummary", value.asInstanceOf[js.Any])
    
    inline def setInstanceDetailsSummaryUndefined: Self = StObject.set(x, "instanceDetailsSummary", js.undefined)
    
    inline def setInstanceFilter(value: PatchInstanceFilter): Self = StObject.set(x, "instanceFilter", value.asInstanceOf[js.Any])
    
    inline def setInstanceFilterUndefined: Self = StObject.set(x, "instanceFilter", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPatchConfig(value: PatchConfig): Self = StObject.set(x, "patchConfig", value.asInstanceOf[js.Any])
    
    inline def setPatchConfigUndefined: Self = StObject.set(x, "patchConfig", js.undefined)
    
    inline def setPatchDeployment(value: String): Self = StObject.set(x, "patchDeployment", value.asInstanceOf[js.Any])
    
    inline def setPatchDeploymentUndefined: Self = StObject.set(x, "patchDeployment", js.undefined)
    
    inline def setPercentComplete(value: Double): Self = StObject.set(x, "percentComplete", value.asInstanceOf[js.Any])
    
    inline def setPercentCompleteUndefined: Self = StObject.set(x, "percentComplete", js.undefined)
    
    inline def setRollout(value: PatchRollout): Self = StObject.set(x, "rollout", value.asInstanceOf[js.Any])
    
    inline def setRolloutUndefined: Self = StObject.set(x, "rollout", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
