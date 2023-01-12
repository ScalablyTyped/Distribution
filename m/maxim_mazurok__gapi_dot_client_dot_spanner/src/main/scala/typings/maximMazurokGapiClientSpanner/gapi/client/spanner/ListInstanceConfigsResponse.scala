package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInstanceConfigsResponse extends StObject {
  
  /** The list of requested instance configurations. */
  var instanceConfigs: js.UndefOr[js.Array[InstanceConfig]] = js.undefined
  
  /** `next_page_token` can be sent in a subsequent ListInstanceConfigs call to fetch more of the matching instance configurations. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListInstanceConfigsResponse {
  
  inline def apply(): ListInstanceConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInstanceConfigsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListInstanceConfigsResponse] (val x: Self) extends AnyVal {
    
    inline def setInstanceConfigs(value: js.Array[InstanceConfig]): Self = StObject.set(x, "instanceConfigs", value.asInstanceOf[js.Any])
    
    inline def setInstanceConfigsUndefined: Self = StObject.set(x, "instanceConfigs", js.undefined)
    
    inline def setInstanceConfigsVarargs(value: InstanceConfig*): Self = StObject.set(x, "instanceConfigs", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
