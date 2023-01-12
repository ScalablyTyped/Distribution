package typings.multiformats.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Decode[Base /* <: String */, Prefix /* <: String */] extends StObject {
  
  def decode(input: String): js.typedarray.Uint8Array
  
  def encode(bytes: js.typedarray.Uint8Array): String
  
  var name: Base
  
  var prefix: Prefix
}
object Decode {
  
  inline def apply[Base /* <: String */, Prefix /* <: String */](
    decode: String => js.typedarray.Uint8Array,
    encode: js.typedarray.Uint8Array => String,
    name: Base,
    prefix: Prefix
  ): Decode[Base, Prefix] = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decode[Base, Prefix]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Decode[?, ?], Base /* <: String */, Prefix /* <: String */] (val x: Self & (Decode[Base, Prefix])) extends AnyVal {
    
    inline def setDecode(value: String => js.typedarray.Uint8Array): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    inline def setEncode(value: js.typedarray.Uint8Array => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    
    inline def setName(value: Base): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
  }
}
