package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestroySecretVersionRequest extends StObject {
  
  /** Optional. Etag of the SecretVersion. The request succeeds if it matches the etag of the currently stored secret version object. If the etag is omitted, the request succeeds. */
  var etag: js.UndefOr[String] = js.undefined
}
object DestroySecretVersionRequest {
  
  inline def apply(): DestroySecretVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestroySecretVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DestroySecretVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
  }
}
