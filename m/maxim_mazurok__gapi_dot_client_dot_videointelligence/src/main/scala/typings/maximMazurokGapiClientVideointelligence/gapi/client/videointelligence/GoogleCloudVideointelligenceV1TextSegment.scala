package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1TextSegment extends js.Object {
  
  /** Confidence for the track of detected text. It is calculated as the highest over all frames where OCR detected text appears. */
  var confidence: js.UndefOr[Double] = js.native
  
  /** Information related to the frames where OCR detected text appears. */
  var frames: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1TextFrame]] = js.native
  
  /** Video segment where a text snippet was detected. */
  var segment: js.UndefOr[GoogleCloudVideointelligenceV1VideoSegment] = js.native
}
object GoogleCloudVideointelligenceV1TextSegment {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1TextSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1TextSegment]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1TextSegmentOps[Self <: GoogleCloudVideointelligenceV1TextSegment] (val x: Self) extends AnyVal {
    
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
    def setFramesVarargs(value: GoogleCloudVideointelligenceV1TextFrame*): Self = this.set("frames", js.Array(value :_*))
    
    @scala.inline
    def setFrames(value: js.Array[GoogleCloudVideointelligenceV1TextFrame]): Self = this.set("frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrames: Self = this.set("frames", js.undefined)
    
    @scala.inline
    def setSegment(value: GoogleCloudVideointelligenceV1VideoSegment): Self = this.set("segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegment: Self = this.set("segment", js.undefined)
  }
}
