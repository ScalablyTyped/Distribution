package typings.node.cryptoMod

import typings.node.Buffer
import typings.node.nodeStrings.pkcs1
import typings.node.nodeStrings.pkcs8
import typings.node.nodeStrings.sec1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivateKeyInput extends StObject {
  
  var format: js.UndefOr[KeyFormat] = js.native
  
  var key: String | Buffer = js.native
  
  var passphrase: js.UndefOr[String | Buffer] = js.native
  
  var `type`: js.UndefOr[pkcs1 | pkcs8 | sec1] = js.native
}
object PrivateKeyInput {
  
  @scala.inline
  def apply(key: String | Buffer): PrivateKeyInput = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKeyInput]
  }
  
  @scala.inline
  implicit class PrivateKeyInputMutableBuilder[Self <: PrivateKeyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: KeyFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassphrase(value: String | Buffer): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    
    @scala.inline
    def setType(value: pkcs1 | pkcs8 | sec1): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
