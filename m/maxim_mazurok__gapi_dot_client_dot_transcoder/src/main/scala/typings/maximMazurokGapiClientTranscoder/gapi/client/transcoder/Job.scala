package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Job extends js.Object {
  
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
  implicit class JobOps[Self <: Job] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: JobConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setFailureDetailsVarargs(value: FailureDetail*): Self = this.set("failureDetails", js.Array(value :_*))
    
    @scala.inline
    def setFailureDetails(value: js.Array[FailureDetail]): Self = this.set("failureDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureDetails: Self = this.set("failureDetails", js.undefined)
    
    @scala.inline
    def setFailureReason(value: String): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
    
    @scala.inline
    def setInputUri(value: String): Self = this.set("inputUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputUri: Self = this.set("inputUri", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOriginUri(value: OriginUri): Self = this.set("originUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginUri: Self = this.set("originUri", js.undefined)
    
    @scala.inline
    def setOutputUri(value: String): Self = this.set("outputUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputUri: Self = this.set("outputUri", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setProgress(value: Progress): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTemplateId(value: String): Self = this.set("templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateId: Self = this.set("templateId", js.undefined)
  }
}
