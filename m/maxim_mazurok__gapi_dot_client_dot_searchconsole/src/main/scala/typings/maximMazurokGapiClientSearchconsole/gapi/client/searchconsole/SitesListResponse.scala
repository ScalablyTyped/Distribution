package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SitesListResponse extends js.Object {
  
  /** Contains permission level information about a Search Console site. For more information, see [Permissions in Search Console](https://support.google.com/webmasters/answer/2451999). */
  var siteEntry: js.UndefOr[js.Array[WmxSite]] = js.native
}
object SitesListResponse {
  
  @scala.inline
  def apply(): SitesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SitesListResponse]
  }
  
  @scala.inline
  implicit class SitesListResponseOps[Self <: SitesListResponse] (val x: Self) extends AnyVal {
    
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
    def setSiteEntryVarargs(value: WmxSite*): Self = this.set("siteEntry", js.Array(value :_*))
    
    @scala.inline
    def setSiteEntry(value: js.Array[WmxSite]): Self = this.set("siteEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteEntry: Self = this.set("siteEntry", js.undefined)
  }
}
