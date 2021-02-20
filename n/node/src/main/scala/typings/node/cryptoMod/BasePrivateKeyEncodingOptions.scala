package typings.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasePrivateKeyEncodingOptions[T /* <: KeyFormat */] extends StObject {
  
  var cipher: js.UndefOr[String] = js.native
  
  var format: T = js.native
  
  var passphrase: js.UndefOr[String] = js.native
}
object BasePrivateKeyEncodingOptions {
  
  @scala.inline
  def apply[T /* <: KeyFormat */](format: T): BasePrivateKeyEncodingOptions[T] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePrivateKeyEncodingOptions[T]]
  }
  
  @scala.inline
  implicit class BasePrivateKeyEncodingOptionsMutableBuilder[Self <: BasePrivateKeyEncodingOptions[_], T /* <: KeyFormat */] (val x: Self with BasePrivateKeyEncodingOptions[T]) extends AnyVal {
    
    @scala.inline
    def setCipher(value: String): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCipherUndefined: Self = StObject.set(x, "cipher", js.undefined)
    
    @scala.inline
    def setFormat(value: T): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
  }
}
