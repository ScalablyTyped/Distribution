package typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GdataDiffVersionResponse extends js.Object {
  
  /** gdata */
  var objectSizeBytes: js.UndefOr[String] = js.native
  
  /** gdata */
  var objectVersion: js.UndefOr[String] = js.native
}
object GdataDiffVersionResponse {
  
  @scala.inline
  def apply(): GdataDiffVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GdataDiffVersionResponse]
  }
  
  @scala.inline
  implicit class GdataDiffVersionResponseOps[Self <: GdataDiffVersionResponse] (val x: Self) extends AnyVal {
    
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
    def setObjectSizeBytes(value: String): Self = this.set("objectSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectSizeBytes: Self = this.set("objectSizeBytes", js.undefined)
    
    @scala.inline
    def setObjectVersion(value: String): Self = this.set("objectVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectVersion: Self = this.set("objectVersion", js.undefined)
  }
}
