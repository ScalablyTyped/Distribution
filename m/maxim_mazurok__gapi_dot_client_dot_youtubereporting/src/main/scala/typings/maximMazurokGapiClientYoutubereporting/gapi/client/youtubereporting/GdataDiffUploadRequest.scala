package typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GdataDiffUploadRequest extends js.Object {
  
  /** gdata */
  var checksumsInfo: js.UndefOr[GdataCompositeMedia] = js.native
  
  /** gdata */
  var objectInfo: js.UndefOr[GdataCompositeMedia] = js.native
  
  /** gdata */
  var objectVersion: js.UndefOr[String] = js.native
}
object GdataDiffUploadRequest {
  
  @scala.inline
  def apply(): GdataDiffUploadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GdataDiffUploadRequest]
  }
  
  @scala.inline
  implicit class GdataDiffUploadRequestOps[Self <: GdataDiffUploadRequest] (val x: Self) extends AnyVal {
    
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
    def setChecksumsInfo(value: GdataCompositeMedia): Self = this.set("checksumsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecksumsInfo: Self = this.set("checksumsInfo", js.undefined)
    
    @scala.inline
    def setObjectInfo(value: GdataCompositeMedia): Self = this.set("objectInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectInfo: Self = this.set("objectInfo", js.undefined)
    
    @scala.inline
    def setObjectVersion(value: String): Self = this.set("objectVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectVersion: Self = this.set("objectVersion", js.undefined)
  }
}
