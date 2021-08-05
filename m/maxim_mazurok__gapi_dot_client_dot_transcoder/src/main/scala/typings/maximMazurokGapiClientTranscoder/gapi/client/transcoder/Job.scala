package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Job extends StObject {
  
  /** The configuration for this job. */
  var config: js.UndefOr[JobConfig] = js.undefined
  
  /** Output only. The time the job was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The time the transcoding finished. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** Output only. List of failure details. This property may contain additional information about the failure when `failure_reason` is present. *Note*: This feature is not yet available. */
  var failureDetails: js.UndefOr[js.Array[FailureDetail]] = js.undefined
  
  /** Output only. A description of the reason for the failure. This property is always present when `state` is `FAILED`. */
  var failureReason: js.UndefOr[String] = js.undefined
  
  /**
    * Input only. Specify the `input_uri` to populate empty `uri` fields in each element of `Job.config.inputs` or `JobTemplate.config.inputs` when using template. URI of the media. It
    * must be stored in Cloud Storage. For example, `gs://bucket/inputs/file.mp4`.
    */
  var inputUri: js.UndefOr[String] = js.undefined
  
  /** The resource name of the job. Format: `projects/{project}/locations/{location}/jobs/{job}` */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The origin URI. *Note*: This feature is not yet available. */
  var originUri: js.UndefOr[OriginUri] = js.undefined
  
  /**
    * Input only. Specify the `output_uri` to populate an empty `Job.config.output.uri` or `JobTemplate.config.output.uri` when using template. URI for the output file(s). For example,
    * `gs://my-bucket/outputs/`.
    */
  var outputUri: js.UndefOr[String] = js.undefined
  
  /** Specify the priority of the job. Enter a value between 0 and 100, where 0 is the lowest priority and 100 is the highest priority. The default is 0. */
  var priority: js.UndefOr[Double] = js.undefined
  
  /** Output only. Estimated fractional progress, from `0` to `1` for each step. *Note*: This feature is not yet available. */
  var progress: js.UndefOr[Progress] = js.undefined
  
  /** Output only. The time the transcoding started. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The current state of the job. */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * Input only. Specify the `template_id` to use for populating `Job.config`. The default is `preset/web-hd`. Preset Transcoder templates: - `preset/{preset_id}` - User defined
    * JobTemplate: `{job_template_id}`
    */
  var templateId: js.UndefOr[String] = js.undefined
}
object Job {
  
  inline def apply(): Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Job]
  }
  
  extension [Self <: Job](x: Self) {
    
    inline def setConfig(value: JobConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setFailureDetails(value: js.Array[FailureDetail]): Self = StObject.set(x, "failureDetails", value.asInstanceOf[js.Any])
    
    inline def setFailureDetailsUndefined: Self = StObject.set(x, "failureDetails", js.undefined)
    
    inline def setFailureDetailsVarargs(value: FailureDetail*): Self = StObject.set(x, "failureDetails", js.Array(value :_*))
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setInputUri(value: String): Self = StObject.set(x, "inputUri", value.asInstanceOf[js.Any])
    
    inline def setInputUriUndefined: Self = StObject.set(x, "inputUri", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOriginUri(value: OriginUri): Self = StObject.set(x, "originUri", value.asInstanceOf[js.Any])
    
    inline def setOriginUriUndefined: Self = StObject.set(x, "originUri", js.undefined)
    
    inline def setOutputUri(value: String): Self = StObject.set(x, "outputUri", value.asInstanceOf[js.Any])
    
    inline def setOutputUriUndefined: Self = StObject.set(x, "outputUri", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setProgress(value: Progress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
  }
}
