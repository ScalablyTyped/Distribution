package typings.node.cryptoMod

import typings.node.bufferMod.global.Buffer
import typings.node.nodeStrings.pkcs1
import typings.node.nodeStrings.pkcs8
import typings.node.nodeStrings.sec1
import typings.node.nodeStrings.spki
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyExportOptions[T /* <: KeyFormat */] extends StObject {
  
  var cipher: js.UndefOr[String] = js.undefined
  
  var format: T
  
  var passphrase: js.UndefOr[String | Buffer] = js.undefined
  
  var `type`: pkcs1 | spki | pkcs8 | sec1
}
object KeyExportOptions {
  
  inline def apply[T /* <: KeyFormat */](format: T, `type`: pkcs1 | spki | pkcs8 | sec1): KeyExportOptions[T] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyExportOptions[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyExportOptions[?], T /* <: KeyFormat */] (val x: Self & KeyExportOptions[T]) extends AnyVal {
    
    inline def setCipher(value: String): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
    
    inline def setCipherUndefined: Self = StObject.set(x, "cipher", js.undefined)
    
    inline def setFormat(value: T): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setPassphrase(value: String | Buffer): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    
    inline def setType(value: pkcs1 | spki | pkcs8 | sec1): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
