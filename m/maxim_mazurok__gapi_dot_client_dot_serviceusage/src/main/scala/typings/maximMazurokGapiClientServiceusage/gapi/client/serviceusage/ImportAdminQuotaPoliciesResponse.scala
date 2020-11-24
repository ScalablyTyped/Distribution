package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportAdminQuotaPoliciesResponse extends js.Object {
  
  /** The policies that were created from the imported data. */
  var policies: js.UndefOr[js.Array[AdminQuotaPolicy]] = js.native
}
object ImportAdminQuotaPoliciesResponse {
  
  @scala.inline
  def apply(): ImportAdminQuotaPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportAdminQuotaPoliciesResponse]
  }
  
  @scala.inline
  implicit class ImportAdminQuotaPoliciesResponseOps[Self <: ImportAdminQuotaPoliciesResponse] (val x: Self) extends AnyVal {
    
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
    def setPoliciesVarargs(value: AdminQuotaPolicy*): Self = this.set("policies", js.Array(value :_*))
    
    @scala.inline
    def setPolicies(value: js.Array[AdminQuotaPolicy]): Self = this.set("policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicies: Self = this.set("policies", js.undefined)
  }
}
