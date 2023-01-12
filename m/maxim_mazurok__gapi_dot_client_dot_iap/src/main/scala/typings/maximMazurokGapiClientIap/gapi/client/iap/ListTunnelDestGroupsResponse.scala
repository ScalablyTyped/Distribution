package typings.maximMazurokGapiClientIap.gapi.client.iap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTunnelDestGroupsResponse extends StObject {
  
  /** A token that you can send as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** TunnelDestGroup existing in the project. */
  var tunnelDestGroups: js.UndefOr[js.Array[TunnelDestGroup]] = js.undefined
}
object ListTunnelDestGroupsResponse {
  
  inline def apply(): ListTunnelDestGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTunnelDestGroupsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTunnelDestGroupsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTunnelDestGroups(value: js.Array[TunnelDestGroup]): Self = StObject.set(x, "tunnelDestGroups", value.asInstanceOf[js.Any])
    
    inline def setTunnelDestGroupsUndefined: Self = StObject.set(x, "tunnelDestGroups", js.undefined)
    
    inline def setTunnelDestGroupsVarargs(value: TunnelDestGroup*): Self = StObject.set(x, "tunnelDestGroups", js.Array(value*))
  }
}
