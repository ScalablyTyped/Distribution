package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameServerClusterConnectionInfo extends StObject {
  
  /** Reference to the GKE cluster where the game servers are installed. */
  var gkeClusterReference: js.UndefOr[GkeClusterReference] = js.undefined
  
  /** Namespace designated on the game server cluster where the Agones game server instances will be created. Existence of the namespace will be validated during creation. */
  var namespace: js.UndefOr[String] = js.undefined
}
object GameServerClusterConnectionInfo {
  
  inline def apply(): GameServerClusterConnectionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameServerClusterConnectionInfo]
  }
  
  extension [Self <: GameServerClusterConnectionInfo](x: Self) {
    
    inline def setGkeClusterReference(value: GkeClusterReference): Self = StObject.set(x, "gkeClusterReference", value.asInstanceOf[js.Any])
    
    inline def setGkeClusterReferenceUndefined: Self = StObject.set(x, "gkeClusterReference", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
  }
}
