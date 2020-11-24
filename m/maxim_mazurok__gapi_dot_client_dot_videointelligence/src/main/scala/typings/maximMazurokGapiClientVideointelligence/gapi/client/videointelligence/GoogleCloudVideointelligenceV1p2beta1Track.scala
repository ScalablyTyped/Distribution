package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1p2beta1Track extends js.Object {
  
  /** Optional. Attributes in the track level. */
  var attributes: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p2beta1DetectedAttribute]] = js.native
  
  /** Optional. The confidence score of the tracked object. */
  var confidence: js.UndefOr[Double] = js.native
  
  /** Video segment of a track. */
  var segment: js.UndefOr[GoogleCloudVideointelligenceV1p2beta1VideoSegment] = js.native
  
  /** The object with timestamp and attributes per frame in the track. */
  var timestampedObjects: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1p2beta1TimestampedObject]] = js.native
}
object GoogleCloudVideointelligenceV1p2beta1Track {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1p2beta1Track = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p2beta1Track]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1p2beta1TrackOps[Self <: GoogleCloudVideointelligenceV1p2beta1Track] (val x: Self) extends AnyVal {
    
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
    def setAttributesVarargs(value: GoogleCloudVideointelligenceV1p2beta1DetectedAttribute*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: js.Array[GoogleCloudVideointelligenceV1p2beta1DetectedAttribute]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
    
    @scala.inline
    def setSegment(value: GoogleCloudVideointelligenceV1p2beta1VideoSegment): Self = this.set("segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegment: Self = this.set("segment", js.undefined)
    
    @scala.inline
    def setTimestampedObjectsVarargs(value: GoogleCloudVideointelligenceV1p2beta1TimestampedObject*): Self = this.set("timestampedObjects", js.Array(value :_*))
    
    @scala.inline
    def setTimestampedObjects(value: js.Array[GoogleCloudVideointelligenceV1p2beta1TimestampedObject]): Self = this.set("timestampedObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestampedObjects: Self = this.set("timestampedObjects", js.undefined)
  }
}
