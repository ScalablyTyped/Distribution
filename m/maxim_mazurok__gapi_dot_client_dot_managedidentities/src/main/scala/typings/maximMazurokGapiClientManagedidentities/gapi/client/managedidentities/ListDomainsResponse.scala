package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDomainsResponse extends StObject {
  
  /** A list of Managed Identities Service domains in the project. */
  var domains: js.UndefOr[js.Array[Domain]] = js.native
  
  /** A token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** A list of locations that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
}
object ListDomainsResponse {
  
  @scala.inline
  def apply(): ListDomainsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainsResponse]
  }
  
  @scala.inline
  implicit class ListDomainsResponseMutableBuilder[Self <: ListDomainsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomains(value: js.Array[Domain]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    @scala.inline
    def setDomainsVarargs(value: Domain*): Self = StObject.set(x, "domains", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    @scala.inline
    def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value :_*))
  }
}
