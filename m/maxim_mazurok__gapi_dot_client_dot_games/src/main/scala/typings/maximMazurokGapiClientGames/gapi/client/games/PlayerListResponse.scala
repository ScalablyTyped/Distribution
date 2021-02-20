package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayerListResponse extends StObject {
  
  /** The players. */
  var items: js.UndefOr[js.Array[Player]] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#playerListResponse`. */
  var kind: js.UndefOr[String] = js.native
  
  /** Token corresponding to the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object PlayerListResponse {
  
  @scala.inline
  def apply(): PlayerListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerListResponse]
  }
  
  @scala.inline
  implicit class PlayerListResponseMutableBuilder[Self <: PlayerListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[Player]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Player*): Self = StObject.set(x, "items", js.Array(value :_*))
    
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
