package typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GdataDiffChecksumsResponse extends js.Object {
  
  /** gdata */
  var checksumsLocation: js.UndefOr[GdataCompositeMedia] = js.native
  
  /** gdata */
  var chunkSizeBytes: js.UndefOr[String] = js.native
  
  /** gdata */
  var objectLocation: js.UndefOr[GdataCompositeMedia] = js.native
  
  /** gdata */
  var objectSizeBytes: js.UndefOr[String] = js.native
  
  /** gdata */
  var objectVersion: js.UndefOr[String] = js.native
}
object GdataDiffChecksumsResponse {
  
  @scala.inline
  def apply(): GdataDiffChecksumsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GdataDiffChecksumsResponse]
  }
  
  @scala.inline
  implicit class GdataDiffChecksumsResponseOps[Self <: GdataDiffChecksumsResponse] (val x: Self) extends AnyVal {
    
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
    def setChecksumsLocation(value: GdataCompositeMedia): Self = this.set("checksumsLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecksumsLocation: Self = this.set("checksumsLocation", js.undefined)
    
    @scala.inline
    def setChunkSizeBytes(value: String): Self = this.set("chunkSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkSizeBytes: Self = this.set("chunkSizeBytes", js.undefined)
    
    @scala.inline
    def setObjectLocation(value: GdataCompositeMedia): Self = this.set("objectLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectLocation: Self = this.set("objectLocation", js.undefined)
    
    @scala.inline
    def setObjectSizeBytes(value: String): Self = this.set("objectSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectSizeBytes: Self = this.set("objectSizeBytes", js.undefined)
    
    @scala.inline
    def setObjectVersion(value: String): Self = this.set("objectVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectVersion: Self = this.set("objectVersion", js.undefined)
  }
}
