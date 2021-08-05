package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviewGameServerDeploymentRolloutResponse extends StObject {
  
  /** ETag of the game server deployment. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** The target state. */
  var targetState: js.UndefOr[TargetState] = js.undefined
  
  /** Locations that could not be reached on this request. */
  var unavailable: js.UndefOr[js.Array[String]] = js.undefined
}
object PreviewGameServerDeploymentRolloutResponse {
  
  inline def apply(): PreviewGameServerDeploymentRolloutResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviewGameServerDeploymentRolloutResponse]
  }
  
  extension [Self <: PreviewGameServerDeploymentRolloutResponse](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setTargetState(value: TargetState): Self = StObject.set(x, "targetState", value.asInstanceOf[js.Any])
    
    inline def setTargetStateUndefined: Self = StObject.set(x, "targetState", js.undefined)
    
    inline def setUnavailable(value: js.Array[String]): Self = StObject.set(x, "unavailable", value.asInstanceOf[js.Any])
    
    inline def setUnavailableUndefined: Self = StObject.set(x, "unavailable", js.undefined)
    
    inline def setUnavailableVarargs(value: String*): Self = StObject.set(x, "unavailable", js.Array(value :_*))
  }
}
