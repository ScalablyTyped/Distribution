package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KvCodec[T] extends StObject {
  
  def decode(k: T): T
  
  def encode(k: T): T
}
object KvCodec {
  
  inline def apply[T](decode: T => T, encode: T => T): KvCodec[T] = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[KvCodec[T]]
  }
  
  extension [Self <: KvCodec[?], T](x: Self & KvCodec[T]) {
    
    inline def setDecode(value: T => T): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    inline def setEncode(value: T => T): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
  }
}
