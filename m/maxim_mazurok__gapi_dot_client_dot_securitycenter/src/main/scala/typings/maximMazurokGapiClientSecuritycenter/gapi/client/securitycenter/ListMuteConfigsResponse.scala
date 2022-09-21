package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMuteConfigsResponse extends StObject {
  
  /** The mute configs from the specified parent. */
  var muteConfigs: js.UndefOr[js.Array[GoogleCloudSecuritycenterV1MuteConfig]] = js.undefined
  
  /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListMuteConfigsResponse {
  
  inline def apply(): ListMuteConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMuteConfigsResponse]
  }
  
  extension [Self <: ListMuteConfigsResponse](x: Self) {
    
    inline def setMuteConfigs(value: js.Array[GoogleCloudSecuritycenterV1MuteConfig]): Self = StObject.set(x, "muteConfigs", value.asInstanceOf[js.Any])
    
    inline def setMuteConfigsUndefined: Self = StObject.set(x, "muteConfigs", js.undefined)
    
    inline def setMuteConfigsVarargs(value: GoogleCloudSecuritycenterV1MuteConfig*): Self = StObject.set(x, "muteConfigs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
