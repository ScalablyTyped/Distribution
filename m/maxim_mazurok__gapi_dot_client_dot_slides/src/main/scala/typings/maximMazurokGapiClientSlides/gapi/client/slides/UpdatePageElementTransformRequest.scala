package typings.maximMazurokGapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePageElementTransformRequest extends js.Object {
  
  /** The apply mode of the transform update. */
  var applyMode: js.UndefOr[String] = js.native
  
  /** The object ID of the page element to update. */
  var objectId: js.UndefOr[String] = js.native
  
  /** The input transform matrix used to update the page element. */
  var transform: js.UndefOr[AffineTransform] = js.native
}
object UpdatePageElementTransformRequest {
  
  @scala.inline
  def apply(): UpdatePageElementTransformRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePageElementTransformRequest]
  }
  
  @scala.inline
  implicit class UpdatePageElementTransformRequestOps[Self <: UpdatePageElementTransformRequest] (val x: Self) extends AnyVal {
    
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
    def setApplyMode(value: String): Self = this.set("applyMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyMode: Self = this.set("applyMode", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    
    @scala.inline
    def setTransform(value: AffineTransform): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
}
