package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListShaCertificatesResponse extends StObject {
  
  /** The list of each `ShaCertificate` associated with the `AndroidApp`. */
  var certificates: js.UndefOr[js.Array[ShaCertificate]] = js.native
}
object ListShaCertificatesResponse {
  
  @scala.inline
  def apply(): ListShaCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListShaCertificatesResponse]
  }
  
  @scala.inline
  implicit class ListShaCertificatesResponseMutableBuilder[Self <: ListShaCertificatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificates(value: js.Array[ShaCertificate]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
    
    @scala.inline
    def setCertificatesVarargs(value: ShaCertificate*): Self = StObject.set(x, "certificates", js.Array(value :_*))
  }
}
