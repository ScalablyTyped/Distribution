package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameServerClusterConnectionInfo extends js.Object {
  
  /** Reference to the GKE cluster where the game servers are installed. */
  var gkeClusterReference: js.UndefOr[GkeClusterReference] = js.native
  
  /** Namespace designated on the game server cluster where the Agones game server instances will be created. Existence of the namespace will be validated during creation. */
  var namespace: js.UndefOr[String] = js.native
}
object GameServerClusterConnectionInfo {
  
  @scala.inline
  def apply(): GameServerClusterConnectionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameServerClusterConnectionInfo]
  }
  
  @scala.inline
  implicit class GameServerClusterConnectionInfoOps[Self <: GameServerClusterConnectionInfo] (val x: Self) extends AnyVal {
    
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
    def setGkeClusterReference(value: GkeClusterReference): Self = this.set("gkeClusterReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGkeClusterReference: Self = this.set("gkeClusterReference", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
  }
}
