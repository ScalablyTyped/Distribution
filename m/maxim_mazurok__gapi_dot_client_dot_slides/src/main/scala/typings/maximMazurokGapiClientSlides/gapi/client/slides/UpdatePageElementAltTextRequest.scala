package typings.maximMazurokGapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePageElementAltTextRequest extends js.Object {
  
  /**
    * The updated alt text description of the page element. If unset the existing value will be maintained. The description is exposed to screen readers and other accessibility
    * interfaces. Only use human readable values related to the content of the page element.
    */
  var description: js.UndefOr[String] = js.native
  
  /** The object ID of the page element the updates are applied to. */
  var objectId: js.UndefOr[String] = js.native
  
  /**
    * The updated alt text title of the page element. If unset the existing value will be maintained. The title is exposed to screen readers and other accessibility interfaces. Only use
    * human readable values related to the content of the page element.
    */
  var title: js.UndefOr[String] = js.native
}
object UpdatePageElementAltTextRequest {
  
  @scala.inline
  def apply(): UpdatePageElementAltTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePageElementAltTextRequest]
  }
  
  @scala.inline
  implicit class UpdatePageElementAltTextRequestOps[Self <: UpdatePageElementAltTextRequest] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
