package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewCreateGameServerClusterResponse extends StObject {
  
  /** The ETag of the game server cluster. */
  var etag: js.UndefOr[String] = js.native
  
  /** The target state. */
  var targetState: js.UndefOr[TargetState] = js.native
}
object PreviewCreateGameServerClusterResponse {
  
  @scala.inline
  def apply(): PreviewCreateGameServerClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviewCreateGameServerClusterResponse]
  }
  
  @scala.inline
  implicit class PreviewCreateGameServerClusterResponseMutableBuilder[Self <: PreviewCreateGameServerClusterResponse] (val x: Self) extends AnyVal {
    
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
