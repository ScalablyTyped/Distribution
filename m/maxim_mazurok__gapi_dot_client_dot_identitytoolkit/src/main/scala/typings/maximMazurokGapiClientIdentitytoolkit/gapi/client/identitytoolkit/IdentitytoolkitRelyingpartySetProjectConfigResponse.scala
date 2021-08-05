package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentitytoolkitRelyingpartySetProjectConfigResponse extends StObject {
  
  /** Project ID of the relying party. */
  var projectId: js.UndefOr[String] = js.undefined
}
object IdentitytoolkitRelyingpartySetProjectConfigResponse {
  
  inline def apply(): IdentitytoolkitRelyingpartySetProjectConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartySetProjectConfigResponse]
  }
  
  extension [Self <: IdentitytoolkitRelyingpartySetProjectConfigResponse](x: Self) {
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
