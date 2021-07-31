package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviewDeleteGameServerClusterResponse extends StObject {
  
  /** The ETag of the game server cluster. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** The target state. */
  var targetState: js.UndefOr[TargetState] = js.undefined
}
object PreviewDeleteGameServerClusterResponse {
  
  @scala.inline
  def apply(): PreviewDeleteGameServerClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviewDeleteGameServerClusterResponse]
  }
  
  @scala.inline
  implicit class PreviewDeleteGameServerClusterResponseMutableBuilder[Self <: PreviewDeleteGameServerClusterResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setTargetState(value: TargetState): Self = StObject.set(x, "targetState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetStateUndefined: Self = StObject.set(x, "targetState", js.undefined)
  }
}
