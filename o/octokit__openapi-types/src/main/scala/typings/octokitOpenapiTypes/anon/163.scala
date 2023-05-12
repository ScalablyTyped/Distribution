package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `163` extends StObject {
  
  /** @description Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get a repository public key](https://docs.github.com/rest/reference/dependabot#get-a-repository-public-key) endpoint. */
  var encrypted_value: js.UndefOr[String] = js.undefined
  
  /** @description ID of the key you used to encrypt the secret. */
  var key_id: js.UndefOr[String] = js.undefined
}
object `163` {
  
  inline def apply(): `163` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`163`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `163`] (val x: Self) extends AnyVal {
    
    inline def setEncrypted_value(value: String): Self = StObject.set(x, "encrypted_value", value.asInstanceOf[js.Any])
    
    inline def setEncrypted_valueUndefined: Self = StObject.set(x, "encrypted_value", js.undefined)
    
    inline def setKey_id(value: String): Self = StObject.set(x, "key_id", value.asInstanceOf[js.Any])
    
    inline def setKey_idUndefined: Self = StObject.set(x, "key_id", js.undefined)
  }
}
