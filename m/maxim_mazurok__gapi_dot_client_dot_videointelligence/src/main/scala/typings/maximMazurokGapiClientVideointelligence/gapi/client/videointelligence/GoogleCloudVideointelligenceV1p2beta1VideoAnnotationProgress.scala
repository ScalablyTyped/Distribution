package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p2beta1VideoAnnotationProgress extends StObject {
  
  /** Specifies which feature is being tracked if the request contains more than one feature. */
  var feature: js.UndefOr[String] = js.undefined
  
  /** Video file location in [Cloud Storage](https://cloud.google.com/storage/). */
  var inputUri: js.UndefOr[String] = js.undefined
  
  /** Approximate percentage processed thus far. Guaranteed to be 100 when fully processed. */
  var progressPercent: js.UndefOr[Double] = js.undefined
  
  /** Specifies which segment is being tracked if the request contains more than one segment. */
  var segment: js.UndefOr[GoogleCloudVideointelligenceV1p2beta1VideoSegment] = js.undefined
  
  /** Time when the request was received. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** Time of the most recent update. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object GoogleCloudVideointelligenceV1p2beta1VideoAnnotationProgress {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p2beta1VideoAnnotationProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p2beta1VideoAnnotationProgress]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p2beta1VideoAnnotationProgressMutableBuilder[Self <: GoogleCloudVideointelligenceV1p2beta1VideoAnnotationProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    @scala.inline
    def setInputUri(value: String): Self = StObject.set(x, "inputUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUriUndefined: Self = StObject.set(x, "inputUri", js.undefined)
    
    @scala.inline
    def setProgressPercent(value: Double): Self = StObject.set(x, "progressPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressPercentUndefined: Self = StObject.set(x, "progressPercent", js.undefined)
    
    @scala.inline
    def setSegment(value: GoogleCloudVideointelligenceV1p2beta1VideoSegment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
