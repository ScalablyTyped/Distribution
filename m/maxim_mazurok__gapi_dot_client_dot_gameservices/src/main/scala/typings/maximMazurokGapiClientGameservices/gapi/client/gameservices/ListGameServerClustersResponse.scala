package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGameServerClustersResponse extends js.Object {
  
  /** The list of game server clusters. */
  var gameServerClusters: js.UndefOr[js.Array[GameServerCluster]] = js.native
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** List of locations that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
}
object ListGameServerClustersResponse {
  
  @scala.inline
  def apply(): ListGameServerClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGameServerClustersResponse]
  }
  
  @scala.inline
  implicit class ListGameServerClustersResponseOps[Self <: ListGameServerClustersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGameServerClustersVarargs(value: GameServerCluster*): Self = this.set("gameServerClusters", js.Array(value :_*))
    
    @scala.inline
    def setGameServerClusters(value: js.Array[GameServerCluster]): Self = this.set("gameServerClusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameServerClusters: Self = this.set("gameServerClusters", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setUnreachableVarargs(value: String*): Self = this.set("unreachable", js.Array(value :_*))
    
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = this.set("unreachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnreachable: Self = this.set("unreachable", js.undefined)
  }
}
