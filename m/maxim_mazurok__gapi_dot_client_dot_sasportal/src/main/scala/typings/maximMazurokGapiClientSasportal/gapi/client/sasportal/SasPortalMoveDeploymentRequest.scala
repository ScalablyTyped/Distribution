package typings.maximMazurokGapiClientSasportal.gapi.client.sasportal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SasPortalMoveDeploymentRequest extends StObject {
  
  /** Required. The name of the new parent resource Node or Customer to reparent the deployment under. */
  var destination: js.UndefOr[String] = js.undefined
}
object SasPortalMoveDeploymentRequest {
  
  inline def apply(): SasPortalMoveDeploymentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SasPortalMoveDeploymentRequest]
  }
  
  extension [Self <: SasPortalMoveDeploymentRequest](x: Self) {
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
  }
}
