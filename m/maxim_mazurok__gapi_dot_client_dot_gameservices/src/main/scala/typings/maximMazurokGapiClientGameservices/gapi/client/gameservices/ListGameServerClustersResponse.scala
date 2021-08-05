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
  
  inline def apply(): ListGameServerClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGameServerClustersResponse]
  }
  
  extension [Self <: ListGameServerClustersResponse](x: Self) {
    
    inline def setGameServerClusters(value: js.Array[GameServerCluster]): Self = StObject.set(x, "gameServerClusters", value.asInstanceOf[js.Any])
    
    inline def setGameServerClustersUndefined: Self = StObject.set(x, "gameServerClusters", js.undefined)
    
    inline def setGameServerClustersVarargs(value: GameServerCluster*): Self = StObject.set(x, "gameServerClusters", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value :_*))
  }
}
