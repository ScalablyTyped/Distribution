package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAlertPoliciesResponse extends StObject {
  
  /** The returned alert policies. */
  var alertPolicies: js.UndefOr[js.Array[AlertPolicy]] = js.undefined
  
  /**
    * If there might be more results than were returned, then this field is set to a non-empty value. To see the additional results, use that value as page_token in the next call to this
    * method.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The total number of alert policies in all pages. This number is only an estimate, and may change in subsequent pages. https://aip.dev/158 */
  var totalSize: js.UndefOr[Double] = js.undefined
}
object ListAlertPoliciesResponse {
  
  inline def apply(): ListAlertPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAlertPoliciesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAlertPoliciesResponse] (val x: Self) extends AnyVal {
    
    inline def setAlertPolicies(value: js.Array[AlertPolicy]): Self = StObject.set(x, "alertPolicies", value.asInstanceOf[js.Any])
    
    inline def setAlertPoliciesUndefined: Self = StObject.set(x, "alertPolicies", js.undefined)
    
    inline def setAlertPoliciesVarargs(value: AlertPolicy*): Self = StObject.set(x, "alertPolicies", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
