package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUptimeCheckIpsResponse extends StObject {
  
  /**
    * This field represents the pagination token to retrieve the next page of results. If the value is empty, it means no further results for the request. To retrieve the next page of
    * results, the value of the next_page_token is passed to the subsequent List method call (in the request message's page_token field). NOTE: this field is not yet implemented
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The returned list of IP addresses (including region and location) that the checkers run from. */
  var uptimeCheckIps: js.UndefOr[js.Array[UptimeCheckIp]] = js.undefined
}
object ListUptimeCheckIpsResponse {
  
  inline def apply(): ListUptimeCheckIpsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUptimeCheckIpsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListUptimeCheckIpsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUptimeCheckIps(value: js.Array[UptimeCheckIp]): Self = StObject.set(x, "uptimeCheckIps", value.asInstanceOf[js.Any])
    
    inline def setUptimeCheckIpsUndefined: Self = StObject.set(x, "uptimeCheckIps", js.undefined)
    
    inline def setUptimeCheckIpsVarargs(value: UptimeCheckIp*): Self = StObject.set(x, "uptimeCheckIps", js.Array(value*))
  }
}
