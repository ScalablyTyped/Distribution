package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListServiceConfigsResponse extends StObject {
  
  /** The token of the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of service configuration resources. */
  var serviceConfigs: js.UndefOr[js.Array[Service]] = js.native
}
object ListServiceConfigsResponse {
  
  @scala.inline
  def apply(): ListServiceConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceConfigsResponse]
  }
  
  @scala.inline
  implicit class ListServiceConfigsResponseMutableBuilder[Self <: ListServiceConfigsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setServiceConfigs(value: js.Array[Service]): Self = StObject.set(x, "serviceConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceConfigsUndefined: Self = StObject.set(x, "serviceConfigs", js.undefined)
    
    @scala.inline
    def setServiceConfigsVarargs(value: Service*): Self = StObject.set(x, "serviceConfigs", js.Array(value :_*))
  }
}
