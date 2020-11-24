package typings.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVideointelligenceV1FaceDetectionConfig extends js.Object {
  
  /** Whether to enable face attributes detection, such as glasses, dark_glasses, mouth_open etc. Ignored if 'include_bounding_boxes' is set to false. */
  var includeAttributes: js.UndefOr[Boolean] = js.native
  
  /** Whether bounding boxes are included in the face annotation output. */
  var includeBoundingBoxes: js.UndefOr[Boolean] = js.native
  
  /** Model to use for face detection. Supported values: "builtin/stable" (the default if unset) and "builtin/latest". */
  var model: js.UndefOr[String] = js.native
}
object GoogleCloudVideointelligenceV1FaceDetectionConfig {
  
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1FaceDetectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1FaceDetectionConfig]
  }
  
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1FaceDetectionConfigOps[Self <: GoogleCloudVideointelligenceV1FaceDetectionConfig] (val x: Self) extends AnyVal {
    
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
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
  }
}
