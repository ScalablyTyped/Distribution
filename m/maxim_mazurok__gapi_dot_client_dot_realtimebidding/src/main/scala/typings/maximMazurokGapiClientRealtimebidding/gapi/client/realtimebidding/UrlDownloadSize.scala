package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlDownloadSize extends js.Object {
  
  /** Download size of the URL in kilobytes. */
  var downloadSizeKb: js.UndefOr[Double] = js.native
  
  /** The normalized URL with query parameters and fragment removed. */
  var normalizedUrl: js.UndefOr[String] = js.native
}
object UrlDownloadSize {
  
  @scala.inline
  def apply(): UrlDownloadSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlDownloadSize]
  }
  
  @scala.inline
  implicit class UrlDownloadSizeOps[Self <: UrlDownloadSize] (val x: Self) extends AnyVal {
    
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
    def setDownloadSizeKb(value: Double): Self = this.set("downloadSizeKb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadSizeKb: Self = this.set("downloadSizeKb", js.undefined)
    
    @scala.inline
    def setNormalizedUrl(value: String): Self = this.set("normalizedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizedUrl: Self = this.set("normalizedUrl", js.undefined)
  }
}
