package typings.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonWebKeyInput extends StObject {
  
  var format: "jwk"
  
  var key: JsonWebKey
}
object JsonWebKeyInput {
  
  inline def apply(key: JsonWebKey): JsonWebKeyInput = {
    val __obj = js.Dynamic.literal(format = "jwk", key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonWebKeyInput]
  }
  
  extension [Self <: JsonWebKeyInput](x: Self) {
    
    inline def setFormat(value: "jwk"): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setKey(value: JsonWebKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
