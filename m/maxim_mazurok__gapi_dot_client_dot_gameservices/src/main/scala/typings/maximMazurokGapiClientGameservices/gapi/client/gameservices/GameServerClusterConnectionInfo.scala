package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameServerClusterConnectionInfo extends StObject {
  
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
  implicit class GameServerClusterConnectionInfoMutableBuilder[Self <: GameServerClusterConnectionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGkeClusterReference(value: GkeClusterReference): Self = StObject.set(x, "gkeClusterReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGkeClusterReferenceUndefined: Self = StObject.set(x, "gkeClusterReference", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
  }
}
