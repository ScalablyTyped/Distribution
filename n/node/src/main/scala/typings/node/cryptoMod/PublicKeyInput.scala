package typings.node.cryptoMod

import typings.node.Buffer
import typings.node.nodeStrings.pkcs1
import typings.node.nodeStrings.spki
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKeyInput extends StObject {
  
  var format: js.UndefOr[KeyFormat] = js.native
  
  var key: String | Buffer = js.native
  
  var `type`: js.UndefOr[pkcs1 | spki] = js.native
}
object PublicKeyInput {
  
  @scala.inline
  def apply(key: String | Buffer): PublicKeyInput = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyInput]
  }
  
  @scala.inline
  implicit class PublicKeyInputMutableBuilder[Self <: PublicKeyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: KeyFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: pkcs1 | spki): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
