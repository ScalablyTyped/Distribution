package typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GdataDownloadParameters extends js.Object {
  
  /** gdata */
  var allowGzipCompression: js.UndefOr[Boolean] = js.native
  
  /** gdata */
  var ignoreRange: js.UndefOr[Boolean] = js.native
}
object GdataDownloadParameters {
  
  @scala.inline
  def apply(): GdataDownloadParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GdataDownloadParameters]
  }
  
  @scala.inline
  implicit class GdataDownloadParametersOps[Self <: GdataDownloadParameters] (val x: Self) extends AnyVal {
    
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
    def setAllowGzipCompression(value: Boolean): Self = this.set("allowGzipCompression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowGzipCompression: Self = this.set("allowGzipCompression", js.undefined)
    
    @scala.inline
    def setIgnoreRange(value: Boolean): Self = this.set("ignoreRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreRange: Self = this.set("ignoreRange", js.undefined)
  }
}
