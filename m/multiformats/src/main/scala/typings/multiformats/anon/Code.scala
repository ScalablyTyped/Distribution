package typings.multiformats.anon

import typings.multiformats.mod.digest.Digest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code extends StObject {
  
  var code: Double
  
  def digest(input: js.typedarray.Uint8Array): Digest[typings.multiformats.multiformatsNumbers.`0`, Double]
  
  def encode(input: js.typedarray.Uint8Array): js.typedarray.Uint8Array
  
  var name: String
}
object Code {
  
  inline def apply(
    code: Double,
    digest: js.typedarray.Uint8Array => Digest[typings.multiformats.multiformatsNumbers.`0`, Double],
    encode: js.typedarray.Uint8Array => js.typedarray.Uint8Array,
    name: String
  ): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], digest = js.Any.fromFunction1(digest), encode = js.Any.fromFunction1(encode), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  extension [Self <: Code](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDigest(value: js.typedarray.Uint8Array => Digest[typings.multiformats.multiformatsNumbers.`0`, Double]): Self = StObject.set(x, "digest", js.Any.fromFunction1(value))
    
    inline def setEncode(value: js.typedarray.Uint8Array => js.typedarray.Uint8Array): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
