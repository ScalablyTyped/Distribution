package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1p3beta1ObjectTrackingAnnotation extends js.Object {
  
  /** Object category's labeling confidence of this track. */
  var confidence: js.UndefOr[Double] = js.native
  
  /** Entity to specify the object category that this track is labeled as. */
  var entity: js.UndefOr[GoogleCloudVideointelligenceV1p3beta1Entity] = js.native
  
  /**
    * Information corresponding to all frames where this object track appears. Non-streaming batch mode: it may be one or multiple ObjectTrackingFrame messages in frames. Streaming mode:
    * it can only be one ObjectTrackingFrame message in frames.
    */
  var frames: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p3beta1ObjectTrackingFrame]] = js.native
  
  /** Non-streaming batch mode ONLY. Each object track corresponds to one video segment where it appears. */
  var segment: js.UndefOr[GoogleCloudVideointelligenceV1p3beta1VideoSegment] = js.native
  
  /**
    * Streaming mode ONLY. In streaming mode, we do not know the end time of a tracked object before it is completed. Hence, there is no VideoSegment info returned. Instead, we provide a
    * unique identifiable integer track_id so that the customers can correlate the results of the ongoing ObjectTrackAnnotation of the same track_id over time.
    */
  var trackId: js.UndefOr[String] = js.native
  
  /** Feature version. */
  var version: js.UndefOr[String] = js.native
}
object GoogleCloudVideointelligenceV1p3beta1ObjectTrackingAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p3beta1ObjectTrackingAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p3beta1ObjectTrackingAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p3beta1ObjectTrackingAnnotationOps[Self <: GoogleCloudVideointelligenceV1p3beta1ObjectTrackingAnnotation] (val x: Self) extends AnyVal {
    
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
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
    
    @scala.inline
    def setEntity(value: GoogleCloudVideointelligenceV1p3beta1Entity): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntity: Self = this.set("entity", js.undefined)
    
    @scala.inline
    def setFramesVarargs(value: GoogleCloudVideointelligenceV1p3beta1ObjectTrackingFrame*): Self = this.set("frames", js.Array(value :_*))
    
    @scala.inline
    def setFrames(value: js.Array[GoogleCloudVideointelligenceV1p3beta1ObjectTrackingFrame]): Self = this.set("frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrames: Self = this.set("frames", js.undefined)
    
    @scala.inline
    def setSegment(value: GoogleCloudVideointelligenceV1p3beta1VideoSegment): Self = this.set("segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegment: Self = this.set("segment", js.undefined)
    
    @scala.inline
    def setTrackId(value: String): Self = this.set("trackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackId: Self = this.set("trackId", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
