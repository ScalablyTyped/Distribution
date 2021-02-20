package typings.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentitytoolkitRelyingpartySetProjectConfigResponse extends StObject {
  
  /** Project ID of the relying party. */
  var projectId: js.UndefOr[String] = js.native
}
object IdentitytoolkitRelyingpartySetProjectConfigResponse {
  
  @scala.inline
  def apply(): IdentitytoolkitRelyingpartySetProjectConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartySetProjectConfigResponse]
  }
  
  @scala.inline
  implicit class IdentitytoolkitRelyingpartySetProjectConfigResponseMutableBuilder[Self <: IdentitytoolkitRelyingpartySetProjectConfigResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
