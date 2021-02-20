package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGameServerConfigsResponse extends StObject {
  
  /** The list of game server configs. */
  var gameServerConfigs: js.UndefOr[js.Array[GameServerConfig]] = js.native
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** List of locations that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
}
object ListGameServerConfigsResponse {
  
  @scala.inline
  def apply(): ListGameServerConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGameServerConfigsResponse]
  }
  
  @scala.inline
  implicit class ListGameServerConfigsResponseMutableBuilder[Self <: ListGameServerConfigsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameServerConfigs(value: js.Array[GameServerConfig]): Self = StObject.set(x, "gameServerConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameServerConfigsUndefined: Self = StObject.set(x, "gameServerConfigs", js.undefined)
    
    @scala.inline
    def setGameServerConfigsVarargs(value: GameServerConfig*): Self = StObject.set(x, "gameServerConfigs", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    @scala.inline
    def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value :_*))
  }
}
