package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SslCertsListResponse extends StObject {
  
  /** List of client certificates for the instance. */
  var items: js.UndefOr[js.Array[SslCert]] = js.native
  
  /** This is always *sql#sslCertsList*. */
  var kind: js.UndefOr[String] = js.native
}
object SslCertsListResponse {
  
  @scala.inline
  def apply(): SslCertsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslCertsListResponse]
  }
  
  @scala.inline
  implicit class SslCertsListResponseMutableBuilder[Self <: SslCertsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SslCert]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SslCert*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
