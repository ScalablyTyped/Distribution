package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1AnnotateVideoRequest extends StObject {
  
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
  implicit class GoogleCloudVideointelligenceV1AnnotateVideoRequestMutableBuilder[Self <: GoogleCloudVideointelligenceV1AnnotateVideoRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setInputContent(value: String): Self = StObject.set(x, "inputContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputContentUndefined: Self = StObject.set(x, "inputContent", js.undefined)
    
    @scala.inline
    def setInputUri(value: String): Self = StObject.set(x, "inputUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUriUndefined: Self = StObject.set(x, "inputUri", js.undefined)
    
    @scala.inline
    def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    @scala.inline
    def setOutputUri(value: String): Self = StObject.set(x, "outputUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUriUndefined: Self = StObject.set(x, "outputUri", js.undefined)
    
    @scala.inline
    def setVideoContext(value: GoogleCloudVideointelligenceV1VideoContext): Self = StObject.set(x, "videoContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoContextUndefined: Self = StObject.set(x, "videoContext", js.undefined)
  }
}
