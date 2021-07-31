package typings.maximMazurokGapiClientProdTtSasportal.gapi.client.prodTtSasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalMoveNodeRequest extends StObject {
  
  /** Required. The name of the new parent resource node or Customer) to reparent the node under. */
  var destination: js.UndefOr[String] = js.undefined
}
object SasPortalMoveNodeRequest {
  
  @scala.inline
  def apply(): SasPortalMoveNodeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalMoveNodeRequest]
  }
  
  @scala.inline
  implicit class SasPortalMoveNodeRequestMutableBuilder[Self <: SasPortalMoveNodeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
  }
}
