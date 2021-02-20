package typings.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Secret extends StObject {
  
  /** The value of the cipherText response from the `encrypt` method. This field is intentionally unaudited. */
  var cipherText: js.UndefOr[String] = js.native
  
  /**
    * The name of the Cloud KMS key that will be used to decrypt the secret value. The VM service account must have the required permissions and authentication scopes to invoke the
    * `decrypt` method on the specified key.
    */
  var keyName: js.UndefOr[String] = js.native
}
object Secret {
  
  @scala.inline
  def apply(): Secret = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Secret]
  }
  
  @scala.inline
  implicit class SecretMutableBuilder[Self <: Secret] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCipherText(value: String): Self = StObject.set(x, "cipherText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCipherTextUndefined: Self = StObject.set(x, "cipherText", js.undefined)
    
    @scala.inline
    def setKeyName(value: String): Self = StObject.set(x, "keyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNameUndefined: Self = StObject.set(x, "keyName", js.undefined)
  }
}
