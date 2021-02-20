package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInstanceConfigsResponse extends StObject {
  
  /** The list of requested instance configurations. */
  var instanceConfigs: js.UndefOr[js.Array[InstanceConfig]] = js.native
  
  /** `next_page_token` can be sent in a subsequent ListInstanceConfigs call to fetch more of the matching instance configurations. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListInstanceConfigsResponse {
  
  @scala.inline
  def apply(): ListInstanceConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInstanceConfigsResponse]
  }
  
  @scala.inline
  implicit class ListInstanceConfigsResponseMutableBuilder[Self <: ListInstanceConfigsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceConfigs(value: js.Array[InstanceConfig]): Self = StObject.set(x, "instanceConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceConfigsUndefined: Self = StObject.set(x, "instanceConfigs", js.undefined)
    
    @scala.inline
    def setInstanceConfigsVarargs(value: InstanceConfig*): Self = StObject.set(x, "instanceConfigs", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
