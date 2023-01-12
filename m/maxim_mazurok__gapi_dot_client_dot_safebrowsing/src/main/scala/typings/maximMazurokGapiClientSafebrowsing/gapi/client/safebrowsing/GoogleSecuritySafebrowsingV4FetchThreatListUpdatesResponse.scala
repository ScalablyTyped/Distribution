package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse extends StObject {
  
  /**
    * The list updates requested by the clients. The number of responses here may be less than the number of requests sent by clients. This is the case, for example, if the server has no
    * updates for a particular list.
    */
  var listUpdateResponses: js.UndefOr[
    js.Array[GoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponseListUpdateResponse]
  ] = js.undefined
  
  /** The minimum duration the client must wait before issuing any update request. If this field is not set clients may update as soon as they want. */
  var minimumWaitDuration: js.UndefOr[String] = js.undefined
}
object GoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse {
  
  inline def apply(): GoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponse] (val x: Self) extends AnyVal {
    
    inline def setListUpdateResponses(value: js.Array[GoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponseListUpdateResponse]): Self = StObject.set(x, "listUpdateResponses", value.asInstanceOf[js.Any])
    
    inline def setListUpdateResponsesUndefined: Self = StObject.set(x, "listUpdateResponses", js.undefined)
    
    inline def setListUpdateResponsesVarargs(value: GoogleSecuritySafebrowsingV4FetchThreatListUpdatesResponseListUpdateResponse*): Self = StObject.set(x, "listUpdateResponses", js.Array(value*))
    
    inline def setMinimumWaitDuration(value: String): Self = StObject.set(x, "minimumWaitDuration", value.asInstanceOf[js.Any])
    
    inline def setMinimumWaitDurationUndefined: Self = StObject.set(x, "minimumWaitDuration", js.undefined)
  }
}
