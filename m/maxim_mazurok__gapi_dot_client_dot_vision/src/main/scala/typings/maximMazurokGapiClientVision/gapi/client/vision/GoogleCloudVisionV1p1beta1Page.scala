package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p1beta1Page extends js.Object {
  
  /** List of blocks of text, images etc on this page. */
  var blocks: js.UndefOr[js.Array[GoogleCloudVisionV1p1beta1Block]] = js.native
  
  /** Confidence of the OCR results on the page. Range [0, 1]. */
  var confidence: js.UndefOr[Double] = js.native
  
  /** Page height. For PDFs the unit is points. For images (including TIFFs) the unit is pixels. */
  var height: js.UndefOr[Double] = js.native
  
  /** Additional information detected on the page. */
  var property: js.UndefOr[GoogleCloudVisionV1p1beta1TextAnnotationTextProperty] = js.native
  
  /** Page width. For PDFs the unit is points. For images (including TIFFs) the unit is pixels. */
  var width: js.UndefOr[Double] = js.native
}
object GoogleCloudVisionV1p1beta1Page {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p1beta1Page = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p1beta1Page]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p1beta1PageOps[Self <: GoogleCloudVisionV1p1beta1Page] (val x: Self) extends AnyVal {
    
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
    def setBlocksVarargs(value: GoogleCloudVisionV1p1beta1Block*): Self = this.set("blocks", js.Array(value :_*))
    
    @scala.inline
    def setBlocks(value: js.Array[GoogleCloudVisionV1p1beta1Block]): Self = this.set("blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlocks: Self = this.set("blocks", js.undefined)
    
    @scala.inline
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setProperty(value: GoogleCloudVisionV1p1beta1TextAnnotationTextProperty): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
