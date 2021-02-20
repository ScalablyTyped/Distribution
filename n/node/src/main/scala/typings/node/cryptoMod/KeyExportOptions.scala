package typings.node.cryptoMod

import typings.node.Buffer
import typings.node.nodeStrings.pkcs1
import typings.node.nodeStrings.pkcs8
import typings.node.nodeStrings.sec1
import typings.node.nodeStrings.spki
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyExportOptions[T /* <: KeyFormat */] extends StObject {
  
  var cipher: js.UndefOr[String] = js.native
  
  var format: T = js.native
  
  var passphrase: js.UndefOr[String | Buffer] = js.native
  
  var `type`: pkcs1 | spki | pkcs8 | sec1 = js.native
}
object KeyExportOptions {
  
  @scala.inline
  def apply[T /* <: KeyFormat */](format: T, `type`: pkcs1 | spki | pkcs8 | sec1): KeyExportOptions[T] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyExportOptions[T]]
  }
  
  @scala.inline
  implicit class KeyExportOptionsMutableBuilder[Self <: KeyExportOptions[_], T /* <: KeyFormat */] (val x: Self with KeyExportOptions[T]) extends AnyVal {
    
    @scala.inline
    def setCipher(value: String): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCipherUndefined: Self = StObject.set(x, "cipher", js.undefined)
    
    @scala.inline
    def setFormat(value: T): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassphrase(value: String | Buffer): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    
    @scala.inline
    def setType(value: pkcs1 | spki | pkcs8 | sec1): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
