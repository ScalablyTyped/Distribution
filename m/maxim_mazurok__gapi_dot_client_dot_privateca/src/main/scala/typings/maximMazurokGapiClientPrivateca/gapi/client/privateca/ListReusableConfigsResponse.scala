package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReusableConfigsResponse extends StObject {
  
  /** A token to retrieve next page of results. Pass this value in ListReusableConfigsRequest.next_page_token to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of ReusableConfigs. */
  var reusableConfigs: js.UndefOr[js.Array[ReusableConfig]] = js.native
  
  /** A list of locations (e.g. "us-west1") that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
}
object ListReusableConfigsResponse {
  
  @scala.inline
  def apply(): ListReusableConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReusableConfigsResponse]
  }
  
  @scala.inline
  implicit class ListReusableConfigsResponseMutableBuilder[Self <: ListReusableConfigsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setReusableConfigs(value: js.Array[ReusableConfig]): Self = StObject.set(x, "reusableConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReusableConfigsUndefined: Self = StObject.set(x, "reusableConfigs", js.undefined)
    
    @scala.inline
    def setReusableConfigsVarargs(value: ReusableConfig*): Self = StObject.set(x, "reusableConfigs", js.Array(value :_*))
    
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    @scala.inline
    def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value :_*))
  }
}
