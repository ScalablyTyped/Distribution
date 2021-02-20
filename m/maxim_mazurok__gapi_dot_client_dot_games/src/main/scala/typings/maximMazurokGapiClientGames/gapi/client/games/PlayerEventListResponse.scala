package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayerEventListResponse extends StObject {
  
  /** The player events. */
  var items: js.UndefOr[js.Array[PlayerEvent]] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#playerEventListResponse`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The pagination token for the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object PlayerEventListResponse {
  
  @scala.inline
  def apply(): PlayerEventListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerEventListResponse]
  }
  
  @scala.inline
  implicit class PlayerEventListResponseMutableBuilder[Self <: PlayerEventListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[PlayerEvent]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: PlayerEvent*): Self = StObject.set(x, "items", js.Array(value :_*))
    
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
