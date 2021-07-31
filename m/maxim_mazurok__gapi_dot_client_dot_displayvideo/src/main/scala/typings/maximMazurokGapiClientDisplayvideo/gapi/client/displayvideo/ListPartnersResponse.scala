package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPartnersResponse extends StObject {
  
  /** A token to retrieve the next page of results. Pass this value in the page_token field in the subsequent call to `ListPartners` method to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of partners. This list will be absent if empty. */
  var partners: js.UndefOr[js.Array[Partner]] = js.undefined
}
object ListPartnersResponse {
  
  @scala.inline
  def apply(): ListPartnersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPartnersResponse]
  }
  
  @scala.inline
  implicit class ListPartnersResponseMutableBuilder[Self <: ListPartnersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setPartners(value: js.Array[Partner]): Self = StObject.set(x, "partners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartnersUndefined: Self = StObject.set(x, "partners", js.undefined)
    
    @scala.inline
    def setPartnersVarargs(value: Partner*): Self = StObject.set(x, "partners", js.Array(value :_*))
  }
}
