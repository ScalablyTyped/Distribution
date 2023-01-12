package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalMoveNodeRequest extends StObject {
  
  /** Required. The name of the new parent resource node or customer to reparent the node under. */
  var destination: js.UndefOr[String] = js.undefined
}
object SasPortalMoveNodeRequest {
  
  inline def apply(): SasPortalMoveNodeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalMoveNodeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SasPortalMoveNodeRequest] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
  }
}
