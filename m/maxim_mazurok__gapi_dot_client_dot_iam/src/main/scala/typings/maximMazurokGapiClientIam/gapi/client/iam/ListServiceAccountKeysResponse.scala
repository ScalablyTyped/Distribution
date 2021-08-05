package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceAccountKeysResponse extends StObject {
  
  /** The public keys for the service account. */
  var keys: js.UndefOr[js.Array[ServiceAccountKey]] = js.undefined
}
object ListServiceAccountKeysResponse {
  
  inline def apply(): ListServiceAccountKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceAccountKeysResponse]
  }
  
  extension [Self <: ListServiceAccountKeysResponse](x: Self) {
    
    inline def setKeys(value: js.Array[ServiceAccountKey]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: ServiceAccountKey*): Self = StObject.set(x, "keys", js.Array(value :_*))
  }
}
