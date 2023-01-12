package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1AnnotateVideoRequest extends StObject {
  
  /** Required. Requested video annotation features. */
  var features: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The video data bytes. If unset, the input video(s) should be specified via the `input_uri`. If set, `input_uri` must be unset. */
  var inputContent: js.UndefOr[String] = js.undefined
  
  /**
    * Input video location. Currently, only [Cloud Storage](https://cloud.google.com/storage/) URIs are supported. URIs must be specified in the following format:
    * `gs://bucket-id/object-id` (other URI formats return google.rpc.Code.INVALID_ARGUMENT). For more information, see [Request
    * URIs](https://cloud.google.com/storage/docs/request-endpoints). To identify multiple videos, a video URI may include wildcards in the `object-id`. Supported wildcards: '*' to match
    * 0 or more characters; '?' to match 1 character. If unset, the input video should be embedded in the request as `input_content`. If set, `input_content` must be unset.
    */
  var inputUri: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Cloud region where annotation should take place. Supported cloud regions are: `us-east1`, `us-west1`, `europe-west1`, `asia-east1`. If no region is specified, the region
    * will be determined based on video file location.
    */
  var locationId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Location where the output (in JSON format) should be stored. Currently, only [Cloud Storage](https://cloud.google.com/storage/) URIs are supported. These must be specified
    * in the following format: `gs://bucket-id/object-id` (other URI formats return google.rpc.Code.INVALID_ARGUMENT). For more information, see [Request
    * URIs](https://cloud.google.com/storage/docs/request-endpoints).
    */
  var outputUri: js.UndefOr[String] = js.undefined
  
  /** Additional video context and/or feature-specific parameters. */
  var videoContext: js.UndefOr[GoogleCloudVideointelligenceV1VideoContext] = js.undefined
}
object GoogleCloudVideointelligenceV1AnnotateVideoRequest {
  
  inline def apply(): GoogleCloudVideointelligenceV1AnnotateVideoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1AnnotateVideoRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudVideointelligenceV1AnnotateVideoRequest] (val x: Self) extends AnyVal {
    
    inline def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setInputContent(value: String): Self = StObject.set(x, "inputContent", value.asInstanceOf[js.Any])
    
    inline def setInputContentUndefined: Self = StObject.set(x, "inputContent", js.undefined)
    
    inline def setInputUri(value: String): Self = StObject.set(x, "inputUri", value.asInstanceOf[js.Any])
    
    inline def setInputUriUndefined: Self = StObject.set(x, "inputUri", js.undefined)
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    inline def setOutputUri(value: String): Self = StObject.set(x, "outputUri", value.asInstanceOf[js.Any])
    
    inline def setOutputUriUndefined: Self = StObject.set(x, "outputUri", js.undefined)
    
    inline def setVideoContext(value: GoogleCloudVideointelligenceV1VideoContext): Self = StObject.set(x, "videoContext", value.asInstanceOf[js.Any])
    
    inline def setVideoContextUndefined: Self = StObject.set(x, "videoContext", js.undefined)
  }
}
