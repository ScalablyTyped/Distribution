package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignBlobRequest extends StObject {
  
  /** Required. Deprecated. [Migrate to Service Account Credentials API](https://cloud.google.com/iam/help/credentials/migrate-api). The bytes to sign. */
  var bytesToSign: js.UndefOr[String] = js.undefined
}
object SignBlobRequest {
  
  inline def apply(): SignBlobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignBlobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignBlobRequest] (val x: Self) extends AnyVal {
    
    inline def setBytesToSign(value: String): Self = StObject.set(x, "bytesToSign", value.asInstanceOf[js.Any])
    
    inline def setBytesToSignUndefined: Self = StObject.set(x, "bytesToSign", js.undefined)
  }
}
