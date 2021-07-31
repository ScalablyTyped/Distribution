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
  
  @scala.inline
  def apply(): PreviewGameServerDeploymentRolloutResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviewGameServerDeploymentRolloutResponse]
  }
  
  @scala.inline
  implicit class PreviewGameServerDeploymentRolloutResponseMutableBuilder[Self <: PreviewGameServerDeploymentRolloutResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setTargetState(value: TargetState): Self = StObject.set(x, "targetState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetStateUndefined: Self = StObject.set(x, "targetState", js.undefined)
    
    @scala.inline
    def setUnavailable(value: js.Array[String]): Self = StObject.set(x, "unavailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnavailableUndefined: Self = StObject.set(x, "unavailable", js.undefined)
    
    @scala.inline
    def setUnavailableVarargs(value: String*): Self = StObject.set(x, "unavailable", js.Array(value :_*))
  }
}
