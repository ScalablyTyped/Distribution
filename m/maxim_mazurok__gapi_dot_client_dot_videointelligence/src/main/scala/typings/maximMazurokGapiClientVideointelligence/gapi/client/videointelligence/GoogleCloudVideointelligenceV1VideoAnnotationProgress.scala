package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1VideoAnnotationProgress extends js.Object {
  
  /** Specifies which feature is being tracked if the request contains more than one feature. */
  var feature: js.UndefOr[String] = js.native
  
  /** Video file location in [Cloud Storage](https://cloud.google.com/storage/). */
  var inputUri: js.UndefOr[String] = js.native
  
  /** Approximate percentage processed thus far. Guaranteed to be 100 when fully processed. */
  var progressPercent: js.UndefOr[Double] = js.native
  
  /** Specifies which segment is being tracked if the request contains more than one segment. */
  var segment: js.UndefOr[GoogleCloudVideointelligenceV1VideoSegment] = js.native
  
  /** Time when the request was received. */
  var startTime: js.UndefOr[String] = js.native
  
  /** Time of the most recent update. */
  var updateTime: js.UndefOr[String] = js.native
}
object GoogleCloudVideointelligenceV1VideoAnnotationProgress {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1VideoAnnotationProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1VideoAnnotationProgress]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1VideoAnnotationProgressOps[Self <: GoogleCloudVideointelligenceV1VideoAnnotationProgress] (val x: Self) extends AnyVal {
    
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
    def setFeature(value: String): Self = this.set("feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeature: Self = this.set("feature", js.undefined)
    
    @scala.inline
    def setInputUri(value: String): Self = this.set("inputUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputUri: Self = this.set("inputUri", js.undefined)
    
    @scala.inline
    def setProgressPercent(value: Double): Self = this.set("progressPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressPercent: Self = this.set("progressPercent", js.undefined)
    
    @scala.inline
    def setSegment(value: GoogleCloudVideointelligenceV1VideoSegment): Self = this.set("segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegment: Self = this.set("segment", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
