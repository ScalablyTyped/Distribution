package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReferenceImagesResponse extends js.Object {
  
  /** The next_page_token returned from a previous List request, if any. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The maximum number of items to return. Default 10, maximum 100. */
  var pageSize: js.UndefOr[Double] = js.native
  
  /** The list of reference images. */
  var referenceImages: js.UndefOr[js.Array[ReferenceImage]] = js.native
}
object ListReferenceImagesResponse {
  
  @scala.inline
  def apply(): ListReferenceImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReferenceImagesResponse]
  }
  
  @scala.inline
  implicit class ListReferenceImagesResponseOps[Self <: ListReferenceImagesResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setReferenceImagesVarargs(value: ReferenceImage*): Self = this.set("referenceImages", js.Array(value :_*))
    
    @scala.inline
    def setReferenceImages(value: js.Array[ReferenceImage]): Self = this.set("referenceImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceImages: Self = this.set("referenceImages", js.undefined)
  }
}
