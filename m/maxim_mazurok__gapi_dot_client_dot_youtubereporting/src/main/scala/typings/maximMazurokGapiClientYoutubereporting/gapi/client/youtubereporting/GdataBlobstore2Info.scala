package typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GdataBlobstore2Info extends js.Object {
  
  /** gdata */
  var blobGeneration: js.UndefOr[String] = js.native
  
  /** gdata */
  var blobId: js.UndefOr[String] = js.native
  
  /** gdata */
  var downloadReadHandle: js.UndefOr[String] = js.native
  
  /** gdata */
  var readToken: js.UndefOr[String] = js.native
  
  /** gdata */
  var uploadMetadataContainer: js.UndefOr[String] = js.native
}
object GdataBlobstore2Info {
  
  @scala.inline
  def apply(): GdataBlobstore2Info = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GdataBlobstore2Info]
  }
  
  @scala.inline
  implicit class GdataBlobstore2InfoOps[Self <: GdataBlobstore2Info] (val x: Self) extends AnyVal {
    
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
    def setBlobGeneration(value: String): Self = this.set("blobGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlobGeneration: Self = this.set("blobGeneration", js.undefined)
    
    @scala.inline
    def setBlobId(value: String): Self = this.set("blobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlobId: Self = this.set("blobId", js.undefined)
    
    @scala.inline
    def setDownloadReadHandle(value: String): Self = this.set("downloadReadHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadReadHandle: Self = this.set("downloadReadHandle", js.undefined)
    
    @scala.inline
    def setReadToken(value: String): Self = this.set("readToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadToken: Self = this.set("readToken", js.undefined)
    
    @scala.inline
    def setUploadMetadataContainer(value: String): Self = this.set("uploadMetadataContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadMetadataContainer: Self = this.set("uploadMetadataContainer", js.undefined)
  }
}
