package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceConfigsResponse extends StObject {
  
  /** The token of the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of service configuration resources. */
  var serviceConfigs: js.UndefOr[js.Array[Service]] = js.undefined
}
object ListServiceConfigsResponse {
  
  inline def apply(): ListServiceConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceConfigsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListServiceConfigsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setServiceConfigs(value: js.Array[Service]): Self = StObject.set(x, "serviceConfigs", value.asInstanceOf[js.Any])
    
    inline def setServiceConfigsUndefined: Self = StObject.set(x, "serviceConfigs", js.undefined)
    
    inline def setServiceConfigsVarargs(value: Service*): Self = StObject.set(x, "serviceConfigs", js.Array(value*))
  }
}
