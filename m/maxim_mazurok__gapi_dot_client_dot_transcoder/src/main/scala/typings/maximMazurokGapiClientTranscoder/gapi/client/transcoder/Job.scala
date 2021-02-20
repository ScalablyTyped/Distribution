package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Job extends StObject {
  
  /** The configuration for this job. */
  var config: js.UndefOr[JobConfig] = js.native
  
  /** Output only. The time the job was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. The time the transcoding finished. */
  var endTime: js.UndefOr[String] = js.native
  
  /** Output only. List of failure details. This property may contain additional information about the failure when `failure_reason` is present. *Note*: This feature is not yet available. */
  var failureDetails: js.UndefOr[js.Array[FailureDetail]] = js.native
  
  /** Output only. A description of the reason for the failure. This property is always present when `state` is `FAILED`. */
  var failureReason: js.UndefOr[String] = js.native
  
  /**
    * Input only. Specify the `input_uri` to populate empty `uri` fields in each element of `Job.config.inputs` or `JobTemplate.config.inputs` when using template. URI of the media. It
    * must be stored in Cloud Storage. For example, `gs://bucket/inputs/file.mp4`.
    */
  var inputUri: js.UndefOr[String] = js.native
  
  /** The resource name of the job. Format: `projects/{project}/locations/{location}/jobs/{job}` */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. The origin URI. *Note*: This feature is not yet available. */
  var originUri: js.UndefOr[OriginUri] = js.native
  
  /**
    * Input only. Specify the `output_uri` to populate an empty `Job.config.output.uri` or `JobTemplate.config.output.uri` when using template. URI for the output file(s). For example,
    * `gs://my-bucket/outputs/`.
    */
  var outputUri: js.UndefOr[String] = js.native
  
  /** Specify the priority of the job. Enter a value between 0 and 100, where 0 is the lowest priority and 100 is the highest priority. The default is 0. */
  var priority: js.UndefOr[Double] = js.native
  
  /** Output only. Estimated fractional progress, from `0` to `1` for each step. *Note*: This feature is not yet available. */
  var progress: js.UndefOr[Progress] = js.native
  
  /** Output only. The time the transcoding started. */
  var startTime: js.UndefOr[String] = js.native
  
  /** Output only. The current state of the job. */
  var state: js.UndefOr[String] = js.native
  
  /**
    * Input only. Specify the `template_id` to use for populating `Job.config`. The default is `preset/web-hd`. Preset Transcoder templates: - `preset/{preset_id}` - User defined
    * JobTemplate: `{job_template_id}`
    */
  var templateId: js.UndefOr[String] = js.native
}
object Job {
  
  @scala.inline
  def apply(): Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Job]
  }
  
  @scala.inline
  implicit class JobMutableBuilder[Self <: Job] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: JobConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setFailureDetails(value: js.Array[FailureDetail]): Self = StObject.set(x, "failureDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureDetailsUndefined: Self = StObject.set(x, "failureDetails", js.undefined)
    
    @scala.inline
    def setFailureDetailsVarargs(value: FailureDetail*): Self = StObject.set(x, "failureDetails", js.Array(value :_*))
    
    @scala.inline
    def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    @scala.inline
    def setInputUri(value: String): Self = StObject.set(x, "inputUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUriUndefined: Self = StObject.set(x, "inputUri", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOriginUri(value: OriginUri): Self = StObject.set(x, "originUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUriUndefined: Self = StObject.set(x, "originUri", js.undefined)
    
    @scala.inline
    def setOutputUri(value: String): Self = StObject.set(x, "outputUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUriUndefined: Self = StObject.set(x, "outputUri", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setProgress(value: Progress): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
  }
}
