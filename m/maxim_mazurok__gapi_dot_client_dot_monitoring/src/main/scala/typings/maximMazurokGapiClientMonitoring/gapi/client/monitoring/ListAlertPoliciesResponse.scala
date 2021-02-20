package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAlertPoliciesResponse extends StObject {
  
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
  implicit class ListAlertPoliciesResponseMutableBuilder[Self <: ListAlertPoliciesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlertPolicies(value: js.Array[AlertPolicy]): Self = StObject.set(x, "alertPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertPoliciesUndefined: Self = StObject.set(x, "alertPolicies", js.undefined)
    
    @scala.inline
    def setAlertPoliciesVarargs(value: AlertPolicy*): Self = StObject.set(x, "alertPolicies", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
