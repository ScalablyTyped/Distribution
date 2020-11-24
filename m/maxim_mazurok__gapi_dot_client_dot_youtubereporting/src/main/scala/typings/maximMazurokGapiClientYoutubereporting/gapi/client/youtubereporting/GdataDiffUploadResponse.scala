package typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GdataDiffUploadResponse extends js.Object {
  
  /** gdata */
  var objectVersion: js.UndefOr[String] = js.native
  
  /** gdata */
  var originalObject: js.UndefOr[GdataCompositeMedia] = js.native
}
object GdataDiffUploadResponse {
  
  @scala.inline
  def apply(): GdataDiffUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GdataDiffUploadResponse]
  }
  
  @scala.inline
  implicit class GdataDiffUploadResponseOps[Self <: GdataDiffUploadResponse] (val x: Self) extends AnyVal {
    
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
    def setObjectVersion(value: String): Self = this.set("objectVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectVersion: Self = this.set("objectVersion", js.undefined)
    
    @scala.inline
    def setOriginalObject(value: GdataCompositeMedia): Self = this.set("originalObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalObject: Self = this.set("originalObject", js.undefined)
  }
}
