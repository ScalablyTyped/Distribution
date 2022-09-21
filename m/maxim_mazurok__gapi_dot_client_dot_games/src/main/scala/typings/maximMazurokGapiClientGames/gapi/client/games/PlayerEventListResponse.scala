package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerEventListResponse extends StObject {
  
  /** The player events. */
  var items: js.UndefOr[js.Array[PlayerEvent]] = js.undefined
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#playerEventListResponse`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The pagination token for the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object PlayerEventListResponse {
  
  inline def apply(): PlayerEventListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerEventListResponse]
  }
  
  extension [Self <: PlayerEventListResponse](x: Self) {
    
    inline def setItems(value: js.Array[PlayerEvent]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: PlayerEvent*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
