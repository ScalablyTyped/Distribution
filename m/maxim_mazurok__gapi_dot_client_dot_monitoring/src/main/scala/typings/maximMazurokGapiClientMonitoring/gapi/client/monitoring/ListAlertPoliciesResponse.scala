package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAlertPoliciesResponse extends js.Object {
  
  /** The returned alert policies. */
  var alertPolicies: js.UndefOr[js.Array[AlertPolicy]] = js.native
  
  /**
    * If there might be more results than were returned, then this field is set to a non-empty value. To see the additional results, use that value as page_token in the next call to this
    * method.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The total number of alert policies in all pages. This number is only an estimate, and may change in subsequent pages. https://aip.dev/158 */
  var totalSize: js.UndefOr[Double] = js.native
}
object ListAlertPoliciesResponse {
  
  @scala.inline
  def apply(): ListAlertPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAlertPoliciesResponse]
  }
  
  @scala.inline
  implicit class ListAlertPoliciesResponseOps[Self <: ListAlertPoliciesResponse] (val x: Self) extends AnyVal {
    
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
    def setAlertPoliciesVarargs(value: AlertPolicy*): Self = this.set("alertPolicies", js.Array(value :_*))
    
    @scala.inline
    def setAlertPolicies(value: js.Array[AlertPolicy]): Self = this.set("alertPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlertPolicies: Self = this.set("alertPolicies", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setTotalSize(value: Double): Self = this.set("totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalSize: Self = this.set("totalSize", js.undefined)
  }
}
