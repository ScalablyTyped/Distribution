package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGameServerDeploymentsResponse extends StObject {
  
  /** The list of game server deployments. */
  var gameServerDeployments: js.UndefOr[js.Array[GameServerDeployment]] = js.undefined
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** List of locations that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.undefined
}
object ListGameServerDeploymentsResponse {
  
  @scala.inline
  def apply(): ListGameServerDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGameServerDeploymentsResponse]
  }
  
  @scala.inline
  implicit class ListGameServerDeploymentsResponseMutableBuilder[Self <: ListGameServerDeploymentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameServerDeployments(value: js.Array[GameServerDeployment]): Self = StObject.set(x, "gameServerDeployments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameServerDeploymentsUndefined: Self = StObject.set(x, "gameServerDeployments", js.undefined)
    
    @scala.inline
    def setGameServerDeploymentsVarargs(value: GameServerDeployment*): Self = StObject.set(x, "gameServerDeployments", js.Array(value :_*))
    
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
