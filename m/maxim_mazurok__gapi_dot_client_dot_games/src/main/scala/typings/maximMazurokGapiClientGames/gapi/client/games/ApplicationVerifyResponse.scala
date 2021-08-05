package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationVerifyResponse extends StObject {
  
  /** An alternate ID that was once used for the player that was issued the auth token used in this request. (This field is not normally populated.) */
  var alternate_player_id: js.UndefOr[String] = js.undefined
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#applicationVerifyResponse`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The ID of the player that was issued the auth token used in this request. */
  var player_id: js.UndefOr[String] = js.undefined
}
object ApplicationVerifyResponse {
  
  inline def apply(): ApplicationVerifyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationVerifyResponse]
  }
  
  extension [Self <: ApplicationVerifyResponse](x: Self) {
    
    inline def setAlternate_player_id(value: String): Self = StObject.set(x, "alternate_player_id", value.asInstanceOf[js.Any])
    
    inline def setAlternate_player_idUndefined: Self = StObject.set(x, "alternate_player_id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPlayer_id(value: String): Self = StObject.set(x, "player_id", value.asInstanceOf[js.Any])
    
    inline def setPlayer_idUndefined: Self = StObject.set(x, "player_id", js.undefined)
  }
}
