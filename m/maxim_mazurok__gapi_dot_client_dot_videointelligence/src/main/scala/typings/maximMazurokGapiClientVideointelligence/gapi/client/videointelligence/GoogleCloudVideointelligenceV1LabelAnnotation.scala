package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1LabelAnnotation extends js.Object {
  
  /**
    * Common categories for the detected entity. For example, when the label is `Terrier`, the category is likely `dog`. And in some cases there might be more than one categories e.g.,
    * `Terrier` could also be a `pet`.
    */
  var categoryEntities: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1Entity]] = js.native
  
  /** Detected entity. */
  var entity: js.UndefOr[GoogleCloudVideointelligenceV1Entity] = js.native
  
  /** All video frames where a label was detected. */
  var frames: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1LabelFrame]] = js.native
  
  /** All video segments where a label was detected. */
  var segments: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1LabelSegment]] = js.native
  
  /** Feature version. */
  var version: js.UndefOr[String] = js.native
}
object GoogleCloudVideointelligenceV1LabelAnnotation {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1LabelAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1LabelAnnotation]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1LabelAnnotationOps[Self <: GoogleCloudVideointelligenceV1LabelAnnotation] (val x: Self) extends AnyVal {
    
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
    def setCategoryEntitiesVarargs(value: GoogleCloudVideointelligenceV1Entity*): Self = this.set("categoryEntities", js.Array(value :_*))
    
    @scala.inline
    def setCategoryEntities(value: js.Array[GoogleCloudVideointelligenceV1Entity]): Self = this.set("categoryEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoryEntities: Self = this.set("categoryEntities", js.undefined)
    
    @scala.inline
    def setEntity(value: GoogleCloudVideointelligenceV1Entity): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntity: Self = this.set("entity", js.undefined)
    
    @scala.inline
    def setFramesVarargs(value: GoogleCloudVideointelligenceV1LabelFrame*): Self = this.set("frames", js.Array(value :_*))
    
    @scala.inline
    def setFrames(value: js.Array[GoogleCloudVideointelligenceV1LabelFrame]): Self = this.set("frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrames: Self = this.set("frames", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: GoogleCloudVideointelligenceV1LabelSegment*): Self = this.set("segments", js.Array(value :_*))
    
    @scala.inline
    def setSegments(value: js.Array[GoogleCloudVideointelligenceV1LabelSegment]): Self = this.set("segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegments: Self = this.set("segments", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
