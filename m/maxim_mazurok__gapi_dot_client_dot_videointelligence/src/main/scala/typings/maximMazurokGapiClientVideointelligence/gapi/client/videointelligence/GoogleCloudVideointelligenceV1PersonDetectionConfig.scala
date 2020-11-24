package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1PersonDetectionConfig extends js.Object {
  
  /**
    * Whether to enable person attributes detection, such as cloth color (black, blue, etc), type (coat, dress, etc), pattern (plain, floral, etc), hair, etc. Ignored if
    * 'include_bounding_boxes' is set to false.
    */
  var includeAttributes: js.UndefOr[Boolean] = js.native
  
  /** Whether bounding boxes are included in the person detection annotation output. */
  var includeBoundingBoxes: js.UndefOr[Boolean] = js.native
  
  /** Whether to enable pose landmarks detection. Ignored if 'include_bounding_boxes' is set to false. */
  var includePoseLandmarks: js.UndefOr[Boolean] = js.native
}
object GoogleCloudVideointelligenceV1PersonDetectionConfig {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1PersonDetectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1PersonDetectionConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1PersonDetectionConfigOps[Self <: GoogleCloudVideointelligenceV1PersonDetectionConfig] (val x: Self) extends AnyVal {
    
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
    def setIncludeAttributes(value: Boolean): Self = this.set("includeAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeAttributes: Self = this.set("includeAttributes", js.undefined)
    
    @scala.inline
    def setIncludeBoundingBoxes(value: Boolean): Self = this.set("includeBoundingBoxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeBoundingBoxes: Self = this.set("includeBoundingBoxes", js.undefined)
    
    @scala.inline
    def setIncludePoseLandmarks(value: Boolean): Self = this.set("includePoseLandmarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludePoseLandmarks: Self = this.set("includePoseLandmarks", js.undefined)
  }
}
