package typings.maximMazurokGapiClientGenomics.gapi.client.genomics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Secret extends StObject {
  
  /** The value of the cipherText response from the `encrypt` method. This field is intentionally unaudited. */
  var cipherText: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Cloud KMS key that will be used to decrypt the secret value. The VM service account must have the required permissions and authentication scopes to invoke the
    * `decrypt` method on the specified key.
    */
  var keyName: js.UndefOr[String] = js.undefined
}
object Secret {
  
  inline def apply(): Secret = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Secret]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Secret] (val x: Self) extends AnyVal {
    
    inline def setCipherText(value: String): Self = StObject.set(x, "cipherText", value.asInstanceOf[js.Any])
    
    inline def setCipherTextUndefined: Self = StObject.set(x, "cipherText", js.undefined)
    
    inline def setKeyName(value: String): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
    
    inline def setKeyNameUndefined: Self = StObject.set(x, "keyName", js.undefined)
  }
}
