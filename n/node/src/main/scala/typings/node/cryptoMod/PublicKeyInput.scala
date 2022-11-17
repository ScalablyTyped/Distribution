package typings.node.cryptoMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKeyInput extends StObject {
  
  var format: js.UndefOr[KeyFormat] = js.undefined
  
  var key: String | Buffer
  
  var `type`: js.UndefOr["pkcs1" | "spki"] = js.undefined
}
object PublicKeyInput {
  
  inline def apply(key: String | Buffer): PublicKeyInput = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyInput]
  }
  
  extension [Self <: PublicKeyInput](x: Self) {
    
    inline def setFormat(value: KeyFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: "pkcs1" | "spki"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
