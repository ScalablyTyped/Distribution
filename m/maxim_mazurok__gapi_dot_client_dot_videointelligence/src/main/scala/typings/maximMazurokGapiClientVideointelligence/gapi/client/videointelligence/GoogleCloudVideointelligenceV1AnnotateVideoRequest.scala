package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1AnnotateVideoRequest extends js.Object {
  
  /** Required. Requested video annotation features. */
  var features: js.UndefOr[js.Array[String]] = js.native
  
  /** The video data bytes. If unset, the input video(s) should be specified via the `input_uri`. If set, `input_uri` must be unset. */
  var inputContent: js.UndefOr[String] = js.native
  
  /**
    * Input video location. Currently, only [Cloud Storage](https://cloud.google.com/storage/) URIs are supported. URIs must be specified in the following format:
    * `gs://bucket-id/object-id` (other URI formats return google.rpc.Code.INVALID_ARGUMENT). For more information, see [Request
    * URIs](https://cloud.google.com/storage/docs/request-endpoints). To identify multiple videos, a video URI may include wildcards in the `object-id`. Supported wildcards: '*' to match
    * 0 or more characters; '?' to match 1 character. If unset, the input video should be embedded in the request as `input_content`. If set, `input_content` must be unset.
    */
  var inputUri: js.UndefOr[String] = js.native
  
  /**
    * Optional. Cloud region where annotation should take place. Supported cloud regions are: `us-east1`, `us-west1`, `europe-west1`, `asia-east1`. If no region is specified, the region
    * will be determined based on video file location.
    */
  var locationId: js.UndefOr[String] = js.native
  
  /**
    * Optional. Location where the output (in JSON format) should be stored. Currently, only [Cloud Storage](https://cloud.google.com/storage/) URIs are supported. These must be specified
    * in the following format: `gs://bucket-id/object-id` (other URI formats return google.rpc.Code.INVALID_ARGUMENT). For more information, see [Request
    * URIs](https://cloud.google.com/storage/docs/request-endpoints).
    */
  var outputUri: js.UndefOr[String] = js.native
  
  /** Additional video context and/or feature-specific parameters. */
  var videoContext: js.UndefOr[GoogleCloudVideointelligenceV1VideoContext] = js.native
}
object GoogleCloudVideointelligenceV1AnnotateVideoRequest {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1AnnotateVideoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1AnnotateVideoRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1AnnotateVideoRequestOps[Self <: GoogleCloudVideointelligenceV1AnnotateVideoRequest] (val x: Self) extends AnyVal {
    
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
    def setFeaturesVarargs(value: String*): Self = this.set("features", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(value: js.Array[String]): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    
    @scala.inline
    def setInputContent(value: String): Self = this.set("inputContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputContent: Self = this.set("inputContent", js.undefined)
    
    @scala.inline
    def setInputUri(value: String): Self = this.set("inputUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputUri: Self = this.set("inputUri", js.undefined)
    
    @scala.inline
    def setLocationId(value: String): Self = this.set("locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationId: Self = this.set("locationId", js.undefined)
    
    @scala.inline
    def setOutputUri(value: String): Self = this.set("outputUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputUri: Self = this.set("outputUri", js.undefined)
    
    @scala.inline
    def setVideoContext(value: GoogleCloudVideointelligenceV1VideoContext): Self = this.set("videoContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoContext: Self = this.set("videoContext", js.undefined)
  }
}
