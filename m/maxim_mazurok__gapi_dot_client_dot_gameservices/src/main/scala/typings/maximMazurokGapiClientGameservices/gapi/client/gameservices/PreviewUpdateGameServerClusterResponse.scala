package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviewUpdateGameServerClusterResponse extends StObject {
  
  /** The ETag of the game server cluster. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** The target state. */
  var targetState: js.UndefOr[TargetState] = js.undefined
}
object PreviewUpdateGameServerClusterResponse {
  
  inline def apply(): PreviewUpdateGameServerClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviewUpdateGameServerClusterResponse]
  }
  
  extension [Self <: PreviewUpdateGameServerClusterResponse](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setTargetState(value: TargetState): Self = StObject.set(x, "targetState", value.asInstanceOf[js.Any])
    
    inline def setTargetStateUndefined: Self = StObject.set(x, "targetState", js.undefined)
  }
}
