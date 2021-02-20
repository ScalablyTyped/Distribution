package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SslCertsInsertRequest extends StObject {
  
  /** User supplied name. Must be a distinct name from the other certificates for this instance. */
  var commonName: js.UndefOr[String] = js.native
}
object SslCertsInsertRequest {
  
  @scala.inline
  def apply(): SslCertsInsertRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslCertsInsertRequest]
  }
  
  @scala.inline
  implicit class SslCertsInsertRequestMutableBuilder[Self <: SslCertsInsertRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonNameUndefined: Self = StObject.set(x, "commonName", js.undefined)
  }
}
