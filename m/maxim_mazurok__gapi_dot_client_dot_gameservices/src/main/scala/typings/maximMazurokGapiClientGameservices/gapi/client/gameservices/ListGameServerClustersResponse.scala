package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGameServerClustersResponse extends StObject {
  
  /** The list of game server clusters. */
  var gameServerClusters: js.UndefOr[js.Array[GameServerCluster]] = js.undefined
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** List of locations that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.undefined
}
object ListGameServerClustersResponse {
  
  @scala.inline
  def apply(): ListGameServerClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGameServerClustersResponse]
  }
  
  @scala.inline
  implicit class ListGameServerClustersResponseMutableBuilder[Self <: ListGameServerClustersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameServerClusters(value: js.Array[GameServerCluster]): Self = StObject.set(x, "gameServerClusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameServerClustersUndefined: Self = StObject.set(x, "gameServerClusters", js.undefined)
    
    @scala.inline
    def setGameServerClustersVarargs(value: GameServerCluster*): Self = StObject.set(x, "gameServerClusters", js.Array(value :_*))
    
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
