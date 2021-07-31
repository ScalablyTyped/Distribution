package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRealmsResponse extends StObject {
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of realms. */
  var realms: js.UndefOr[js.Array[Realm]] = js.undefined
  
  /** List of locations that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.undefined
}
object ListRealmsResponse {
  
  @scala.inline
  def apply(): ListRealmsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRealmsResponse]
  }
  
  @scala.inline
  implicit class ListRealmsResponseMutableBuilder[Self <: ListRealmsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setRealms(value: js.Array[Realm]): Self = StObject.set(x, "realms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealmsUndefined: Self = StObject.set(x, "realms", js.undefined)
    
    @scala.inline
    def setRealmsVarargs(value: Realm*): Self = StObject.set(x, "realms", js.Array(value :_*))
    
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    @scala.inline
    def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value :_*))
  }
}
