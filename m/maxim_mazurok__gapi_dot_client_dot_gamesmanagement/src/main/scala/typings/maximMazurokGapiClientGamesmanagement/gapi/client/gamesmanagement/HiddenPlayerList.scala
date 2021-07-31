package typings.maximMazurokGapiClientGamesmanagement.gapi.client.gamesmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HiddenPlayerList extends StObject {
  
  /** The players. */
  var items: js.UndefOr[js.Array[HiddenPlayer]] = js.undefined
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `gamesManagement#hiddenPlayerList`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The pagination token for the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object HiddenPlayerList {
  
  @scala.inline
  def apply(): HiddenPlayerList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HiddenPlayerList]
  }
  
  @scala.inline
  implicit class HiddenPlayerListMutableBuilder[Self <: HiddenPlayerList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[HiddenPlayer]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: HiddenPlayer*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
