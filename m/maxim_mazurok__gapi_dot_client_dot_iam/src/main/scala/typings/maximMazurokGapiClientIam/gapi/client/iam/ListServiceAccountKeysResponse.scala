package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListServiceAccountKeysResponse extends StObject {
  
  /** The public keys for the service account. */
  var keys: js.UndefOr[js.Array[ServiceAccountKey]] = js.native
}
object ListServiceAccountKeysResponse {
  
  @scala.inline
  def apply(): ListServiceAccountKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceAccountKeysResponse]
  }
  
  @scala.inline
  implicit class ListServiceAccountKeysResponseMutableBuilder[Self <: ListServiceAccountKeysResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeys(value: js.Array[ServiceAccountKey]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: ServiceAccountKey*): Self = StObject.set(x, "keys", js.Array(value :_*))
  }
}
