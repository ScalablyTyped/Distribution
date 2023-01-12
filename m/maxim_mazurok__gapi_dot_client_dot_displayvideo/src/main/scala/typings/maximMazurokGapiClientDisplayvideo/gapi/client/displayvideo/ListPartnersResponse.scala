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
  
  inline def apply(): ListPartnersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPartnersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPartnersResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPartners(value: js.Array[Partner]): Self = StObject.set(x, "partners", value.asInstanceOf[js.Any])
    
    inline def setPartnersUndefined: Self = StObject.set(x, "partners", js.undefined)
    
    inline def setPartnersVarargs(value: Partner*): Self = StObject.set(x, "partners", js.Array(value*))
  }
}
