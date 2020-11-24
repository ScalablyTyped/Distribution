package typings.maximMazurokGapiClientSiteverification.gapi.client.siteverification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SiteVerificationWebResourceListResponse extends js.Object {
  
  /** The list of sites that are owned by the authenticated user. */
  var items: js.UndefOr[js.Array[SiteVerificationWebResourceResource]] = js.native
}
object SiteVerificationWebResourceListResponse {
  
  @scala.inline
  def apply(): SiteVerificationWebResourceListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiteVerificationWebResourceListResponse]
  }
  
  @scala.inline
  implicit class SiteVerificationWebResourceListResponseOps[Self <: SiteVerificationWebResourceListResponse] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: SiteVerificationWebResourceResource*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[SiteVerificationWebResourceResource]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
}
